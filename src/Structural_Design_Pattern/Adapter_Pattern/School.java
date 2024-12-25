package Structural_Design_Pattern.Adapter_Pattern;

public class School {

    public static void main(String[] args) {

        //PilotPen pp = new PilotPen();

        Pen p = new PenAdapter();
        Assignment assignment = new Assignment();
        assignment.setP(p);
        assignment.writeAssigment("I am tired");


    }
}
