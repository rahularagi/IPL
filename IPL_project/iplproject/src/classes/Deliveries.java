package classes;

public class Deliveries {
    int match_id;
    int inning;
    String  batting_team;
    String bowling_team;
    int over;
    int ball;
    String batsman;
    String non_striker;
    String bowler;
    int is_super_over;
    int wide_runs;
    int bye_runs;
    int legbye_runs;
    int noball_runs;
    int penalty_runs;
    int batsman_runs;
    int extra_runs;
    int total_runs;
    String player_dismissed;
    String dismissal_kind;
    String fielder;

//Setter methods
    public void setmatch_id(int x){
      this.match_id=x;
    }
    public void setinning(int x){
        this.inning=x;
    }

    public void setbatting_team(String s){
        this.batting_team=s;
    }

    public void setbowling_team(String s){
        this.bowling_team=s;
    }
    public void setover(int x){
        this.over=x;
    }

    public void setball(int x){
        this.ball=x;
    }

    public void setbatsman(String s){
        this.batsman=s;
    }

    public void setnon_striker(String s){
        this.non_striker=s;
    }

    public void setbowler(String s){
        this.bowler=s;
    }

    public void setis_super_over(int x){
        this.is_super_over=x;
    }

    public void setwide_runs(int x){
        this.wide_runs=x;
    }

    public void setbye_runs(int x){
        this.bye_runs=x;
    }

    public void setlegbye_runs(int x){
        this.legbye_runs=x;
    }
    public void setnoball_runs(int x){
        this.noball_runs=x;
    }

    public void setpenalty_runs(int x){
        this.penalty_runs=x;
    }

    public void setbatsman_runs(int x){
        this.batsman_runs=x;
    }

    public void setextra_runs(int x){
        this.extra_runs=x;
    }

    public void settotal_runs(int x){
        this.total_runs=x;
    }

    public void setplayer_dismissed(String s){
        this.player_dismissed=s;
    }

    public void setdismissal_kind(String s){
        this.dismissal_kind=s;
    }

    public void setfielder(String s){
        this.fielder=s;
    }
//*************
 // getter method
    // **********

    public int getmatch_id(int x){
        return this.match_id;
    }
    public int getinning(int x){
        return this.inning;
    }

    public String getbatting_team(String s){
        return this.batting_team;
    }

    public String getbowling_team(String s){
        return this.bowling_team;
    }
    public int getover(int x){
        return this.over;
    }

    public int getball(int x){
        return this.ball;
    }

    public String getbatsman(String s){
        return this.batsman;
    }

    public String getnon_striker(String s){
        return this.non_striker;
    }

    public String getbowler(String s){
        return this.bowler;
    }

    public int getis_super_over(int x){
        return this.is_super_over;
    }

    public int getwide_runs(int x){
        return this.wide_runs;
    }

    public int getbye_runs(int x){
        return this.bye_runs;
    }

    public int getlegbye_runs(int x){
        return this.legbye_runs;
    }
    public int getnoball_runs(int x){
        return this.noball_runs;
    }

    public int getpenalty_runs(int x){
        return this.penalty_runs;
    }

    public int getbatsman_runs(int x){
        return this.batsman_runs;
    }

    public int getextra_runs(int x){
        return this.extra_runs;
    }

    public int gettotal_runs(int x){
        return this.total_runs;
    }

    public String getplayer_dismissed(String s){
        return this.player_dismissed;
    }

    public String getdismissal_kind(String s){
        return this.dismissal_kind;
    }

    public String getfielder(String s){
        return this.fielder;
    }


}
