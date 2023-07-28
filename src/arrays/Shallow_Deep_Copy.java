package arrays;

import java.util.Arrays;

public class Shallow_Deep_Copy {
    public static void main(String[] args){
        int[] original = {23,89,20,67,50};
        int[] copy = Arrays.copyOf(original,original.length);

        System.out.println("Printing Copy array");
        for(int i= 0;i<copy.length;i++){
            System.out.print(copy[i]+" ");
        }

        copy[2] = 100;
        System.out.println("\nPrinting Copy array");
        for(int i= 0;i<copy.length;i++){
            System.out.print(copy[i]+" ");
        }

        System.out.println("\nPrinting Original array");
        for(int i= 0;i<original.length;i++){
            System.out.print(original[i]+" ");
        }
    }
}
