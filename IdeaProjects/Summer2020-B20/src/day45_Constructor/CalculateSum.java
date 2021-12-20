package day45_Constructor;

public class CalculateSum {

    public CalculateSum(int a, int b){
        System.out.println(a+b);
    }

    public CalculateSum( double a , double b){
        System.out.println(a+ b);
    }

  public CalculateSum(Integer a, Integer b){
      System.out.println( a+ b);
  }

  public CalculateSum(double a, double b, double c){
      System.out.println(a+b+c);

    }

    public static void main(String[] args) {

        new CalculateSum(10,20);
        new CalculateSum(1.5,2.8);
        new CalculateSum(11,12,8);

    }

}
