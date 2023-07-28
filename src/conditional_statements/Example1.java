package conditional_statements;

import java.util.Scanner;

public class Example1 {
    public static void main(String args[]) {
        String month;
        Scanner in= new Scanner(System.in);
        month=in.next();
        switch (month) {
            case "jan":
            case "mar":
            case "may":
            case "jul":
            case "aug":
            case "oct":
            case "dec":
                System.out.println(31);
                break;
            case "apr":
            case "jun":
            case "sep":
            case "nov":
                System.out.println(30);
                break;
            case "feb":
                System.out.println(28);
                break;
            default:
                System.out.println("Wrong value");
        }
    }
}
