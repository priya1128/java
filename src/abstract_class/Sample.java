
package abstract_class;

public abstract class Sample {

    final int a =10;
    void display(){
        System.out.println(a);
    }
    //abstract method cannot be private or final.
    abstract void display1();
}
