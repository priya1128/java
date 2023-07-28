package constructor;

public class Student {

    String name;
    int roll_no;

    Student(String n,int r){
        name = n;
        roll_no = r;
    }
    void display(){
        System.out.println(name+" "+roll_no);
    }

    public static void main(String[] arg){
        Student  s1 = new Student("Rio",18);
        s1.display();
    }
}
