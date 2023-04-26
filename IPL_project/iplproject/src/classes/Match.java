package classes;

public class Match {
    int id;
    int season;
    String city;
    String date;
    String team1;
    String team2;
    String toss_winner;
    String toss_decision;
    String result;
    int dl_applied;
    String winner;
    int win_by_runs;
    int win_by_wickets;
    String player_of_match;
    String venue;
    String umpire1;
    String umpire2;
    String umpire3;

    /********
     * setters method
     */

    public void setid(int x){
        this.id=x;
    }

    public void setseason(int x){
        this.season=x;
    }
    public void setcity(String s){
        this.city=s;
    }
    public void setdate(String s){
        this.date=s;
    }

    public void setteam1(String s){
        this.team1=s;
    }

    public void setteam2(String s){
        this.team2=s;
    }

    public void settoss_winner(String s){
        this.toss_winner=s;
    }

    public void settoss_decision(String s){
        this.toss_decision=s;
    }

    public void setresult(String s){
        this.result=s;
    }

    public void setdl_applied(int x){
        this.dl_applied=x;
    }

    public void setwinnwr(String s){
        this.winner=s;
    }
    public void setwin_by_runs(int x){
        this.win_by_runs=x;
    }

    public void setwin_by_wickets(int x){
        this.win_by_wickets=x;
    }

    public void setplayer_of_match(String s){
        this.player_of_match=s;
    }

    public void setvenue(String s){
        this.venue=s;
    }

    public void setumpire1(String s){
        this.umpire1=s;
    }
    public void setumpire2(String s){
        this.umpire2=s;
    }
    public void setumpire3(String s){
        this.umpire3=s;
    }

    /********
     * gettes method
     */


    public int getid(){
       return this.id;
    }

    public int getseason(){
        return this.season;
    }
    public String getcity(){
        return this.city;
    }
    public String getdate(){
        return this.date;
    }

    public String getteam1(){
        return this.team1;
    }

    public String getteam2(){
        return this.team2;
    }

    public String gettoss_winner(){
        return this.toss_winner;
    }

    public String gettoss_decision(){
        return this.toss_decision;
    }

    public String getresult(){
        return this.result;
    }

    public int getdl_applied(){
        return this.dl_applied;
    }

    public String getwinnwr(){
        return this.winner;
    }
    public int getwin_by_runs(){
        return this.win_by_runs;
    }

    public int getwin_by_wickets(){
        return this.win_by_wickets;
    }

    public String getplayer_of_match(){
        return this.player_of_match;
    }

    public String getvenue(){
        return this.venue;
    }

    public String getumpire1(){
        return this.umpire1;
    }
    public String getumpire2(){
        return this.umpire2;
    }
    public String getumpire3(){
        return this.umpire3;
    }
}
