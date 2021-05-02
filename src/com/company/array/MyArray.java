package com.company.array;

/**
 * 数组
 *
 */
public class MyArray {

    //初始化声明一个数组
    private int [] initArray ;

    //有效长度
    private int valLength;

    //总长度
    private int maxLength ;


    /**
     * 调用无参构造器默认创建长度50数组
     */
    public MyArray() {

        valLength=0;
        maxLength=50;
        initArray = new int[maxLength];
    }

    /**
     *
     * @param maxLength  创建数组长度
     * 调用有参构造器创建指定长度数组
     */
    public MyArray(int maxLength)  {
        valLength=0;
        this.maxLength=maxLength;
        initArray = new int[maxLength];
    }

    /**
     *
     * @return 返回数组的有效长度
     */
    public int getlegth(){

        return valLength;
    }

    /**
     * 遍历显示元素
     */
    public void display(){

        for (int i = 0 ; i< valLength ; i++){
            System.out.println(initArray[i]);
        }
    }
    /**
     * 添加元素
     */
    public Boolean addElement(int val){

        if(valLength >= maxLength){
            System.out.println("数组长度有限，添加失败");
            return  false;
        }else {
            initArray[valLength]=val;
            valLength++;
            System.out.println("数据添加成功");
            return  true;
        }
    }

    /**
     * 根据下标获取元素
     * @param index 下标
     * @return 返回元素值
     */
    public int findElement(int index){
        if(index<0 ||index > maxLength ){
            System.out.println("输入坐标越界");
            return -1;
        }else {
            return initArray[index];
        }
    }

    /**
     * 查找元素
     * @param searchValue 要查找的值
     * @return 返回下标
     */
    public int returnIndex(int searchValue) {

        int i;
        for (i = 0; i < valLength; i++) {

            if (searchValue == initArray[i]) {
                break;
            }
        }
        if(i == valLength){
            return -1;
        }else {
            return i;
        }
    }

    /**
     * 删除元素:如果要删除的值不存在，直接返回 false;否则返回true，删除成功
     * @param deleteValue
     * @return
     */
    public Boolean deleteElement(int deleteValue){

        int index = returnIndex(deleteValue);
        if(index==-1){
            return false;
        }else {

            //删除元素 如果是最后一位就不用移除数据
            if(index+1 == valLength){
                valLength --;  //这里就意味着把一个对象的属性值改了
                return true;
            }else{

                for (int i = index ;i < valLength-1 ; i++){  //int i = index 牛皮
                    initArray[i] = initArray[i+1];
                }
                valLength --;
                return true;
            }

        }
    }

    /**
     * 修改数据
     * @param oldValue  要修改的值
     * @param newValue  新值
     * @return 是否修改成功
     */
    public Boolean updateElement(int oldValue, int newValue){

        int index = returnIndex(oldValue);
        if(index == -1){
            System.out.println("修改的数据不存在");
            return false;
        }else {
            initArray[index] = newValue;
            return true;

        }
    }


}
