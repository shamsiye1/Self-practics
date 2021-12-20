package unit5_ProblemSet.entertainment;

public class Streaming extends Entertainment {

    double duration;


    public Streaming(String name, String company, double duration) {
        super("Streaming", company); // name being hard code
        this.duration = duration;

    }



    public Streaming(String company, double duration) {
        super();

    }
}
