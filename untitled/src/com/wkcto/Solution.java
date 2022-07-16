package com.wkcto;
import java.util.Arrays;
public class Solution{
    /**
     * 失物排序方法
     * @param lostArray 待排序的失物数组
     */
    public void sortLost(Lost[] lostArray) {
        Lost temp = new Lost();
        //冒泡排序法，将丢失时间由前往后排序
        for (int j = 0; j < lostArray.length - 1; j++)
            for (int i = 0; i < lostArray.length - 1 - j; i++) {
                if (lostArray[i].lostTime.compareTo(lostArray[i + 1].lostTime) >= 0) {
                    temp = lostArray[i];
                    lostArray[i] = lostArray[i + 1];
                    lostArray[i + 1] = temp;
                }
            }
    }
        /**
         * 按关键字搜索失物的方法，这里假设按照失物的领取地点进行搜索
         * @param lostArray 失物数组
         * @param keyword 用户输入的关键字
         * @return 返回查找到的失物
         */
        public Lost[] selectByKeyword(Lost[] lostArray,String keyword){

            //声明一个关键词返回数组
            Lost[] placeBack;

            //声明一个空数组，当没有关键词相关时，返回空数组
            Lost[] wrong;
            wrong = null;

            int length = lostArray.length;
            this.sortLost(lostArray);

            //获取placeBacK数组的长度
            int number = 0;
            for(int i = 0; i < length; i++){
                if(lostArray[i].getPlace.compareTo(keyword) == 0){
                    number++;
                }
            }
            placeBack = new Lost[number+1];

            //重新记数
            number = 0;

            for(int i = 0; i < length; i++){
                if(lostArray[i].getPlace.compareTo(keyword) == 0){
                    placeBack[number] = lostArray[i];
                    number++;
                }
            }
            //至少有一个数据与关键词有关才返回有信息的数组placeBack
            if(number > 0)
            return placeBack;
            else
            return wrong;
        }


    }
