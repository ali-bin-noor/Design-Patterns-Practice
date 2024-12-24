package Creational_Design_Patterns.Factory_pattern;

public class WebDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("Getting salary from Web Developer !!!");
        int salary = 5000;
        System.out.println("Web developer salary is : "+salary);
        return salary;
    }
}
