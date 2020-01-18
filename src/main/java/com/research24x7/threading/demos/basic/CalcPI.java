
package com.research24x7.threading.demos.basic;


public class CalcPI {


    public CalcPI () {

        super ();
    }


    public static void main (String [] args) {

        ThreadPI mt = new ThreadPI ();
        mt.start ();

        while (mt.isAlive ()) {

            try {

                Thread.sleep (10);

            } catch (InterruptedException e) {
                e.printStackTrace ();
            }

            System.out.println ("pi = " + mt.pi);
        }
    }
}



class ThreadPI extends Thread {

    boolean negative = true;
    double pi;


    public ThreadPI () {

        super ();
    }


    public void run () {

        for (int i = 3; i < 100000; i += 2) {

            if (negative) {
                pi -= (1.0 / i);
            } else {
                pi += (1.0 / i);
            negative = !negative;
            }
        }

        pi += 1.0;
        pi *= 4.0;

        System.out.println ("The thread has Finished the PI calculate!!!");
    }
}
