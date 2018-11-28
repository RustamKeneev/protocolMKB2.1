package com.company;

import javax.swing.*;
import java.awt.*;

public class MineralogicalComposition extends JPanel {
    public MineralogicalComposition (){
        super(null);
    }
    public void paintComponent (Graphics g) {
      g.draw3DRect(10,25,1074,500, true);
      g.drawLine(375,25,375,550);
      g.drawLine(731,25,731,550);
      g.drawLine(10,55,1084,55);
      g.drawLine(10,80,1084,80);
      g.drawLine(10,105,1084,105);
      g.drawLine(10,130,1084,130);
      g.drawLine(10,155,1084,155);
      g.drawLine(10,180,1084,180);
      g.drawLine(10,205,1084,205);
      g.drawLine(10,230,1084,230);
    }
}
