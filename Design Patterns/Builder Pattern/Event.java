import java.util.ArrayList;
import java.util.List;

public class Event {
    private List<Player> players = new ArrayList<Player>();

    public void addPlayer(Player player){
        players.add(player);
    }

    public int getMembers(){
        int members = 0;
        for (Player player : players) {
            members += player.otherMember();
        }
        return members;
    }

    public void showDetails(){

        for (Player player : players) {
            System.out.print("Player: " + player.name());
            System.out.print(", Region : " + player.region().connect());
            System.out.println(", Number of Other Members : " + player.otherMember());
        }
    }
}