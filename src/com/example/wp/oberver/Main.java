package com.example.wp.oberver;

/**
 * Created by wpmac on 16/9/18.
 */
public class Main {

    public static void main(String[] args) {
        ObserverA a = new ObserverA();
        ObserverB b = new ObserverB();

        a.addObserver(b);
        b.addObserver(a);

        b.setData(2);
    }
}
