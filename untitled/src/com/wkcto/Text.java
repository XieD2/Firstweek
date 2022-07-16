package com.wkcto;
import java.util.Arrays;
import java.util.Scanner;

//测试
public class Text {
    public static void main(String[] args){
        Lost[] lostArray;
        //假设数据库内共有五个失物的数据
        lostArray = new Lost[5];
        //设置五个失物数据

        // 第一个失物 丢失时间：2022年7月16日  领取地点：莘莘食堂
      Lost lost1 = new Lost();
      lost1.lostTime = "2022.07.16";
      lost1.getPlace = "莘莘食堂";

      //第二个数据 丢失时间：2022年1月1日  领取地点：二教
      Lost lost2 = new Lost();
      lost2.lostTime = "2022.01.01";
      lost2.getPlace = "二教";

      //第三个数据 丢失时间：2022年10月1日  领取地点：二教
        Lost lost3 = new Lost();
        lost3.lostTime = "2022.10.01";
        lost3.getPlace = "二教";

        //第四个数据 丢失时间 2022年5月1日  领取地点：三教
        Lost lost4 = new Lost();
        lost4.lostTime = "2022.05.01";
        lost4.getPlace = "三教";

        //第五个数据 丢失时间 2022年2月14日  领取地点：四教
        Lost lost5 = new Lost();
        lost5.lostTime = "2022.02.14";
        lost5.getPlace = "四教";
        //将五个数据写入数据库
      lostArray[0] = lost1;
      lostArray[1] = lost2;
      lostArray[2] = lost3;
      lostArray[3] = lost4;
      lostArray[4] = lost5;
      //对两个功能进行测试
      Solution text1 = new Solution();
      //对失物数据由时间顺序从前往后排序
      text1.sortLost(lostArray);
      for(int i = 0; i<5; i++) {
          System.out.println("丢失时间：" + lostArray[i].lostTime + "\t领取地点：" + lostArray[i].getPlace);
      }
     System.out.println("输入关键词：");
        Scanner input = new Scanner(System.in);
        String keyword = input.nextLine();
        //查找关键词
        Solution text2 = new Solution();
        Lost[] backMessage;
        backMessage = text2.selectByKeyword(lostArray,keyword);
        System.out.println("查找相关信息:");
        if(backMessage != null) {
            for (int i = 0; i < backMessage.length - 1; i++) {
                System.out.println("丢失时间：" + backMessage[i].lostTime + "\t领取地点：" + backMessage[i].getPlace);
            }
        }
        else{
            System.out.println("没有找到有关信息");
        }
    }
}
