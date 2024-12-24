package Creational_Design_Patterns.Abstract_Factory_Pattern;

public class WebDeveloper implements Employee{
    @Override
    public int getSalaary() {
        return 50000;
    }

    @Override
    public String name() {
        return "WEB DEVELOPER";
    }
}
