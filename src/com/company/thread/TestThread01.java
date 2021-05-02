package com.company.thread;


/**
 * 交替卖票
 */
public class TestThread01  implements Runnable{

    private  int i = 1 ;

    @Override
    public void run() {

        while (true){

            synchronized (this){
                if(i <= 100){
                    //不要一开始把门给人家就锁住了
                    notify();
                    System.out.println(Thread.currentThread().getName()+":"+ i++);
                }else {
                    break;
                }
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
        System.out.println("结束");

    }
}
