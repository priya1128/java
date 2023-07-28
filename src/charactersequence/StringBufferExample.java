package charactersequence;

public class StringBufferExample {
    public static void main(String[] args){
        /*
        String vs StringBuffer
        String is immutable (not modifiable), StringBuffer is mutable (modifiable)
         */
        StringBuffer sb = new StringBuffer("Exploring the world!!");

        System.out.println(sb.charAt(2));
        System.out.println(sb.indexOf("t"));
        System.out.println(sb.length());
        System.out.println(sb.substring(3));
        System.out.println(sb.substring(3,10));

        sb.append("Mike");
        System.out.println(sb);

        sb.insert(10,"Mars");
        System.out.println(sb);

        sb.deleteCharAt(16);
        System.out.println(sb);

        sb.delete(0,9);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        String str = "Hello World";
        str.replace("e","z");
        System.out.println(str);

        StringBuffer sb1 = new StringBuffer("Hello World");
        sb1.replace(1,2,"z");
        System.out.println(sb1);

    }
}
