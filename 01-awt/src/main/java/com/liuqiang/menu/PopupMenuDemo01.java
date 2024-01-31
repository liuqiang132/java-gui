package com.liuqiang.menu;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: popup菜单的使用
 * @date 2023/12/19 21:46
 */
public class PopupMenuDemo01 {
     Frame frame = new Frame("菜单事件处理");
     //创建popupMenu
    PopupMenu popupMenu = new PopupMenu();
    TextArea textArea = new TextArea();

    MenuItem menuItem1 = new MenuItem("复制");
    MenuItem menuItem2 = new MenuItem("粘贴");
    MenuItem menuItem3 = new MenuItem("剪切");

     public void init(){
         //组装
         popupMenu.add(menuItem1);
         popupMenu.add(menuItem2);
         popupMenu.add(menuItem3);
         //添加到frame
         frame.add(popupMenu);
         frame.add(textArea);

         //设置最佳大小,用户鼠标点击X关闭窗口
       frame.addWindowListener(new WindowAdapter() {
           @Override
           public void windowClosing(WindowEvent e) {
               super.windowClosing(e);
               System.exit(0);
           }
       });
       frame.pack();
       frame.setBounds(666,214,800,600);
       frame.setVisible(true);

     }

    public static void main(String[] args) {
         new PopupMenuDemo01().init();

    }
}
