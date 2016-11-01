package com.example.wp.oberver;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by wpmac on 16/9/18.
 */
public class SimpleObserver implements Observer {


    public SimpleObserver(SimpleObservable simpleObservable){
        simpleObservable.addObserver(this );
    }
    @Override
    public void update(Observable observable ,Object data) {
        SimpleObservable example = (SimpleObservable)observable;
        System.out.println("Data has changed t" + example.getData());
    }
}
