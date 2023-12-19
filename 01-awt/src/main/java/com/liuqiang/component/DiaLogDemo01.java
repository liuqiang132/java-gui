package com.liuqiang.component;

import java.awt.*;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: 对话框
 * @date 2023/12/19 6:32
 */
public class DiaLogDemo01 {
    public static void main(String[] args) {
        Frame frame = new Frame("这是一个对话框");
        //创建一个对话框
        Dialog dialog = new Dialog(frame,"这是一个模式对话框",true);
        Dialog dialogModel = new Dialog(frame,"这是一个模式对话框",false);

        //设置两个对话框的大小及位置
        dialog.setBounds(300,200,300,200);
        dialogModel.setBounds(300,200,300,200);

        //定义两个按钮
        Button button1 = new Button("模式对话框");
        Button button2 = new Button("非模式对话框");
        //绑定监听事件
        button1.addActionListener(e -> dialog.setVisible(true));
        button2.addActionListener(e -> dialogModel.setVisible(true));
        //将两个按钮和对话框
        frame.add(button1,BorderLayout.NORTH);
        frame.add(button2,BorderLayout.SOUTH);



        frame.pack();
        //frame.setBounds(400,200,800,500);
        frame.setVisible(true);


    }
}
