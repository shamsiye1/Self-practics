package socialMedia;

public abstract class SocialMedia {

    public abstract void directMessaging(String userName, String message);

    public abstract void post(String body);

    public abstract void notifications();

    String personalUrl;
    int accountLength;
    static String platform;


}
