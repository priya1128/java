package methods;

public class Repetitive_Addition {

    int len(int n){
        int l=0;
        while(n!=0){
            l++;
            n=n/10;
        }
        return l;
    }

    int sumOfDigit(int n){
        int sum=0;
        while(n!=0){
            int temp = n % 10;
            sum=sum+temp;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] arg){
        /*
        9869 - 9+8+6+9 = 32 - 3+2 = 5
         */
        int num= 9869;
        Examples1 obj = new Examples1();
        while(obj.len(num)!=1){
            num = obj.sumOfDigit(num);
        }
        System.out.println(num);
    }
}
