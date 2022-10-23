import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Fixtures {

    private Team teams;
    private ArrayList<Integer> listOfTeams;
    private int groupSize = 4;


    public Fixtures(Team teams) {
        this.teams = teams;
    }

    public void addTeamIdentifiersToList() {
        teams.listOfTeams();
        for (int i : teams.tournamentTeams.keySet()) {
            listOfTeams.add(i);
        }
    }

    public void splitTeamsIntoGroups() {
        addTeamIdentifiersToList();
        Collections.shuffle(listOfTeams);

        for(int i=0;i<listOfTeams.size();i+=groupSize){
            System.out.println(Arrays.toString(Arrays.copyOfRange(new ArrayList[]{listOfTeams}, i, Math.min(listOfTeams.size(),i+groupSize))));
        }

    }
}
