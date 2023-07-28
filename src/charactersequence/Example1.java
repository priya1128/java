package charactersequence;
//Palindrome Ex: madam, malayalam
public class Example1 {

    public static void main(String[] args){
        String str = "java";
        String rev = "";
        for(int i=0;i<str.length();i++){
            rev = rev+str.charAt(str.length()-i-1);
        }
        if(str.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

       String s = "madam";
       StringBuffer sb = new StringBuffer(s);
       sb.reverse();

       if(s.equals(sb.toString())){
           System.out.println("Palindrome");
       }
       else{
           System.out.println("Not Palindrome");
       }
    }
}
