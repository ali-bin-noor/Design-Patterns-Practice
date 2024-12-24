package Behavioural_Design_Patterns.Observer_Pattern;

public class Subscriber {

    private String name;
    private Channel channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(String title){
        System.out.println("Hey! "+name+", "+title+" - Video Uploaded");
    }

    public void subscribeChannel(Channel ch){
        channel = ch;
    }

}
