package exception_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.UncheckedIOException;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
 int arr[] = new int[2];
 arr[0] = 10;
 arr[1] = 20;
 arr[2] = 6;
 for(int i=0;i<arr.length;i++){
     System.out.println(arr[i]);
 }
 //ArrayIndexOutOfBoundException
 */
        /*
        int a = 0;
        int b = 10;
        int c = b/a;
        System.out.println(c);
        //ArithmeticException
         */
        /*
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        //InputMismatchException
        */
        /*
        File file = new File("C:\\Users\\Naveen S\\Documents\\3F33FF_Invalid.png");
        FileInputStream fin = new FileInputStream(file);
        //FileNotFoundException
        */
public class ExceptionHandlingExample{
    /*
    try -> block where you place the exception code
    catch -> block which handles the exception
    finally -> executed everytime whether exception occurs or not
    throw -> throw an exception
    throws -> declare exception
     */
    public static void main(String[] args){
        //ThrowsExample obj  = new ThrowsExample();
        //obj.sample();
        while(true){
            Scanner in = new Scanner(System.in);
            try {
                System.out.println("Enter the value for a: ");
                int a = in.nextInt();
                System.out.println("Enter the value for b: ");
                int b = in.nextInt();
                int c = a / b;
                System.out.println(c);
                //throw(new ArrayIndexOutOfBoundsException());
            }
            catch (ArithmeticException e){
                    System.out.println("Number cannot be divided by 0");
            }
            catch (InputMismatchException e){
                System.out.println("Give proper value");
            }
            catch (Exception e ){
                System.out.println(e);
            }
            finally {
                System.out.println("Finally Executed");
            }
            System.out.println("Do you want to Continue(yes/no)");
            String status = in.next();
                if(status.equals("no")) {
                    break;
                }

        }

    }
}
