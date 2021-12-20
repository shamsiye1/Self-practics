package socialMedia;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class FacebookUser extends SocialMedia {

    private String userName;
    private String password;
    private String fullName;
    private int age;
    private int numberOfFriends;
    private ArrayList<Post> posts;
    Post post;

    static {
        System.out.println("Platform was created for facebook");
    }

    public FacebookUser(String userName, String password) {

        this.userName = userName;
        this.password = password;
        if (password.contains(userName)) {

            System.out.println("Password contained username. Default password created: 'password'");
            this.password = "password";

        }

        personalUrl = "facebook.com/" + userName;

        posts = new ArrayList<>();

    }

    public FacebookUser(String userName, String password, String fullName) {
        this(userName, password);
        this.fullName = fullName;

        if (!fullName.matches("[A-Za-z]+")) {
            System.out.println("invalid name");
            this.fullName = "no name";
        }

    }


    public FacebookUser(String userName, String password, String fullName, int age, int numberOfFriends) {
        this(userName, password, fullName);
        if (age > 0 && age < 120) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
            this.age = 0;
        }

        if (numberOfFriends > 0 && numberOfFriends < 5000) {
            this.numberOfFriends = numberOfFriends;
        } else {
            System.out.println("Invalid friend number");
            this.numberOfFriends = 0;
        }


    }

    @Override
    public void directMessaging(String userName, String message) {

        System.out.println(message + " sent to " + userName);
    }

    @Override
    public void post(String body) {
//         post = new Post();
//        posts.addAll(post);
    }

    @Override
    public void notifications() {

    }
}
