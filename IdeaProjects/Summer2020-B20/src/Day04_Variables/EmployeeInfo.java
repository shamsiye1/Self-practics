package Day04_Variables;

public class EmployeeInfo {
    public static void main( String [] args){
        String firstName= "Zilnaz";
        String lastName= "Meradel";
        String gender="Female";
        Byte age= 22;
        String companyName= "google";
        String jobTitle= "CEO";
        boolean isFullTime= true;
        boolean isMarried= false;
        double salary= 500_000;
        String fullName= firstName+" "+lastName;

        System.out.println("Full Name: "+firstName+" "+lastName+", "+"Gender: "+ gender+ ", "+ "Age: "+age+ ", "+"Company Name: "+ companyName+ ", "+ "Job Title: "+ jobTitle+ ", "+ "Is Full Time: "+ isFullTime+ ", "+"Is Married: "+ isMarried+ ", "+ "Salary: "+ salary
        );
        System.out.println(firstName+" "+lastName+ "' "+ "Gender is: "+gender);
        System.out.println(firstName+" "+lastName+"' "+ "age is:"+age+" years old");
        System.out.println(firstName+" "+lastName+ "works at: "+companyName);
        System.out.println(firstName+" "+lastName+"' "+ "Job Title is: "+jobTitle);
        System.out.println(firstName+" "+lastName+ "' "+ "Salary is: "+ salary+ "$");
        System.out.println(firstName+" "+lastName+" is full time employee: "+ isFullTime);
        System.out.println(firstName+" "+lastName+" is married: "+ isMarried);








    }











}
