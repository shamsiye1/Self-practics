package unit5_ProblemSet.entertainment;

public class KevinHart extends LiveShow{
    String special;
    String date;

    public KevinHart( String location, String performer, String date) {
        super( "kevin hart inc.", location);
        this.special =performer;
        this.date=date;

    }

    public KevinHart(String live_show, String disney, String usa, String good, String s) {
        super();


    }

    @Override
    public String toString() {
        return "KevinHart{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", performer='" + special + '\'' +
                ", date='" + date + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
