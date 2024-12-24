package Creational_Design_Patterns.Abstract_Factory_Pattern;

public class TestAbstractFactory {
    public static void main(String[] args) {

        var webDev = EmployeeFactory.getEmployee(new AndDevFactory());
        System.out.println("web dev salary is  : " + webDev.getSalaary());
        System.out.println("web dev name is  : " + webDev.name());
        System.out.println("----------------------------------------");
        var andDev = EmployeeFactory.getEmployee(new WebDevFactory());
        System.out.println("android dev salary is  : " + andDev.getSalaary());
        System.out.println("android dev name is  : " + andDev.name());
    }
}
