
package com.research24x7.threading.demos.basic;


public class BasicRunnable {


    public BasicRunnable() {

        super();
    }


    public static void main (String [] args) {

        for (int i=0; i<3; i++) {

            Thread mr = new Thread(new MyRunnable ());
            mr.start();
        }
    }
}