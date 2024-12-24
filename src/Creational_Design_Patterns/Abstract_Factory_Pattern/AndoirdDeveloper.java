package Creational_Design_Patterns.Abstract_Factory_Pattern;

public class AndoirdDeveloper implements Employee {

    @Override
    public int getSalaary() {
        return 6000;
    }

    @Override
    public String name() {
        return "ANDROID DEVELOPER";
    }
}