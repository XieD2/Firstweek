package com.wkcto;

public class Lost {
    //丢失时间,格式为XXXX.XX.XX  例如2022.07.16
    String lostTime;

    //领取失物地点
    String getPlace;
}
class CardLost extends Lost{
    //学号
    int id;
}
class BookLost extends Lost{
    //书名
    String title;

    //书上所写姓名
    String hostName;
}
