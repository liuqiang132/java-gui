package com.liuqiang.layoutmanager;

import java.awt.*;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: FlowLayout布局管理器
 * @date 2023/12/17 13:13
 */
public class FlowLayoutDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("这是一个FlowLayout布局管理器");


        //1.设置布局管理器
       // frame.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));  左对齐
       // frame.setLayout(new FlowLayout(FlowLayout.CENTER,20,20)); //中间对齐
         frame.setLayout(new FlowLayout(FlowLayout.RIGHT,20,20)); //右对齐
        //2.添加多个按钮到frame中
        for (int i = 0; i < 100; i++) {
            frame.add(new Button("按钮"+(i+1)));
        }

        //设置最佳大小
        frame.pack();
        frame.setBounds(300,200,800,600);
        frame.setVisible(true);

    }
}
