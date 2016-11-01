package com.example.wp.oberver;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by wpmac on 16/9/18.
 */
public class ObserverB extends Observable implements Observer {

    int data = 0;
    @Override
    public void update(Observable object, Object arg) {
        System.out.println("ObserverB found that ObserverA changed...");
    }

    public void setData(int data){
        this.data = data;
        this.setChanged();
        this.notifyObservers();
    }
}
