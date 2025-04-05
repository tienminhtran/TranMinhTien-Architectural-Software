package Observer;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {
    private List<Observer> observers;
    private String message;

    public MyTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        if (obj == null) throw new NullPointerException("Null Observer");
        if (!observers.contains(obj)) observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        for (Observer obj : observers) {
            obj.update();
        }
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }


    public void postMessage(String msg) {
        this.message = msg;
        notifyObservers();
    }
}