
package com.research24x7.threading.demos.basic;


public class BasicThreadId {


    public BasicThreadId() {

        super();
    }


    public static void main (String [] args) {

        for (int i=0; i<3; i++) {

            MyThreadId mt = new MyThreadId ();
            mt.start();
        }
    }
}