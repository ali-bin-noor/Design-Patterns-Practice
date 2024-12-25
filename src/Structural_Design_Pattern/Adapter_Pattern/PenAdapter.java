package Structural_Design_Pattern.Adapter_Pattern;

public class PenAdapter implements Pen {

    private PilotPen pilotPen = new PilotPen();


    @Override
    public void write(String str) {
        pilotPen.mark(str);
    }
}
