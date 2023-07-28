package accessmodifiers.package1;

public class SubClass extends Class1 {
    public static void main(String[] args){
        SubClass obj = new SubClass();
        obj.a =30;
        obj.display_a();

        obj.b = 20;
        obj.display_b();

        obj.c = 20;
        obj.display_c();

        //obj.d = 20;
        //obj.display_d();

        obj.setValueD(70);
        System.out.println(obj.getValueD());
    }
}
