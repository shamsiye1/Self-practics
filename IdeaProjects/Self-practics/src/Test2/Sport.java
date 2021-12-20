package Test2;

public class Sport {

String name;
int numOfPlayers;
boolean teamBased;

public void makeSport(String nameOfSport, int players, boolean teams){
    name=nameOfSport;
    numOfPlayers=players;
    teamBased=teams;

}
public String toString(){
    return "the sport is "+name+" and has "+numOfPlayers+" players in teams: "+teamBased;
}

    public static void main(String[] args) {
        Sport soc=new Sport();
        soc.makeSport("Soccer",22, true);
        System.out.println(soc);
}

}
