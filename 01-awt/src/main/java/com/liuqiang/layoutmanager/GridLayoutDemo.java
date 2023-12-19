package com.liuqiang.layoutmanager;

import java.awt.*;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: GridLayout布局管理器
 * @date 2023/12/17 13:38
 */
public class GridLayoutDemo {
    public static void main(String[] args) {
        Frame GridFrame = new Frame("计算器");
        //1.创建panel对象，并添加textLid()，然后将panel对象添加到borderLayout布局管理器的北侧区域
        Component TextComponent = new Panel().add(new TextField(30));
        GridFrame.add(TextComponent,BorderLayout.NORTH);
        //2.创建一个panel对象，并将其设置成GridLayout,并往里添加按钮，最后将p对象添加到borderLayout布局管理器的中间位置
        Panel p = new Panel();
        p.setLayout(new GridLayout(3,5,4,4));
        for (int i = 0; i <= 9; i++) {
            p.add(new Button(""+i));
        }
        p.add(new Button("+"));
        p.add(new Button("-"));
        p.add(new Button("*"));
        p.add(new Button("/"));
        p.add(new Button("="));
        GridFrame.add(p,BorderLayout.CENTER);

        GridFrame.pack();
        GridFrame.setBounds(400,300,300,200);
        GridFrame.setVisible(true);


    }
}
