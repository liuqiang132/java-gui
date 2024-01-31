package com.liuqiang.container;

import java.awt.*;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: window可视化窗口
 * @date 2023/12/17 10:35
 */
public class WindowAWTDemo {
    public static void main(String[] args) {

        //1.创建window可视化窗口
        Frame frame = new Frame("这是一个window可视化窗口");

        //设置窗口的显示位置及大小
        frame.setBounds(600,300,800,600);
        //设置窗口可见
        frame.setVisible(true);



    }
}
