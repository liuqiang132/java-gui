package com.liuqiang.container;

import java.awt.*;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: Panel可视化窗口
 * @date 2023/12/17 10:39
 */
public class PanelAWTDemo {
    public static void main(String[] args) {

        //1.创建window可视化窗口.并设置其大小及位置，以及可见
        Frame frame = new Frame("这是一个Panel窗口可视化");
        //2.创建Panel,并添加，text,button按钮等功能
        Panel panel = new Panel();
        panel.add(new TextField("这是一个文本框"));
        panel.add(new Button("这是一个按钮"));
        //将Panel添加到window窗口中
        frame.add(panel);
        frame.setBounds(300,300,600,400);
        frame.setVisible(true);

        //其中按钮的文字乱码，需修改！！！！

    }
}
