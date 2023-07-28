package charactersequence;

public class StringBuilderExample {
    public static void main(String[] args) {
        /*
        String vs StringBuilder
        String is immutable (not modifiable), StringBuilder is mutable (modifiable)

        StringBuffer(Less Efficient) vs StringBuilder(Efficient)
        StringBuffer - sync(ThreadSafe) StringBuilder non-sync(Not ThreadSafe)

         */
        StringBuilder sb = new StringBuilder("Exploring the world!!");
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
    }
}
