package com.liuqiang.graphics;

import java.awt.*;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: 绘图技术使用Graphics绘制
 * @date 2024/1/13 20:16
 */
public class SimpleDraw{

    private final String RECT_SHAPE = "rect";
    private final String OVAL_SHAPE = "oval";

    private final Frame frame = new Frame("这里绘制图形");

    Button buttonRect = new Button("绘制矩形");
    Button buttonOval = new Button("绘制椭圆");


    //绘制图形
    private static class MyCanvas extends Canvas{
        @Override
        public void paint(Graphics g) {
            g.setColor(Color.BLUE);

        }
    }

    public void init(){
        //组装
        frame.pack();
        frame.setBounds(600,400, 800,600);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleDraw().init();

    }
}
