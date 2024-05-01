package exercise;

public class Soccer extends Sport{
    @Override
    String getName(){
        return "Soccer Class";
    }
    @Override
    void getNumberOfTeamMember(){
        System.out.println("Each team has 11 players in" + getName());
    }
}
