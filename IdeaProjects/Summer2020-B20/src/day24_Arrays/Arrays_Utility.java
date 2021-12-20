package day24_Arrays;
import java.util.Arrays;
public class Arrays_Utility {
    public static void main(String[] args) {
int[] arr = {1,2,2,4,5,8};
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        String s1= Arrays.toString(arr);

        System.out.println(s1);

        String[] names={"muhtar","samin","asiye","kuzzat"};
        System.out.println(names);  // in order to print arrays variable we must convert it to string
        System.out.println(Arrays.toString(names));
        int[] nums= {1,5,4,5,6,2,8};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("maximum number: "+ nums[nums.length-1]);
        System.out.println("Minimum number: "+nums[0]);

String students[] ={"muhtar","samin","asiye","kuzzat"};
Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println("====================================");

int[] arr1= {1,2,2,3};
int[] arr2= {1,22,3};
boolean r1= Arrays.equals(arr1,arr2);
        System.out.println(r1);
        int[] arr3= {1,2,3,2};


        Arrays.sort(arr1);
        Arrays.sort(arr3);
        boolean r2= Arrays.equals(arr1,arr3);
        System.out.println(r2);





























































    }

































































}
