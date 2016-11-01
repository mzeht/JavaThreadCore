package com.example.wp.oberver;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by wpmac on 16/9/18.
 */
public class ObserverA  extends Observable implements Observer {
    @Override
    public void update(Observable object, Object arg) {
        ObserverB observerB = (ObserverB)object;
        System.out.println("observerB changed, the new value of observerB.data is " + observerB.data);
        this.setChanged();
        this.notifyObservers();
    }
}
