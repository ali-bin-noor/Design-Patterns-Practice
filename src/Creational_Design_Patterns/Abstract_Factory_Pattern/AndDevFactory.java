package Creational_Design_Patterns.Abstract_Factory_Pattern;

public class AndDevFactory extends EmployeeAbstractFactory{
    @Override
    public Employee getEmployee() {
        return new AndoirdDeveloper();
    }
}
