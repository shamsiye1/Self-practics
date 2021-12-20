package unit5_ProblemSet.AdvanceClass;

import unit5_ProblemSet.AdvanceClass.File;

import java.nio.file.Files;
import java.util.ArrayList;

public class Module {

    ArrayList<File> files;  // reference

    public Module(){  // no parameter, create empty ArrayList object
       this.files= new ArrayList<>();

    }

    public Module(ArrayList<File>files){

        this();
        this.files.addAll(files); // initialize with given ArrayList of Files  using chaining.

    }


    @Override
    public String toString() {
        return "Module{" +
                "files=" + files +
                '}';
    }

    public void addFile(File File){

        files.add(File);
    }

    public void removeFile(File File){


    }


}
