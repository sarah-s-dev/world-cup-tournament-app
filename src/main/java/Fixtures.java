public class Fixtures {

    private Team teams;
    private Groups groups;


    public Fixtures(Team teams, Groups groups) {
        this.teams = teams;
        this.groups = groups;
    }


    public void splitTeamsIntoGroups(){
        groups.listOfGroups();
        teams.listOfTeams();
        // iterate through listOfTeams and put them into the createGroupsOfFour groups

        // e.g. groupA[0] = listOfTeams.Random
    }




}
