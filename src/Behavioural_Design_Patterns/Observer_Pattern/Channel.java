package Behavioural_Design_Patterns.Observer_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Channel {

    private List<Subscriber> subs = new ArrayList<>();
    private String title;

    public void subcribe(Subscriber sub) {
        subs.add(sub);
    }

    public void unSubcribe(Subscriber sub) {
        subs.remove(sub);
    }

    public void notifySubcribers(String title) {
        for (var subcriber : subs) {
            subcriber.update(title);
        }
    }

    public void upload(String title){
        this.title=title;
        notifySubcribers(title);
    }
}



