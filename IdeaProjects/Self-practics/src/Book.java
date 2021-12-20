public class Book {

    static String author="j.k";

    static {
        author="s king";
    }

    public static void main(String[] args) {

        Book b1=new Book();
        b1.author="c p";
        Book b2= new Book();
        System.out.println(b1.author.equals(b2.author));




    }


}
