package com.liuqiang.event;

import java.awt.*;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: 事件监听处理
 * @date 2023/12/19 14:14
 */
public class EventDemo02 {
    Frame frame = new Frame("这里是一个事件监听处理");

    public void init() {
        //组装视图
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        new EventDemo02().init();


    }
}
