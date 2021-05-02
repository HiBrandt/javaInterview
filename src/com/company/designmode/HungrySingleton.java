package com.company.designmode;

/**
 * 饿汉式:先准备好，来了就开吃。线程安全
 *
 */
public class HungrySingleton {

    //1.先追被哈
    private static HungrySingleton hungrySingleton = new HungrySingleton();
    //2.私有化构造器
    private HungrySingleton() {
    }
    //3.唯一可供调用的入口(静态工厂)
    public static HungrySingleton getInstance(){

        return hungrySingleton;
    }
}
