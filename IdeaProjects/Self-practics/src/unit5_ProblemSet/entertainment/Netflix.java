package unit5_ProblemSet.entertainment;

public final class Netflix extends Streaming{

    String showName;
    int episodeNumber;
    int seasonNumber;

    public Netflix( String company, double duration, String showName, int episodeNumber, int seasonNumber) {
        super("Netflix",duration);

        this.episodeNumber=episodeNumber;
        this.seasonNumber=seasonNumber;
        this.showName=showName;
    }
}
