package interface_example;

public class MarkSheetClass10 implements MarkSheet{
    void find_total(int m1,int m2,int m3,int m4,int m5){
        System.out.println(m1+m2+m3+m4+m5+50);
    }

    @Override
    public void total(int m1, int m2, int m3, int m4, int m5) {
        System.out.println(m1+m2+m3+m4+m5+50);
    }

    @Override
    public void display() {

    }
}
