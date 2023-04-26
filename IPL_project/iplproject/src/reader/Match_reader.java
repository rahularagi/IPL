package reader;

import classes.Match;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Match_reader {
    public static List<Match> ml= new ArrayList<>();
static public void read_m(String [] s){

    Match m=new Match();

      m.setid(Integer.parseInt(s[0]));

     m.setseason(Integer.parseInt(s[1]));

     m.setcity(s[2]);

    m.setdate(s[3]);

    m.setteam1(s[4]);
    m.setteam2(s[5]);

    m.settoss_winner(s[6]);
    m.settoss_decision(s[7]);
    m.setresult(s[8]);
    m.setdl_applied(Integer.parseInt(s[9]));
    m.setwinnwr(s[10]);

   m.setwin_by_runs(Integer.parseInt(s[11]));
    m.setwin_by_wickets(Integer.parseInt(s[12]));
   m.setplayer_of_match(s[13]);
    m.setvenue(s[14]);
    m.setumpire1(s[15]);
    m.setumpire2(s[16]);
    m.setumpire3(s[17]);

    ml.add(m);

}
    public static void main (String [] args){

        String file ="src//matches.csv";
        BufferedReader reader=null;
        String line="";

        try{
            reader=new BufferedReader(new FileReader(file));
            reader.readLine();
            while((line=reader.readLine()) != null){
                String [] row=line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);

              read_m(row);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally{
           try{
               reader.close();
           }
           catch(IOException e){
               e.printStackTrace();
            }
        }

        for (int i=0;i<ml.size();i++){
            System.out.println((i+1)+". "+ml.get(i).getid()+"  "+ml.get(i).getseason()+" "+ml.get(i).getcity());
        }
    }
}

