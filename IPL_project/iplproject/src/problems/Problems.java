package problems;

import reader.DR;
import reader.MR;


import java.util.*;
import java.util.HashMap;

public class Problems {
    public static void main(String [] args){

        MR m1=new MR();
        DR d1=new DR();




        //* number of matches played per year;
        System.out.println("number of matches played per year:---------");
        Map<Integer,Integer> t_m=new HashMap<>();

        for(int i=0;i< MR.ml.size();i++){
            if(!t_m.containsKey(MR.ml.get(i).getseason())){
                t_m.put(MR.ml.get(i).getseason(),1);
            }
            else{
                t_m.put(MR.ml.get(i).getseason(),(t_m.get(MR.ml.get(i).getseason())+1));
            }
        }
        System.out.println("total number of years: " +t_m.size());
        for(Map.Entry m : t_m.entrySet()){
            System.out.println("Year: "+m.getKey()+"  number of matches: "+m.getValue());
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        // Number of matches win by team
        System.out.println("Number of matches win by team");
        Map<String,Integer> w=new HashMap();

        for(int i=0;i<MR.ml.size();i++){
            if(MR.ml.get(i).getwinnwr()!="") {
                if (!w.containsKey(MR.ml.get(i).getwinnwr())) {
                    w.put(MR.ml.get(i).getwinnwr(), 1);
                } else {
                    w.put(MR.ml.get(i).getwinnwr(), (w.get(MR.ml.get(i).getwinnwr()) + 1));
                }
            }
        }


        System.out.println("total number of teams: " +w.size());
        for(Map.Entry m : w.entrySet()){
            System.out.println("team: "+m.getKey()+" number of times win: "+m.getValue());
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

//*year 2016 get extra runs conceded per team
        System.out.println("year 2016 get extra runs conceded per team");
        Map<String,Integer> ex=new HashMap<>();

        for(int i=0;i< MR.ml.size();i++){
            if(MR.ml.get(i).getseason()==2016){
                for(int j=0;j<DR.dl.size();j++){
                    if(MR.ml.get(i).getid()==DR.dl.get(j).getmatch_id()&&DR.dl.get(j).getextra_runs()!=0){
                        if(!ex.containsKey(DR.dl.get(j).getbatting_team())){
                            ex.put(DR.dl.get(j).getbatting_team(),DR.dl.get(j).getextra_runs());
                        }
                        else{
                            ex.put(DR.dl.get(j).getbatting_team(),(ex.get(DR.dl.get(j).getbatting_team())+DR.dl.get(j).getextra_runs()));
                        }
                    }
                }
            }
        }

        System.out.println("total number of teams: " +ex.size());
        for(Map.Entry m : ex.entrySet()){
            System.out.println("team: "+m.getKey()+" Extra runs: "+m.getValue());
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        //for the year of 2015 top economical bowler
        System.out.println("for the year of 2015 top economical bowler");
        Map<String,Integer> tb=new TreeMap<>();
        Map<String,Integer> tr=new TreeMap<>();
        TreeMap<Float,String> ec=new TreeMap<>();


        for(int j=0;j<MR.ml.size();j++) {
            if(MR.ml.get(j).getseason()==2015) {

                for (int i = 0; i < DR.dl.size(); i++) {
                    if(MR.ml.get(j).getid()==DR.dl.get(i).getmatch_id()) {
                        if (!tb.containsKey(DR.dl.get(i).getbowler())) {
                            tb.put(DR.dl.get(i).getbowler(), 1);
                            tr.put(DR.dl.get(i).getbowler(), DR.dl.get(i).gettotal_runs());
                        } else {
                            tb.put(DR.dl.get(i).getbowler(), (tb.get(DR.dl.get(i).getbowler()) + 1));
                            tr.put(DR.dl.get(i).getbowler(), (tb.get(DR.dl.get(i).getbowler()) + DR.dl.get(i).gettotal_runs()));
                        }
                        float over = tb.get(DR.dl.get(i).getbowler()) / 6f;
                        float runs = tr.get(DR.dl.get(i).getbowler());
                        float ecnomi = runs / over;
                        if(ecnomi!=0) {
                            ec.put(ecnomi, DR.dl.get(i).getbowler());
                        }
                    }
                }
            }
        }



        System.out.println("economical bowler:  "+ec.firstEntry());
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();







        //Total runs of each player in ipl
        System.out.println("Total runs of each player in ipl");
        Map<String,Integer> rn=new HashMap<>();

        for(int i=0;i<DR.dl.size();i++){
            if(!rn.containsKey(DR.dl.get(i).getbatsman())){
                rn.put(DR.dl.get(i).getbatsman(),DR.dl.get(i).getbatsman_runs());
            }
            else{
                rn.put(DR.dl.get(i).getbatsman(),( rn.get(DR.dl.get(i).getbatsman())+DR.dl.get(i).getbatsman_runs()));
            }
        }

        System.out.println("total number of players: " +rn.size());
        for(Map.Entry m : rn.entrySet()){
            System.out.println("Player_name: "+m.getKey()+" Total runs: "+m.getValue());
        }


    }
}
