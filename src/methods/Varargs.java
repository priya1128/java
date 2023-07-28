package methods;

public class Varargs {
    void total(int... marks){
        int sum = 0;
        for(int mark: marks){
            sum = sum+mark;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Varargs obj = new Varargs();
        obj.total(45,26,33,40,49);
        obj.total(45,26,33,40,49,39,40,45);
        obj.total();

    }
}
