package arrays;

import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        /*
        Jagged Array - A array with different size i.e. different in their number of columns
         */
        int arr[][] = new int[3][];
        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[5];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
           System.out.println("For row("+i+")");
            for(int j=0;j<arr[i].length;j++){
                System.out.print("Enter the value for index("+j+")");
                arr[i][j]=in.nextInt();
           }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
