package Creational_Design_Patterns.Abstract_Factory_Pattern;

public class WebDevFactory extends EmployeeAbstractFactory{
    @Override
    public Employee getEmployee() {
        return new WebDeveloper();
    }
}
