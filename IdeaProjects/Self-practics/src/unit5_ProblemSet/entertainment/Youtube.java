package unit5_ProblemSet.entertainment;

import java.util.ArrayList;

public class Youtube extends Streaming{

    String videoName;
    String channelName;
    int viewCount;
    ArrayList<String> comments;


    public Youtube(String name, String company, double duration, String videoName, String channelName, int viewCount,  ArrayList<String> comments) {
        super(name, company, duration);

        this.channelName=channelName;
        this.comments=comments;
        this.videoName=videoName;
        this.viewCount=viewCount;


    }
}
