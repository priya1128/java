package looping;

public class BreakStatement {
    public static void main(String[] args){
        //break -  come out/break of the loop
        for(int i=300;i<1000;i++){
            if(i%13==0 && i%19==0){
                System.out.println(i);
                break;
            }
        }
    }
}
