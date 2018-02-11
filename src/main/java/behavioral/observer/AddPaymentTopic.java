package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class AddPaymentTopic implements Topic {

    List<Observer> addPaymentObservers = new ArrayList<>();


    @Override
    public void register(Observer obj) {
        addPaymentObservers.add(obj);
    }

    @Override
    public void notifyObservers(String line) {
        for (Observer o: addPaymentObservers) {
            o.update(line);
        }
    }
}
