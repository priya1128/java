package looping;

import java.util.Scanner;

/*
Armstrong number
   153 =  1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
 */
public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        int copy = num;
        int ans = 0;
        int noOfDigit = 0;
        // find the noOfDigit in the number
        while (num != 0) {
            noOfDigit++;
            num = num / 10;
        }
        // check whether it is armstrong number or not
        num = copy;
        while (num != 0) {
            int temp = num % 10;
            ans = ans + (int) Math.pow(temp, noOfDigit);
            num = num / 10;
        }
        if (ans == copy) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}
