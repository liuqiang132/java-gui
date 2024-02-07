package com.liuqiang.layoutmanager;

import java.awt.*;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: GridBagLayout布局管理器
 * @date 2023/12/18 21:39
 */
public class GridBagLayoutDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("这是一个GridBagLayout布局管理器");

        //太复杂，不能使用

        frame.pack();
        frame.setBounds(400,200,800,500);
        frame.setVisible(true);


    }
}
