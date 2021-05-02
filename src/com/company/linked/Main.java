package com.company.linked;

public class Main {

    public static void main(String[] args) {



        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addHead("A");
        myLinkedList.addHead("B");
        myLinkedList.addHead("C");
        myLinkedList.addHead("D");
        myLinkedList.addTail("E");
        myLinkedList.deleteHeadNode();
        myLinkedList.deleteTailNode();
        //打印当前链表信息
        myLinkedList.dispaly();

    }
}
