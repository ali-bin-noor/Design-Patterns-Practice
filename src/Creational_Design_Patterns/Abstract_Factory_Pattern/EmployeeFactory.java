package Creational_Design_Patterns.Abstract_Factory_Pattern;

class EmployeeFactory {

    public static Employee getEmployee(EmployeeAbstractFactory factory){
        return factory.getEmployee();

    }
}
