package com.liuqiang.menu;

import java.awt.*;
import java.awt.event.*;

/**
 * @author liuqiang132
 * @version 1.0
 * @description: 菜单的事件处理
 * @date 2023/12/19 21:46
 */
public class MenuDemo01 {
     Frame frame = new Frame("菜单事件处理");
     //创建菜单条组件
    MenuBar menuBar = new MenuBar();
    //创建菜单项组件
    Menu fileMenuItem = new Menu("文件");
    Menu exitMenuItem = new Menu("编辑");
    Menu formatMenuItem = new Menu("格式");
    //创建菜单组件
    MenuItem menu1 = new MenuItem("自动换行");
    MenuItem menu2 = new MenuItem("复制");
    MenuItem menu3 = new MenuItem("粘贴");
    MenuItem menu4 = new MenuItem("注释",new MenuShortcut(KeyEvent.VK_Q,true));
    MenuItem menu5 = new MenuItem("取消注释",new MenuShortcut(KeyEvent.VK_S,true));
    //创建文本框
    TextArea textArea = new TextArea();
     public void init(){
         //组件组装
         formatMenuItem.addActionListener(e -> textArea.append("当前菜单添加了:"+e.getActionCommand()+"\n"));
         //组装exit
         exitMenuItem.add(menu1);
         exitMenuItem.add(menu2);
         exitMenuItem.add(menu3);
         formatMenuItem.add(menu4);
         formatMenuItem.add(menu5);
         exitMenuItem.add(formatMenuItem);
         //组装menuBar
         menuBar.add(fileMenuItem);
         menuBar.add(exitMenuItem);
         //组装frame
         frame.setMenuBar(menuBar);
         frame.add(textArea);

         //设置最佳大小,X
         frame.addWindowListener(new WindowAdapter() {
             @Override
             public void windowClosing(WindowEvent e) {
                 super.windowClosing(e);
                 System.exit(0);
             }
         });
         frame.pack();
         frame.setBounds(300,150,800,600);
         frame.setVisible(true);

     }

    public static void main(String[] args) {
         new MenuDemo01().init();

    }
}
