package methods;

public class Methods_Example {
    /*
        <access_specifiers> return_type method_name(arg1, arg2, arg_n){
        return value;
        }
        1. Non Parameterized method
        2. Parameterized method
        3. with Return value

        1. Built-in method
        2. User-defined method

     */

    void display(){
        System.out.println("Hello World");
    }
    /*
    void total(int m1,int m2,int m3){
        int t = m1+m2+m3;
        System.out.println(t);
    }
    */
    int total(int m1,int m2,int m3){
        int t = m1+m2+m3;
        return t;
    }

    public static void main(String[] arg){
        Methods_Example obj = new Methods_Example();
        obj.display();
        //obj.total(89,65,99);
        int ans = obj.total(89,65,99);
        System.out.println(ans);

        String name = "Helsinki";
        int len  = name.length();
        System.out.println(len);
    }
}
