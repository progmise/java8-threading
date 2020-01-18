
package com.research24x7.threading.demos.basic;


public class BasicThreadNamed {


    public BasicThreadNamed() {

        super();
    }


    public static void main (String [] args) {

        MyThreadNamed mt = new MyThreadNamed ("Homero Simpson");
        mt.start();

        MyThreadNamed mt2 = new MyThreadNamed ("Bart Simpson");
        mt2.start();

        MyThreadNamed mt3 = new MyThreadNamed ("Lisa Simpson");
        mt3.start();
    }
}