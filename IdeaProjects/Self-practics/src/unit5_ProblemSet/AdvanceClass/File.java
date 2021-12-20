package unit5_ProblemSet.AdvanceClass;

public class File {
    String name;
    double size;

    public File(String name, double size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }

    public void openFile() {

        System.out.println("Opening " + name);
    }


}
