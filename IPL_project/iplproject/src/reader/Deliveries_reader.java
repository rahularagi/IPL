package reader;

import classes.Deliveries;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Deliveries_reader {
    static public List<Deliveries> dl=new ArrayList ();
    static public void read_d(String [] s){
        Deliveries d=new Deliveries();

        d.setmatch_id(Integer.parseInt(s[0]));

        d.setinning(Integer.parseInt(s[1]));

        d.setbatting_team(s[2]);

        d.setbowling_team(s[3]);

        d.setover(Integer.parseInt(s[4]));

        d.setball(Integer.parseInt(s[5]));

        d.setbatsman(s[6]);

        d.setnon_striker(s[7]);

        d.setbowler(s[8]);

        d.setis_super_over(Integer.parseInt(s[9]));

        d.setwide_runs(Integer.parseInt(s[10]));

        d.setbye_runs(Integer.parseInt(s[11]));

        d.setlegbye_runs(Integer.parseInt(s[12]));
        d.setnoball_runs(Integer.parseInt(s[13]));

        d.setpenalty_runs(Integer.parseInt(s[14]));

        d.setbatsman_runs(Integer.parseInt(s[15]));

        d.setextra_runs(Integer.parseInt(s[16]));

        d.settotal_runs(Integer.parseInt(s[17]));

        d.setplayer_dismissed(s[18]);

        d.setdismissal_kind(s[19]);

        d.setfielder(s[20]);

        dl.add(d);
    }

    public static void main(String[] args){

        String file="src//deliveries.csv";
        BufferedReader reader=null;
        String line="";

        try{
            reader=new BufferedReader(new FileReader(file));
            reader.readLine();
            while((line= reader.readLine()) !=null){
                String [] row=line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);

                read_d(row);
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

        for(int i=0;i<dl.size();i++){
            System.out.println((i+1)+"  "+dl.get(i).getmatch_id()+"  "+dl.get(i).getinning()+" "+dl.get(i).getbatting_team()+" "+dl.get(i).getbowling_team());
        }

        Map<String,Integer> ex=new HashMap<>();

        for (int i=0)


    }
}
