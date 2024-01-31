package com.liuqiang.event;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: window事件的监听
 * @date 2023/12/19 21:17
 */
public class EventDemo03 {
    public static void main(String[] args) {

        Frame frame = new Frame("这里测试window事件监听器");

        //创建window监听器,当用户点击X的动作之后，关闭窗口
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });



        frame.pack();
        frame.setBounds(300,300,800,600);
        frame.setVisible(true);


    }
}
