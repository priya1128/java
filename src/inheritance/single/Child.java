package inheritance.single;

/*
Inheritance - Is-A relationship
 */
//Sub-Class/Derived Class
public class Child extends Parent{
    public static void main(String args[]) {
        /*
        Aggregation
        Parent obj = new Parent();
        obj.a=7;
        obj.display();
         */
        Child obj = new Child();
        obj.display();

    }
}
