package Creational_Design_Patterns.Factory_pattern;

public class AndroidDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("Getting salary from Android developer!!!");
        int salary = 6000;
        System.out.println("Android developer salary is : "+salary);
        return salary;
    }
}
