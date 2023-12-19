package com.liuqiang.container;

import java.awt.*;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: ScrollPane可视化窗口
 * @date 2023/12/17 11:55
 */
public class ScrollPaneDemo {
    public static void main(String[] args) {

        //1.创建一个window可视化窗口
        Frame frame = new Frame("这是一个scrollPane窗口");

        //2.创建一个scrollPane
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.add(new TextField("这是一个文本框"));
        scrollPane.add(new Button("开始"));

        //添加到window中
        frame.add(scrollPane);

        //设置窗口的大小，位置,可见
        frame.setBounds(300,300,600,400);
        frame.setVisible(true);
    }
}
