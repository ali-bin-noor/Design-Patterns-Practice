package Creational_Design_Patterns.Factory_pattern;

public class TestEmployee {
    public static void main(String[] args) {
        var employee = EmployeeFactory.getEmpObject("web developer");
        employee.salary();
    }
}
