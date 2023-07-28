package arrays;

import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args){
        /*
        Declaration of array
        int[][] variable_name = new int[3][2];
        Assign Value
        arr[0][0] = 50;
         */

        int[][] arr = new int[3][2];
        arr[0][0] = 45;
        arr[0][1] = 78;
        arr[1][0] = 38;
        arr[1][1] = 98;
        arr[2][0] = 20;
        arr[2][1] = 58;

        //Nested for loop
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
