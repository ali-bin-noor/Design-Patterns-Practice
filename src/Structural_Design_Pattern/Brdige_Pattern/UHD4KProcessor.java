package Structural_Design_Pattern.Brdige_Pattern;

public class UHD4KProcessor implements VideoProcessor{
    @Override
    public void process(String videoFile) {
        System.out.println("Video playing in UHD4K Processor.");
    }
}
