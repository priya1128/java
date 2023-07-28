package variables_keywords_operators_datatypes;

public class Variables {
    public static void main(String[] args){
        /*
        1. Starts with letters, underscore
        2. Contain letters, numbers, underscore and $
        3. Apart from $ and _ no other special characters are allowed
        4. Variable name cannot be reserved words/identifiers

        Types of variables
        -------------------------
        1. Local
        2. Instance
        3. Static
         */

        int firstNum = 5;
        int secondNum = 6;
        int ans = firstNum+secondNum;
        System.out.println(ans);
    }
}
