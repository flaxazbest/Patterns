package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class CompleteOrderTopic implements Topic {

    List<Observer> orderCompletedObservers = new ArrayList<>();

    @Override
    public void register(Observer obj) {
        orderCompletedObservers.add(obj);
    }

    @Override
    public void notifyObservers(String line) {
        for (Observer o: orderCompletedObservers) {
            o.update(line);
        }
    }
}
