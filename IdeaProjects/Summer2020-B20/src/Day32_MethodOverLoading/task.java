package Day32_MethodOverLoading;

import java.util.Arrays;

public class task {

    public static void main(String[] args) {

        int[] a1={5,8,9,6};
       int[] a2= {9,8,5,65,2};
       // int[] a3=combine2int(a1,a2);
        System.out.println(Arrays.toString(combine2int(a1, a2)));
        double[] arr1= {2,5,89.6,89};
        double[] arr2= {9,6,5.2,63.52};

        System.out.println(Arrays.toString(combine2double(arr1,arr2)));

        String[] str1= {"shamsiye","patigul","mubarak","nazakat"};
        String[] str2= {"asiye","maryam"};
        String newArray[] = combine2String(str1,str2);
        Arrays.sort(newArray);
        System.out.println( Arrays.toString(newArray) );

        char[] ch1={'A','V','B'};
        char[] ch2={'m','n'};
        System.out.println(Arrays.toString(combine2char(ch1,ch2)));


    }



    public static int[] combine2int( int[] arr1, int[] arr2){
//        int[] arr1={5,8,9,6};
//        int[] arr2= {9,8,5,65,2};
        // arr 3 =>   [5, 8, 9, 6, 0,0,0,0,0]
        int[] arr3= new int[arr1.length+ arr2.length];
        for(int i= 0; i<arr1.length; i++){
            arr3[i] = arr1[i];
        }
        int j = 0;
        for(int i = arr1.length; i<arr3.length; i++){
            arr3[i]=arr2[j];
            j++;
        }

        return arr3;
    }

    public static double[] combine2double(double[] arr1, double[] arr2){

//        double[] arr1= {2,5,89.6,89};
//        double[] arr2= {9,6,5.2,63.52};
        double[] arr3= new double[arr1.length + arr2.length];
        for( int i=0; i< arr1.length; i++){
            arr3[i]= arr1[i];

        }
       int j=0;
        for(int i= arr1.length; i< arr3.length; i++){
            //int j=0;
            arr3[i]=arr2[j];
            j++;
        }
        return arr3;
    }

     public static String[] combine2String(String[] str1,String[] str2){
        // String[] str1= {"shamsiye","patigul","mubarak","nazakat"}
        // String[] str2= {"asiye","maryam"}
        String[] str3= new String[str1.length+ str2.length];
        int i=0;
        for (String each: str1){
            str3[i]= each;
            i++;
        }
        for(String each:str2){
            str3[i]=each;
            i++;
        }
       return str3;


     }

   public static char[] combine2char(char[] ch1, char[] ch2){

//        char[] ch1={'A','V','B'};
//        char[] ch2={'m','n'};
        char[] ch3= new char[ch1.length+ ch2.length];
        int i=0;
        for(char each:ch1){
            ch3[i]=each;
            i++;
        }
        for(char each:ch2){
            ch3[i] = each;
            i++;
        }
        return ch3;
   }

  }










