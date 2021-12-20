package unit5_ProblemSet.entertainment;

public class LiveShow extends Entertainment{

    String location;


    public LiveShow(String name, String company,String location) {
        super("live show", company);
        this.location=location;

    }

    public LiveShow(String company, String location) {

    }

    public LiveShow() {

    }
}
