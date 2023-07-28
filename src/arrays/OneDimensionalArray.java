package arrays;

import java.util.Scanner;

public class OneDimensionalArray {
    public static void main(String[] args){
        /*
        Array -> used to store similar datatype elements
        while declaring it, you should provide the size/length
        Declaration of array
        int[] variable_name = new int[5];
        Assign Value
        arr[0] = 50;

           Exception
           -------------
           ArrayIndexOutOfBoundsException
         */

        int[] arr =  new int[5];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the value for index: "+i);
            arr[i] = in.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        int a[] = {10,54,12,20,9};
        //traversing array -> through index
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        //traversing array -> through foreach loop
        for(int item:a){
            System.out.println(item);
        }
    }
}
