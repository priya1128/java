package conditional_statements;

import java.util.Scanner;

public class ElseIf {
    public static void main(String args[]) {
        int a,b,c;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the value for a: ");
        a = in.nextInt();
        System.out.println("Enter the value for b: ");
        b = in.nextInt();
        System.out.println("Enter the value for c: ");
        c = in.nextInt();

        if(a>b && a>c){
            System.out.println("A is bigger");
        }
        else if(b>a && b>c){
            System.out.println("B is bigger");
        }
        else{
            System.out.println("C is bigger");
        }
    }
}
