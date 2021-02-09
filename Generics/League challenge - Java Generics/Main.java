public class Main {
    public static void main(String[] args) {
        FootballPlayer iulian = new FootballPlayer("Iulian");
        TennisPlayer halep = new TennisPlayer("Halep");
        SoccerPlayer ronaldo = new SoccerPlayer("Ronaldo");

        Team<FootballPlayer> footballTeam = new Team("UB");
        footballTeam.addPlayer(iulian);

        Team<TennisPlayer> tennisTeam = new Team<>("CSMB");
        tennisTeam.addPlayer(halep);

        Team<SoccerPlayer> realMadrid = new Team<>("Real Madrid");
        realMadrid.addPlayer(ronaldo);
        Team<SoccerPlayer> barcelona = new Team<>("Barcelona");
        barcelona.addPlayer(new SoccerPlayer("Messi"));
        Team<SoccerPlayer> fcsb = new Team<>("FCSB");
        fcsb.addPlayer(new SoccerPlayer("Man"));


        realMadrid.matchResult(barcelona, 3, 0);
        realMadrid.matchResult(fcsb, 0, 2);
        barcelona.matchResult(fcsb, 1, 1);

        League<Team<SoccerPlayer>> championsLeague = new League<>("Champions League");
        championsLeague.add(realMadrid);
        championsLeague.add(barcelona);
        championsLeague.add(fcsb);

        championsLeague.showLeagueTable();
    }
}
