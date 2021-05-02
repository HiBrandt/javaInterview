package com.company.recursion;


import java.util.Arrays;

/**
 *递归就是在运行的过程中调用自己。
 *
 * 递归必须要有三个要素：https://blog.csdn.net/m0_37907797/article/details/102767860?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522161830341416780366591022%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=161830341416780366591022&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~top_positive~default-1-102767860.pc_search_result_no_baidu_js&utm_term=%E9%80%92%E5%BD%92
 *
 * 　　①、边界条件
 *
 * 　　②、递归前进段
 *
 * 　　③、递归返回段
 */
public class Recursion {

    public static void main(String[] args) {

        System.out.println(factorial(3));
        createFibonacci(5);
        reverseStr("abc");
        System.out.println("-----------");
        System.out.println(reverseStr2("abc"));
    }

    /**
     * 阶乘
     * @param num
     * @return
     */
    public  static  int factorial( int num){

       if(num ==1){
           return 1;
       }else {
           return num*factorial(num-1);
       }

    }

    /**
     * 常规反转字符串
     * @param str 字符串
     */
    public static void reverseStr(String str){

        char[] chars = str.toCharArray();
        for (int i = chars.length-1; i>= 0 ; i--){
            System.out.print(chars[i]);
        }
    }

    //递归反转字符串

    public static String reverseStr2(String str){

        if(str.isEmpty()) {
            return str;
        }else {
           return reverseStr2(str.substring(1))+str.charAt(0);
        }

    }

    /**
     * 实现斐波那契数列
     * @param num 斐波那契数列长度
     *  每一项都等于前两项之和 1、1、2、3、5
     */
    public static void  createFibonacci(int num){
        if(num == 0){
            System.out.println("不能输入0");
        }else if(num == 1) {
            int []  arr = new int[1];
            arr[0]=1;
            System.out.println(Arrays.toString(arr));
        }else {
            int [] arr = new int[num];
            arr[0]=1;
            arr[1]=1;
            for (int i = 2; i < arr.length; i++){
                //不能出现 i+ 因为会越界 而且本来就是前面的决定后面的
                arr[i] = arr[i-1]+arr[i-2];
            }
            System.out.println(Arrays.toString(arr));
        }

    }


}
