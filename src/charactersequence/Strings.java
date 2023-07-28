package charactersequence;

import java.util.Locale;

public class Strings {
    public static void main(String[] args){

        String name = "Mostly Rain";
        /*
            for(int i=0;i<name.length();i++){
                System.out.println(name.charAt(i));
            }
        */
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf('l'));
        System.out.println(name.indexOf('R',5));
        System.out.println(name.indexOf("Rain"));

        System.out.println(name.substring(2));
        System.out.println(name.substring(2,8));

        System.out.println(name.contains("Rain"));
        System.out.println(name.startsWith("Mos"));
        System.out.println(name.endsWith("in"));

        System.out.println(name.equals("Mostly Rain"));
        System.out.println(name.equals("Mostly Rain1"));

        System.out.println(name.equalsIgnoreCase("mostly rain"));

        System.out.println(name.compareTo("Mostly Rain"));

        //str1 < str2 negative
        //str1 > str2 positive
        System.out.println(name.compareTo("Mostly Rain7"));
        System.out.println(name.compareTo("Mostly Rai"));

        System.out.println(name.toLowerCase(Locale.ROOT));
        System.out.println(name.toUpperCase(Locale.ROOT));

        String str = "        Top rated, premium quality | Amazon Brands & more           ";
        System.out.println(str.trim());

        System.out.println(str.replace("r","z"));

        String str2 = "";
        System.out.println(str2.isEmpty());
    }
}
