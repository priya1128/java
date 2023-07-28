package interface_example;

public class MarkSheetClass9 implements MarkSheet,Student{

    public void total(int m1,int m2,int m3,int m4,int m5){
        System.out.println(m1+m2+m3+m4+m5+100);
    }

    @Override
    public void display() {

    }
}
