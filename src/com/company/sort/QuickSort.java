package com.company.sort;

import java.util.Arrays;

public class QuickSort {


    public static void main(String[] args) {


        int arr [] = {1,3,10,2,-5,20,3,8};

        sort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));

    }

    /**
     *
     * @param arr  你要排序的数组
     * @param low  你要排序的数组的左端  注意:每次递归调的时候 这个会变化 一小节一小节的
     * @param high 你要排序的数组的右端  注意:每次递归调的时候 这个会变化 一小节一小节的
     */
    private static void sort(int arr[], int low, int high) {

        //出去递归的条件
        if(low >= high){
            return;
        }

        // 三要素
        int i = low;
        int j = high;
        int key  = arr[low];

       // 后加的 不能让 i或者j无休止的滑动
       while (i < j){

           // 选第一个为key，那么就从右往左比
           while (arr[j] >= key && i < j){
               j--;
           }

           // j 和 i交换位置
           int tmp;
           tmp = arr[j];
           arr[j] = arr[i];
           arr[i] = tmp;

           //从右往左比后，key右边的都比key大，接下来从左往右比
           while (arr[i] <= key && i < j){
               i++;
           }
           // i 和 j交换位置
           tmp = arr[i];
           arr[i] = arr[j];
           arr[j] = tmp;


       }
       sort(arr,low,i-1);
       sort(arr,j+1,high);
    }


}
