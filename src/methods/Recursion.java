package methods;

public class Recursion {
    // method calls itself
    /*
    void m(){
        System.out.println("Hello");
        m();
    }
    */
    /*
    void factorial(int num){
        int ans = 1;
        while(num!=0){
            ans = ans * num;
            num--;
        }
        System.out.println(ans);
    }*/
    int factorial(int num){
        if(num == 1){
            return 1;
        }
        else{
            return num * factorial(num-1);
        }
    }
    public static void main(String[] args) {
        Recursion obj =  new Recursion();
        System.out.println(obj.factorial(5));
    }
}
