package com.company.tree;


import java.util.ArrayDeque;
import java.util.Queue;

public class BinaryTreeTraverse {


    /**
     * 前序遍历
     * @param node 根节点
     */
    public static void preDispalyByRecursion(TreeNode node){

        if(node != null){
            System.out.print(node.data);
            preDispalyByRecursion(node.left);//当节点为null时就开始执行下面一行了
            preDispalyByRecursion(node.right);
        }

    }
    /**
     * 中序遍历
     * @param node 根节点
     */
    public static void midDispalyByRecursion(TreeNode node){

        if(node != null){
            midDispalyByRecursion(node.left);//当节点为null时就开始执行下面一行了
            System.out.print(node.data);
            midDispalyByRecursion(node.right);
        }
    }
    /**
     * 后序遍历
     * @param node 根节点
     */
    public static void afterDispalyByRecursion(TreeNode node){

        if(node != null){
            afterDispalyByRecursion(node.left);//当节点为null时就开始执行下面一行了
            afterDispalyByRecursion(node.right);
            System.out.print(node.data);
        }
    }
    /**
     * 层序遍历
     * @param root 根节点
     */
    public static void levelDispalyByRecursion(TreeNode root){

        //队列。先进先出
        Queue<TreeNode> queue = new ArrayDeque<>();
        //根节点添加到队列
        if (root != null) {
            queue.offer(root);
        }
        //如果队列不为空
        while (!queue.isEmpty()){
            //获取并移除队列头
            TreeNode node = queue.poll();
            System.out.print(node.data);

            if(node.left != null){
                queue.offer(node.left);
            }
            if(node.right != null){
                queue.offer(node.right);
            }
        }

    }

}
