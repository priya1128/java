package conditional_statements;

import java.util.Scanner;

public class IfElse {
    public static void main(String args[]){
        int a,b;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the value for a: ");
        a = in.nextInt();
        System.out.println("Enter the value for b: ");
        b = in.nextInt();
        if(a>b){
            System.out.println("A is bigger");
        }
        else{
            System.out.println("B is bigger");
        }
    }
}
