package com.liuqiang.layoutmanager;

import java.awt.*;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: BorderLayout布局管理器
 * @date 2023/12/17 13:23
 */
public class BorderLayoutDemo2 {
    public static void main(String[] args) {
        Frame frame = new Frame("这是一个borderLayout布局管理器");
        //设置borderLayout
        frame.setLayout(new BorderLayout(30,20));
        //2.添加按钮及要放置的位置
        frame.add(new Button("北侧按钮"),BorderLayout.NORTH);
        //frame.add(new Button("中间按钮"),BorderLayout.CENTER);
        frame.add(new Button("南侧按钮"),BorderLayout.SOUTH);
        //frame.add(new Button("西侧按钮"),BorderLayout.EAST);
        //frame.add(new Button("东侧按钮"),BorderLayout.WEST);

        //frame.add(new TextField("这是一个测试文本！！！！") ,BorderLayout.CENTER);


        //创建panel
        Panel p = new Panel();
        p.add(new Button("中间按钮"));
        p.add(new TextField("这是一个测试文本框！！！！！！"));
        frame.add(p);
        //设置最佳大小，
        frame.pack();
        //设置window窗口显示的大小及位置
        frame.setBounds(300,200,800,600);
        //设置window可见
        frame.setVisible(true);

    }
}
