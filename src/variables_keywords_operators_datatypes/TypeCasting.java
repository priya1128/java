package variables_keywords_operators_datatypes;

public class TypeCasting {
    public static void main(String[] args){

        //int -> size 4 bytes -> -2,147,483,648 to 2,147,483,648
        //double -> size 8 bytes -> 15decimal digit
        int a = 10;
        double b =a;
        System.out.println(b);

        double c = 30.69;
        int d = (int) c;
        System.out.println(d);

        String balance = "100";
        int bal = Integer.parseInt(balance);
        System.out.println(bal+56);

        String amount = "1045.82";
        double amt = Double.parseDouble(amount);
        System.out.println(amt+56);

        int mrks = 99;
        String marks = ""+mrks;
        System.out.println(marks);
    }
}
