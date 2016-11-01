package com.example.wp.oberver;

import java.util.Observable;

/**
 * Created by wpmac on 16/9/18.
 */
public class SimpleObservable extends Observable {

    private int data = 0;

    public int getData(){
        return data;
    }

    public void setData(int i){
        if(this.data != i) {
            this.data = i;
            setChanged();

            //只有在setChange()被调用后，notifyObservers()才会去调用update()，否则什么都不干。
            notifyObservers();
        }
    }
}
