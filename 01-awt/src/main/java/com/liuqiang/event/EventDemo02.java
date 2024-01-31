package com.liuqiang.event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: 常见事件监听处理
 * @date 2023/12/19 14:14
 */
public class EventDemo02 {
    Frame frame = new Frame("这里是一个事件监听处理");
    Choice choice = new Choice();
    TextField textField = new TextField(30);

    public void init() {
        //组装视图
        choice.add("解鲁瑶");
        choice.add("王艳");
        choice.add("凌玉洁");

        //事件监听机制
        textField.addTextListener(e -> System.out.println("文本:"+textField.getText()));

        //事件的监听机制
        choice.addItemListener(e -> System.out.println("列表:"+e.getItem()));


        //事件处理机制
        frame.addContainerListener(new ContainerListener() {
            @Override
            public void componentAdded(ContainerEvent e) {
                System.out.println("frame中添加了组件:"+e.getChild());
            }
            @Override
            public void componentRemoved(ContainerEvent e) {

            }
        });

        Box Xbox = Box.createHorizontalBox();
        Xbox.add(choice);
        Xbox.add(textField);
        frame.add(Xbox);
        frame.pack();
        frame.setBounds(300,300,500,400);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new EventDemo02().init();
    }
}
