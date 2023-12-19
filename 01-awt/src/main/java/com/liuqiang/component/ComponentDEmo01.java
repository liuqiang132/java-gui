package com.liuqiang.component;

import javax.swing.*;
import java.awt.*;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: 基本组件的使用
 * @date 2023/12/19 4:48
 */
public class ComponentDEmo01 {
    Frame frame = new Frame("这是一个基本组件的使用案例");

    TextArea textArea = new TextArea();
    Choice choice = new Choice();
    CheckboxGroup checkboxGroup = new CheckboxGroup();
    Checkbox male = new Checkbox("男",checkboxGroup,true);
    Checkbox feMale = new Checkbox("女",checkboxGroup,false);
    Checkbox isMarry = new Checkbox("是否已婚？",false);
    TextField textField = new TextField(50);
    Button button = new Button("确认");
    List list = new List();
    public void init(){
        //组装界面
        //1.组装底部
        Box Xbox = Box.createHorizontalBox();
        Xbox.add(textField);
        Xbox.add(button);
        //2.组装顶部
        Box XBox1 = Box.createHorizontalBox();
        XBox1.add(textArea);
        choice.add("红色");
        choice.add("黄色");
        choice.add("绿色");
        Box XBox2 = Box.createHorizontalBox();
        XBox2.add(choice);
        XBox2.add(male);
        XBox2.add(feMale);
        XBox2.add(isMarry);
        //将YBox1和YBox2垂直排列
        Box YBox = Box.createVerticalBox();
        YBox.add(XBox1);
        YBox.add(XBox2);

        //组装列表部分
        list.add("红色");
        list.add("黄色");
        list.add("绿色");
        Box boxList = Box.createHorizontalBox();
        boxList.add(list,true);

        //添加到frame中并设置最佳大小及位置可见
        frame.add(YBox,BorderLayout.WEST);
        frame.add(boxList,BorderLayout.EAST);
        frame.add(Xbox,BorderLayout.SOUTH);

        frame.pack();
        frame.setBounds(400,200,800,500);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new ComponentDEmo01().init();

    }
}
