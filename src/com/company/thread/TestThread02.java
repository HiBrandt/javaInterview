package com.company.thread;


/**
 * 死锁
 *
 */
public class TestThread02  {

    public static void main(String[] args) {

        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();


        new Thread(){
            @Override
            public void run() {

                synchronized (s1){
                    s1.append("a");
                    s2.append("1");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (s2){
                        s1.append("b");
                        s2.append("2");
                    }


                }

                System.out.println("S1: "+s1);
                System.out.println("S2: "+s2);

            }
        }.start();



        new Thread(){
            @Override
            public void run() {

                synchronized (s2){
                    s1.append("c");
                    s2.append("3");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (s1){
                        s1.append("d");
                        s2.append("4");
                    }


                }

                System.out.println("S1: "+s1);
                System.out.println("S2: "+s2);

            }
        }.start();




    }

}
