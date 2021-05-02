package com.company.sort;

/**
 * https://zhuanlan.zhihu.com/p/78243665
 * https://mp.weixin.qq.com/s?src=11&timestamp=1614069128&ver=2907&signature=vYi1OV89QCZR7UXnTKpDDtHfRIHCLauE4bWyUGye*bn7U-5xGL3KOyFIXOrXaGOPvYPSZRnTHMw06DJOzN-UZ8Rc*giT2xg4s6giU47BtbYxpS2wpAGr2GP50-A5f-TK&new=1
 */
public class Main {

    public static void main(String[] args) {


        int [] arr = {4,10,3,7,5,18};
        //MPSort.sortLow(arr);
        //MPSort.sortUp(arr);
        XZSort.sort(arr);
    }
}
