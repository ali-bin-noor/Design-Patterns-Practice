package Structural_Design_Pattern.Brdige_Pattern;

public class HDProcessor implements VideoProcessor {
    @Override
    public void process(String videoFile) {
        System.out.println("Video playing in HD Processor.");
    }
}
