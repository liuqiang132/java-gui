package com.liuqiang.layoutmanager;

import java.awt.*;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: CardLayout布局管理器
 * @date 2023/12/18 21:39
 */
public class CardLayoutDemoJSQ {
    //数据
    private final Frame frame = new Frame("计算器");
    private final Panel panelText = new Panel();
    private final Panel panelBtn = new Panel();

    public void init(){
        //数据的组装
        panelText.add(new TextField(100));
        for (int i = 0; i <= 9; i++) {
            panelBtn.add(new Button(""+i));
        }
        panelBtn.add(new Button("+"));
        panelBtn.add(new Button("-"));
        panelBtn.add(new Button("*"));
        panelBtn.add(new Button("/"));
        panelBtn.add(new Button("."));
        panelBtn.add(new Button("="));
        //添加到frame中
        panelBtn.setLayout(new GridLayout(4,3,4,4));
        frame.add(panelText,BorderLayout.NORTH);
        frame.add(panelBtn);

        //设置最佳大小，以及位置及大小，可见度
        frame.pack();
        //frame.setBounds(500,300,800,600);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new CardLayoutDemoJSQ().init();

    }
}
