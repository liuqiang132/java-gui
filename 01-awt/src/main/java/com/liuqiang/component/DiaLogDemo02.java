package com.liuqiang.component;

import javax.swing.*;
import java.awt.*;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: dialog对话框测试
 * @date 2023/12/19 13:14
 */
public class DiaLogDemo02 {
    public static void main(String[] args) {

        Frame frame = new Frame("这是一个DiaLog对话框");

        //创建模式对话框，并设置其内容
        Dialog dialog = new Dialog(frame,"这是一个模式对话框",true);
        dialog.setBounds(300,200,300,200);
        dialog.add(new TextField("你喜欢我吗？"),BorderLayout.CENTER);
        Button button1 = new Button("确认");
        Button button2 = new Button("取消");
        Box box = Box.createHorizontalBox();
        box.add(button1);
        box.add(button2);
        //将内容添加到对话框
        dialog.add(box,BorderLayout.SOUTH);
        //创建按钮绑定对话框行为
        Button button = new Button("模式对话框");
        button.addActionListener(e -> dialog.setVisible(true));


        //将button按钮添加到frame中
        frame.add(button);

        frame.pack();
        frame.setVisible(true);


    }
}
