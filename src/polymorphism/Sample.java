package polymorphism;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class X{
    X(){

    }
}
public class Sample extends X{

    public static void main(String[] arg){
    Sample obj = new Sample();
    List<Sample> x = new ArrayList<>();
    x.add(obj);

    Iterator <Sample> itr = x.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            x.add(new Sample());
        }
}
}
