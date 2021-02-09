import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(player.getName() + " is already in this team ");
            return false;
        }

        members.add(player);
        System.out.println(player.getName() + " added in team " );
        return true;
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team opponent, int ourScore, int theiScore){
        if(ourScore > theiScore) {
            won++;
        } else if(ourScore == theiScore){
            tied++;
        } else{
            lost++;
        }
        played++;
        if(opponent != null){
            opponent.matchResult(null, theiScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 3) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()) {
            return -1;
        } else if(this.ranking() < team.ranking()){
            return 1;
        } else {
            return 0;
        }
    }
}
