
package com.research24x7.threading.demos.basic;


public class BasicThread {


    public BasicThread () {

        super();
    }


    public static void main (String [] args) {

        for (int i=0; i<3; i++) {

            MyThread mt = new MyThread ();
            mt.start();
        }
    }
}