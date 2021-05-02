package com.company.tree;


public class Main {

    public static void main(String[] args) {

        BinaryTreeTraverse binaryTreeTraverse = new BinaryTreeTraverse();

        TreeNode A = new TreeNode("A");
        TreeNode B = new TreeNode("B");
        TreeNode C = new TreeNode("C");
        TreeNode D = new TreeNode("D");
        TreeNode E = new TreeNode("E");
        TreeNode F = new TreeNode("F");
        TreeNode G = new TreeNode("G");
        TreeNode H = new TreeNode("H");
        TreeNode I = new TreeNode("I");
        TreeNode J = new TreeNode("J");
        TreeNode K = new TreeNode("K");

        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.left = F;
        C.right = G;
        D.left = H;
        D.right = I;
        E.right = J;
        F.right = K;

        // 前序遍历(递归)
        System.out.print("前序遍历：");
        binaryTreeTraverse.preDispalyByRecursion(A);
        System.out.println();



        // 中序遍历(递归)
        System.out.print("中序遍历：");
        binaryTreeTraverse.midDispalyByRecursion(A);
        System.out.println();



        // 后序遍历(递归)
        System.out.print("后序遍历：");
        binaryTreeTraverse.afterDispalyByRecursion(A);
        System.out.println();



        // 层次遍历
        System.out.print("层次遍历：");
        binaryTreeTraverse.levelDispalyByRecursion(A);

    }


}
