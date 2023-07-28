package classes_and_objects;

public class Student {
    String name;
    int roll_no;
    static String school_name;

    void display() {
        System.out.println(name + " " + roll_no + " " + school_name);
    }

    static void displaySchoolName(){
        System.out.println(school_name);
    }

    public static void main(String[] arg){
        Student s1 = new Student();
        Student s2 = new Student();
        school_name = "Don Bosco";
        s1.name = "Rio";
        s1.roll_no = 48;
        s2.name = "Helsinki";
        s2.roll_no = 19;
        s1.display();
        s2.display();
        displaySchoolName();

    }
}
