package socialMedia;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Post {

    private String body;
    final String dateTime;

    public Post(String dateTime) {
        this.dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMM dd,yyyy | hh:mm a"));
    }

    public String getDateTime() {
        return dateTime;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }


}
