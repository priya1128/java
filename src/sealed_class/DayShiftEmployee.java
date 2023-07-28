package sealed_class;

public non-sealed class DayShiftEmployee extends ExtraAllowances implements Employee{
    String workStarts =  "8am";
    String employeeName;
    public void printEmployeeDetails(){
        System.out.println(employeeName);
        System.out.println(baseSalary);
        System.out.println(workStarts);
    }
}
