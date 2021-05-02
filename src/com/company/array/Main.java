package com.company.array;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * 测试数组
 *
 */
public class Main {

    public static void main(String[] args) {


        MyArray myArray = new MyArray(5);
        myArray.addElement(3);
        myArray.addElement(2);
        myArray.addElement(4);
        myArray.addElement(1);
       /* myArray.display();
        int element = myArray.findElement(1);
        System.out.println(element);
        System.out.println(myArray.getlegth());
        System.out.println(myArray.returnIndex(6));*/

        //删除
        /*myArray.deleteElement(1);
        myArray.display();*/

        //更新
        myArray.updateElement(2, 5);
        myArray.display();


    }

}
