package classes_and_objects;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
Naming Convention
 Class name always start with Upper Case and following words should also start with Upper Case i.e. Meetings, ZoomMeetings
 Variable & Methods name should start with Lower Case but following words starts should be in Upper Case
 i.e. start(), startRecording()
 */
public class Meetings {
    //properties & behaviours
    int id;
    int passcode;
    String name;
    Date scheduledDate;
    static String owner;

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
        Meetings m1 = new Meetings();
        m1.id=456573543;
        m1.passcode = 8465;
        m1.name = " Java Session";
        m1.scheduledDate = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a").parse("18/01/2022 04:30:00 PM");

        Meetings m2 = new Meetings();
        m2.id=75985734;
        m2.passcode = 1189;
        m2.name = " Python Session";
        m2.scheduledDate = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a").parse("22/01/2022 01:00:00 PM");

        owner = "Naveen";

        m1.information();
        m2.information();

        m2.updateName(" Python Selenium Session");
        m2.information();
    }
}
