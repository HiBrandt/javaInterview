package com.company.linked;


import java.util.LinkedList;

/**
 *
 * 链表增删改查+遍历+反转
 * 感悟：NOde的前后属性是自己 初始化构造器都为null，只有data属性可以赋值。前后属性在成为链表的节点后再赋值
 *
 *
 *
 */
public class MyLinkedList {

    //一条链表的头结点
    private Node head;

    //一条链表的尾结点
    private Node tail;
    //链表的size
    private int size;

    /**
     * 构造器初始化
     * 空参构造器也能初始化属性
     */
    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    /**
     * 在链表头增加节点
     * @param value
     */
    public void addHead(Object value){

        //创建一个Node
        Node newNode = new Node(value);
        //现有链表为空
        if(size == 0){
            //首尾都是同一个
            head = newNode;
            tail = newNode;
            size ++;
        }else {
            // 谁 将 要在前面先写谁 newNode -> head
            head.prev = newNode;  //新的节点作为旧头节点的pre
            newNode.next = head;  //旧的节点作为新头节点的next
            head = newNode;  //在链表头增加节点，新节点作为head
            size++; //容量增加
        }

    }
    public void addTail(Object value){

        Node newNode = new Node(value);
        if(size == 0 ){
            //首尾都是同一个
            head = newNode;
            tail = newNode;
            size ++;
        }else {
            // 谁 将 要在前面先写谁 tail->newNode
            newNode.prev = tail;  //旧的末尾  作为新的prev
            tail.next = newNode;  //新的末尾  作为旧的next
            tail = newNode ;  // 新老交替
            size++;
        }
    }

    //删除链表头  返回删除掉的Node
    public Node deleteHeadNode(){
        //之前的head赋值给tmp 这样就是俩head
        Node tmp = head;
        if(size != 0){
            //之前head的下一个变为现在的head
            head=head.next;
            //现在head的pre为null
            head.prev = null;
            size --;
        }
        return tmp;
    }

    //删除链表尾 返回删除掉的Node

    public Node deleteTailNode(){

        Node tmp = tail;
        if(size != 0){
            tail=tail.prev;
            tail.next = null;
            size --;
        }
        return tmp;
    }
    //获得链表的节点个数
    public  int  getSize(){
        return size;
    }
    //判断链表是否为空 size == 0? true:false
    public Boolean isempty(){
        return size == 0? true:false;
    }


    //显示节点信息遍历 数量==0 ==1 >1
    public void dispaly(){
        if(size > 0 ){

            Node node = head;
            int listSize = size;  //不能真把人家的属性size--，就用个变量代替
            if(size == 1 ){
                System.out.println("["+node.data+"]");
            }else {
                while (listSize > 0){

                    if(node.equals(head)){
                        System.out.print("["+node.data+"->");
                    }else if(node.next == null){
                        System.out.print(node.data+"]");
                    }else {
                        System.out.print(node.data+"->");
                    }

                    //node步进
                    node=node.next;
                    listSize --; //循环步进
                }
            }
        }else {

            System.out.println("[]");
        }
    }


    //私有静态内部类
    private static class Node{

        private Node prev;

        private Object data;

        private Node next;

        public Node(Object data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "prev=" + prev +
                    ", data=" + data +
                    ", next=" + next +
                    '}';
        }
    }


    /*public static void main(String[] args) {

        Node node = new Node(3);
        System.out.println(node);
        LinkedList linkedList = new LinkedList();
    }*/
}
