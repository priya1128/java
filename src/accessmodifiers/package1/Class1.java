package accessmodifiers.package1;

public class Class1 {
    int a = 10;

    void display_a() {
        System.out.println(a);
    }


    public int b = 10;

    public void display_b() {
        System.out.println(b);
    }

    protected int c = 10;

    protected void display_c() {
        System.out.println(c);
    }

    private int d = 10;

    private void display_d() {
        System.out.println(c);
    }

    //Encapsulation -> wrapping code and data together in a single unit
    //setter methods
    public void setValueD(int d) {
        this.d = d;
    }

    //getter methods
    public int getValueD() {
        return d;
    }

    //data hiding -> other classes not able to access the data -> achieve with the help of private modifier
    private int e = 50;

    public int getValueE() {
        return e;
    }

    private int f = 50;

    public void setValueF(int f) {
        this.f = f;
    }
}
