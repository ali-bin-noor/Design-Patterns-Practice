package Structural_Design_Pattern.Brdige_Pattern;

public class NetflixVideo extends Video{

    public NetflixVideo(VideoProcessor processor){
        super(processor);
    }
    @Override
    public void play(String videoFile) {
        processor.process(videoFile);
    }
}
