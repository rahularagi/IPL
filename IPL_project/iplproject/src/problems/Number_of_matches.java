package problems;
import java.util.*;
import reader.Match_reader;

import java.util.HashMap;

public class Number_of_matches {
    public static void main(String [] args){
        Map<Integer,Integer> t_m=new HashMap<>();

        for(int i=0;i< Match_reader.ml.size();i++){
            if(!t_m.containsKey(Match_reader.ml.get(i).getseason())){
                t_m.put(Match_reader.ml.get(i).getseason(),1);
            }
            else{
                t_m.put(Match_reader.ml.get(i).getseason(),(t_m.get(Match_reader.ml.get(i).getseason())+1));
            }
        }
        System.out.println("hiiiii"+t_m.size());
        for(Map.Entry m : t_m.entrySet()){
            System.out.println("Year: "+m.getKey()+" number of matches: "+m.getValue());
        }
    }
}
