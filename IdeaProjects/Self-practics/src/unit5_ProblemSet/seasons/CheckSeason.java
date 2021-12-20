package unit5_ProblemSet.seasons;

public class CheckSeason {
    public static void main(String[] args) {

        Winter winter= new Winter("winter",-10,-29);

        Fall fall=new Fall("fall",5,15);

        Summer summer= new Summer("summer",20.3,40);

        Spring spring= new Spring("spring",8,19.5);

        fall.activity();
        summer.activity();
        spring.activity();
        winter.activity();
        System.out.println(fall);
        System.out.println(summer);
        System.out.println(spring);
        System.out.println(winter);


    }
}
