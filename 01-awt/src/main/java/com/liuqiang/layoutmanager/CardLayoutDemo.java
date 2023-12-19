package com.liuqiang.layoutmanager;

import java.awt.*;
import java.awt.event.ActionListener;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: CardLayout布局管理器
 * @date 2023/12/18 21:39
 */
public class CardLayoutDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("这是一个CardLayout布局管理器");
        //创建一个panel对象并设置布局为CardLayout,添加完元素后,添加到borderLayout布局的中间位置
        Panel p1 = new Panel();
        CardLayout cardLayout = new CardLayout();
        p1.setLayout(cardLayout);
        for (int i = 0; i < 10; i++) {
            p1.add(new Button("第"+(i+1)+"张"));
        }
        frame.add(p1,BorderLayout.CENTER);

        //2.创建一个panel对象设置为
        Panel p2 = new Panel();
        //创建按钮
        Button b1 = new Button("上一张");
        Button b2 = new Button("下一张");
        Button b3 = new Button("第一张");
        Button b4 = new Button("最后一张");
        Button b5 = new Button("第三张");
        //添加事件监听器
        ActionListener actionListener = e -> {
            String actionCommand = e.getActionCommand();//获取按钮中文字
            switch (actionCommand){
                case "上一张":
                    cardLayout.previous(p1);
                    break;
                case "下一张":
                    cardLayout.next(p1);
                    break;
                case "第一张":
                    cardLayout.first(p1);
                    break;
                case "最后一张":
                    cardLayout.last(p1);
                    break;
                case "第三张":
                    cardLayout.show(p1,"第三张");
                    break;
            }

        };
        //将事件监听器绑定到按钮上
        b1.addActionListener(actionListener);
        b2.addActionListener(actionListener);
        b3.addActionListener(actionListener);
        b4.addActionListener(actionListener);
        b5.addActionListener(actionListener);
        //将按钮添加到p2容器中
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        //将p2容器添加到borderLayout布局管理器的的南侧
        frame.add(p2,BorderLayout.SOUTH);

        frame.pack();
        frame.setBounds(400,200,800,500);
        frame.setVisible(true);

    }
}
