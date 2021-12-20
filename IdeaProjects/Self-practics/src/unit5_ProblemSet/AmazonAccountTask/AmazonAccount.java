package unit5_ProblemSet.AmazonAccountTask;

public class AmazonAccount {

    private String userName;
    private String email;
    private boolean hasPrime;

    public AmazonAccount(String userName, String email, boolean hasPrime) {
        this.email = email;
        this.userName = userName;
        this.hasPrime = hasPrime;

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isHasPrime() {
        return hasPrime;
    }

    public void setHasPrime(boolean hasPrime) {
        this.hasPrime = hasPrime;
    }

    @Override
    public String toString() {
        return "AmazonAccount{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", hasPrime=" + hasPrime +
                '}';
    }



}
