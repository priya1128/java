package accessmodifiers.package2;

import accessmodifiers.package1.Class1;

public class NonSubClass {
    public static void main(String[] args){
        Class1 obj = new Class1();
        //obj.a =10;
        //obj.display();

        obj.b = 20;
        obj.display_b();

        //obj.c = 20;
        //obj.display_c();

        //obj.d = 20;
        //obj.display_d();

        obj.setValueD(70);
        System.out.println(obj.getValueD());
    }
}
