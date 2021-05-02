package com.company.designmode;

/**
 * 懒汉式：需要的时候再创建
 * 私有化实例、构造器
 * 线程不安全
 * 用的时候再创建对象
 */
public class LazySingleton {

    //1.私有化实例
    private static LazySingleton instance;

    //2.私有化构造器
    private LazySingleton() {

    }

    //3.唯一的公有方法  线程不安全加锁：涉及到判断是不是为null
    public static synchronized  LazySingleton getInstance(){
        if (instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
