package pl.krzysiekgl;

public class Main {

    public static void main(String[] args) {
        League<PaintballTeam> leaguePaint = new League<>();
        leaguePaint.addTeamToLeague(new PaintballTeam("TuxPaint", 999));
        leaguePaint.addTeamToLeague(new PaintballTeam("MS_Paint", 98));
        leaguePaint.addTeamToLeague(new PaintballTeam("Crita", 128));
        leaguePaint.addTeamToLeague(new PaintballTeam("GNU/Gimp", 897));
        
        leaguePaint.listAllTeamsInLeague();
        leaguePaint.test();
    }
}
