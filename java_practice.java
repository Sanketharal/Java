import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class java_practice {


    static void sortarr(int[] arr){
       Arrays.sort(arr);
       
    }
     public static void main(String args[]){
       
        int arr[]={2,5,1,8,3,7,1};
        sortarr(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        // array are dynamic so we no need to take array in function it is dynamcially updated in original array


        // System.out.println("hello world");
        // int x=10;
        // final int y=20;
        //  x=24;
         
        // System.out.println(x);


        // ********************************************************
        // write code for take input in java
        // ********************************************************
        //  Scanner sc=new Scanner(System.in);
        //  System.out.println("Enter a number"+"here");
        //  int number=sc.nextInt();
        //  System.out.println("your number is:"+number);

        // java practice

        // Float num=30.23f;
        // if(num instanceof Float){
        //     System.out.println("num is a float");
        // }
        // else{
        //     System.out.println("not a float");
        // }
     }
    
}