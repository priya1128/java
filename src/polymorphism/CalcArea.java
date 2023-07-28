package polymorphism;

public class CalcArea {

    void area(int r){
        double ans = 3.141*r*r;
        System.out.println("circle area: "+ans);
    }

    void area(int l,int b){
        double ans = l*b;
        System.out.println("rect area: "+ans);
    }

    public static void main(String[] arg){
        CalcArea obj =  new CalcArea();
        obj.area(5);
        obj.area(6,7);

        String name = "Helsinki";

        System.out.println(name.indexOf('i'));
        System.out.println(name.indexOf('i',5));

    }

}
