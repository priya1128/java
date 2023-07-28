package constructor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
Rules for the constructor
1. Constructor name should be same as Class Name
2. no explicit Return type and return keyword
3. Constructor is return the object
4. Constructor is called when the object is created
5. cannot have static, abstract, final keywords
6. Supports static polymorphism/overloading

Types
1. Default - created by Java compiler
2. Non-parameterized
3. Parameterized
 */
public class Meetings {
    //properties & behaviours
    int id;
    int passcode;
    String name;
    Date scheduledDate;
    static String owner;

    Meetings(){
       System.out.println("This is a constructor");
    }
    Meetings(int id,int passcode,String name,Date scheduledDate){
        this.id = id;
        this.passcode = passcode;
        this.name = name;
        this.scheduledDate = scheduledDate;
    }

    void start(){
        System.out.println(id+" is started");
    }

    void end(){
        System.out.println(id+" is ended");
    }

    void startRecord(){
        System.out.println(id+" Recording Started");
    }

    void updateName(String name){
        //this keyword refers to the current instance/object
        this.name = name;
    }

    void information(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Passcode: "+passcode);
        System.out.println("Date: "+new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a").format(scheduledDate));
        System.out.println("Owner: "+owner);
    }

    static void printOwnerName(){
        System.out.println(owner);
    }

    public static void main(String args[]) throws ParseException {
        Meetings m1 = new Meetings(456573543,8465,"Java Session",
                new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a").parse("18/01/2022 04:30:00 PM"));

        Meetings m2 = new Meetings(75985734,1189," Python Session",
                new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a").parse("22/01/2022 01:00:00 PM"));

        owner = "Naveen";

        m1.information();
        m2.information();

    }
}
