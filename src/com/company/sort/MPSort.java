package com.company.sort;

import java.util.Arrays;

public class MPSort {



    /**
     *
     * @param arr 排序数组
     */
    public static void sortLow(int [] arr){

        //外层控住比较次数。比如3个数 就需要比两次 所以就比遍历少1个 i是从1开始
        for (int i = 1 ; i < arr.length ; i++){

            //内层控住比较方式 前一个和后一个比较。因每次都能定下一个数字的位置(大的数字都放到了后面) 不需要比较
            //所以每次比较都少一个 所以是-i
            for (int j = 0 ; j < arr.length - i; j++){

                //交换
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }

            }

        }

        System.out.println(Arrays.toString(arr));

    }


    /**
     *
     * @param arr 排序数组
     */
    public static void sortUp(int [] arr){


        for (int i = 1 ; i < arr.length ; i++){

            // 设定一个标记，若为true，则表示此次循环没有进行交换，也就是待排序列已经有序，排序已经完成。
            boolean flag = true;

            for (int j = 0 ; j < arr.length - i; j++){


                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;

                    flag = false;
                }

            }

            //都排好了 直接跳出 不比了
            if(flag){
                break;
            }

        }

        System.out.println(Arrays.toString(arr));

    }


}
