package unit5_ProblemSet.seasons;

public class Spring extends Season{

    public Spring(String name, double highestAveTemp, double lowestAveTemp) {
        super(name, highestAveTemp, lowestAveTemp);
    }

    public void activity(){
        System.out.println("Go Outside");
    }

}
