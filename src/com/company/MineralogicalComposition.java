package com.company;

import javax.swing.*;
import java.awt.*;

public class MineralogicalComposition extends JPanel {
    public MineralogicalComposition (){
        super(null);
    }
    public void paintComponent (Graphics g) {
      g.draw3DRect(10,25,1074,100, true);
      g.drawLine(375,25,375,120);
      g.drawLine(731,25,731,120);
      g.drawLine(10,55,1084,55);
    }
}
