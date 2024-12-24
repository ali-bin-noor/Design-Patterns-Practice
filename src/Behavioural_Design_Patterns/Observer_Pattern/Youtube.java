package Behavioural_Design_Patterns.Observer_Pattern;

public class Youtube {

    public static void main(String[] args) {
        Channel telusko = new Channel();

        Subscriber s1 = new Subscriber("Akshay");
        Subscriber s2 = new Subscriber("Sonam");
        Subscriber s3 = new Subscriber("Harsh");
        Subscriber s4 = new Subscriber("Kiran");
        Subscriber s5 = new Subscriber("Pravin");

        telusko.subcribe(s1);
        telusko.subcribe(s2);
        telusko.subcribe(s3);
        telusko.subcribe(s4);
        telusko.subcribe(s5);

        s1.subscribeChannel(telusko);
        s2.subscribeChannel(telusko);
        s3.subscribeChannel(telusko);
        s4.subscribeChannel(telusko);
        s5.subscribeChannel(telusko);

        telusko.upload("How to learn Programming?");

    }
}
