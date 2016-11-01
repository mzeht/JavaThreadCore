package com.example.wp.oberver;

/**
 * Created by wpmac on 16/9/18.
 */
public class SimpleTest
{
    public static void main(String[] args){
        SimpleObservable doc = new SimpleObservable ();
        SimpleObserver view = new SimpleObserver (doc);
        doc.setData(1);
        doc.setData(2);
        doc.setData(2);
        doc.setData(3);
    }
}
