package unit5_ProblemSet.seasons;

public class Season {
    String name;
    double highestAveTemp;
    double lowestAveTemp;

    public Season(String name, double highestAveTemp, double lowestAveTemp){

        this.name=name;
        this.highestAveTemp=highestAveTemp;
        this.lowestAveTemp=lowestAveTemp;

    }

    public void activity(){

        System.out.println(name+" is good time to activity");
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", highestAveTemp=" + highestAveTemp +
                ", lowestAveTemp=" + lowestAveTemp +
                '}';
    }
}
