package bestbuy;

import org.omg.PortableInterceptor.ServerRequestInfo;

import java.lang.reflect.Array;

public class ArrayChallenge {

    public static void main(String[] args) {

        String str = "11122";
        String str1 = "12122";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != str1.charAt(i)) {

                count++;
            }

        }
        System.out.println(count);


    }


    public int ArrayChallenge(String[] strArr) {

        //String[] strArr = {"111","112"};

//        String str = strArr[0];
//        String str1 = strArr[1];
        int count = 0;
        for (int i = 0; i < strArr[0].length(); i++) {

            if (strArr[0].charAt(i) != strArr[1].charAt(i)) {

                count++;
            }


        }
        return count;
    }






}


