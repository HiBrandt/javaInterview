package com.company.designmode;

import java.util.Currency;

public class Main {

    //测试
    public static void main(String[] args) {

        Resource resource = new Resource();

        //共用一个资源库
        Producer p1= new Producer(resource);
        Producer p2= new Producer(resource);
        Producer p3= new Producer(resource);

        Consumer c1 = new Consumer(resource);
        Consumer c2 = new Consumer(resource);

        p1.start();
        p2.start();
        p3.start();
        c1.start();
        c2.start();

    }


}

class Resource {

    //当前资源量
    private int nowSize = 0;
    //存储最大资源量
    private int maxSize = 20;



    /**
     * addResource方法 生产者调用
     * 1.资源不够需要生产者生产，生产了赶紧让消费者消费
     * 2.资源够了阻塞生产者
     * 3.必须线程安全，防止线程同步问题，发生生产超多或是变少，不能同时让多线程生产
     */
    public synchronized void addResource(){

        if(nowSize < maxSize){
            nowSize++;
            System.out.println(Thread.currentThread().getName() + "生产者生产一件资源,当前资源库有资源" + nowSize + "件");
            //唤醒全部正在wait的线程，其实主要是唤醒wait的消费者，让其赶紧消费
            notifyAll();
        }else {
            //资源满了到达maxSize让生产者阻塞
            try {
                wait();
                System.out.println(Thread.currentThread().getName()+"线程进入等待");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * removeResource方法 消费者调用
     * 1.有资源就消费，消费后通知生产者赶紧生产
     * 2.没有资源就阻塞
     * 3.必须线程安全，防止线程同步问题，发生生产超多或是变少，不能同时让多线程消费
     */
    public synchronized  void removeResource(){

        if(nowSize > 0){
            //消费资源
            nowSize --;
            System.out.println("消费者" + Thread.currentThread().getName() + "消费者消费一件资源,当前资源库有资源" + nowSize + "件");
            //唤醒全部正在wait的线程，其实主要是唤醒wait的生产者，让其赶紧生产
            notifyAll();
        }else {
            try {
                //没资源了 阻塞消费者
                wait();
                System.out.println(Thread.currentThread().getName()+"线程进入等待");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

class Producer extends Thread{

    private Resource resource;

    public  Producer(Resource resource){
        this.resource = resource;
    }

    @Override
    public void run() {
        while (true){

            //慢点 不然控制台太多了
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //调用生产方法，不断的生产
            resource.addResource();
        }
    }
}


class Consumer extends Thread{

    private Resource resource;

    public  Consumer(Resource resource){
        this.resource = resource;
    }

    @Override
    public void run() {
        //调用消费方法,不断的消费
        while (true){
            //慢点 不然控制台太多了
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            resource.removeResource();
        }

    }
}


