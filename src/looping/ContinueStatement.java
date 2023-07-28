package looping;

public class ContinueStatement {
    public static void main(String[] args){
        //continue -  it will just skip the iteration
        for(int i=300;i<1000;i++){
            if(i%13==0 && i%19==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
