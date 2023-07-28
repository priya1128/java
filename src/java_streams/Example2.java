package java_streams;

import java.util.Arrays;
import java.util.List;

// Calculate total salary of employees whose age is greater than 25
public class Example2 {
    public static void main(String[] args){
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 30, 50000),
                new Employee("Bob", 25, 40000),
                new Employee("Charlie", 35, 60000),
                new Employee("David", 22, 35000),
                new Employee("Eva", 28, 55000)
        );
        /*
        int totalSalary = employees.stream()
                .filter(employee -> employee.getAge()>25)
                .map(employee -> employee.getSalary())
                .reduce(0, Integer::sum);
         */
        int totalSalary = employees.stream()
                .filter(employee -> employee.getAge()>25)
                .map(Employee::getSalary)
                .reduce(0, Integer::sum);
        System.out.println(totalSalary);
    }
}

class Employee {
    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getters and setters
    public String getName() { return name; }
    public int getAge() { return age; }
    public int getSalary() { return salary; }
}
