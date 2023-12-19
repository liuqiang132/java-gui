package com.liuqiang.event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: 事件监听处理
 * @date 2023/12/19 14:14
 */
public class EventDemo01 {
    Frame frame = new Frame("这里是一个事件监听处理");
    //定义组件
   TextField tx = new TextField(30);
   Button button1 = new Button("确认");
   Button button2 = new Button("取消");

    public void init() {
        //组装视图
        Box box1 = Box.createHorizontalBox();
        box1.add(button1);
        box1.add(button2);
        Box box2 = Box.createVerticalBox();
        box2.add(tx);
        box2.add(box1);

        MyListener myListener = new MyListener();
        button1.addActionListener(myListener);
        frame.add(box2);
        frame.pack();
        frame.setVisible(true);
    }
    private class MyListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (tx.getText().equals("")) {
                tx.setText("hello word");
                System.out.println("点击了:"+e.getActionCommand());

            }
        }
    }

    public static void main(String[] args) {

        new EventDemo01().init();


    }
}
