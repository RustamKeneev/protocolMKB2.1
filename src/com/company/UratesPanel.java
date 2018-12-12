package com.company;

import javax.swing.*;
import java.awt.*;

public class UratesPanel extends JPanel {
    public UratesPanel(){
        super(null);
    }
    public void paintComponent(Graphics g){
        g.draw3DRect(403,5,303,25,true);
        g.drawLine(403,30,336,57);
        g.draw3DRect(69,57,267,25,true);
        g.drawLine(190,82,190,97);
        g.draw3DRect(132,97,124,25,true);
        g.drawLine(190,122,80,147);
        g.draw3DRect(9,147,162,45,true);
        g.drawLine(80,192,80,217);
        g.draw3DRect(9,217,225,40,true);
        g.drawLine(190,122,329,147);
        g.draw3DRect(329,147,150,25,true);
        g.drawLine(400,172,330,217);
        g.draw3DRect(258,217,142,25,true);
        g.drawLine(400,172,480,217);
        g.draw3DRect(424,217,242,40,true);
        g.drawLine(768,57,705,29);
        g.draw3DRect(768,57,252,25,true);
        g.drawLine(910,82,910,97);
        g.draw3DRect(848,97,122,25,true);
        g.drawLine(910,122,910,147);
        g.draw3DRect(843,147,127,25,true);
    }
}
