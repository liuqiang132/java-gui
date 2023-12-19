package com.liuqiang.component;

import javax.swing.*;
import java.awt.*;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: dialog对话框测试
 * @date 2023/12/19 13:14
 */
public class FileDiaLogDemo {
    public static void main(String[] args) {

        Frame frame = new Frame("这是一个FileDiaLog对话框");

        //创建模式对话框，并设置其内容
        FileDialog LoadFileDialog = new FileDialog(frame, "打开文件操作对话框", FileDialog.LOAD);
        FileDialog saveFileDialog = new FileDialog(frame, "保存文件操作对话框", FileDialog.SAVE);
        //设置fileDialog的大小及位置
        LoadFileDialog.setBounds(300,200,300,200);
        saveFileDialog.setBounds(300,200,300,200);
        //添加按钮并绑定行为
        Box YBox = Box.createVerticalBox();
        Button button1 = new Button("打开文件");
        button1.addActionListener(e -> {
            LoadFileDialog.setVisible(true);
            System.out.println("打开文件路径:"+LoadFileDialog.getDirectory());

        });
        YBox.add(button1);
        Button button2 = new Button("保存文件");
        button2.addActionListener(e -> {
            saveFileDialog.setVisible(true);
            System.out.println("保存文件路径:"+saveFileDialog.getFile());
        });
        YBox.add(button2);
        //将button按钮添加到frame中
        frame.add(YBox,BorderLayout.CENTER);


        frame.pack();
        frame.setVisible(true);


    }
}
