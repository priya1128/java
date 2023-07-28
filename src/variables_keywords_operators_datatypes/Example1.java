package variables_keywords_operators_datatypes;

import java.util.Scanner;

public class Example1 {
    public static void main(String args[]){
        int firstNum, secondNum, ans;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value for firstNum: ");
        firstNum =  in.nextInt();
        System.out.println("Enter the value for secondNum: ");
        secondNum = in.nextInt();
        ans = firstNum+secondNum;
        System.out.println("Answer: "+ans);
    }
}
