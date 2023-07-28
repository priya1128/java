package accessmodifiers.package2;

import accessmodifiers.package1.Class1;

import java.util.Scanner;

public class SubClass extends Class1 {
    public static void main(String[] args){
        SubClass obj = new SubClass();
        //obj.a =30;
        //obj.display();

        obj.b = 20;
        obj.display_b();

        obj.c = 20;
        obj.display_c();

        //obj.d = 20;
        //obj.display_d();

        //Scanner in = new Scanner(System.in);
        //in.nextInt();

        obj.setValueD(70);
        System.out.println(obj.getValueD());
    }
}
