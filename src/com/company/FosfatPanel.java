package com.company;

import javax.swing.*;
import java.awt.*;

public class FosfatPanel extends JPanel {
    public FosfatPanel(){
        super(null);
    }
    public void paintComponent (Graphics g){
        g.draw3DRect(446,5,164,25,true);
        g.draw3DRect(169,43,155,25,true);
        g.drawLine(240,68,240,90);
        g.draw3DRect(176,90,126,20,true);
        g.drawLine(176,110,160,127);
        g.draw3DRect(179,127,121,25,true);
        g.drawLine(240,110,240,127);
        g.draw3DRect(325,127,237,35,true);
        g.drawLine(446,30,325,43);
        g.draw3DRect(9,127,150,35,true);
        g.drawLine(302,110,326,127);
        g.draw3DRect(802,43,91,25,true);
        g.drawLine(610,30,802,43);
        g.draw3DRect(788,87,125,25,true);
        g.drawLine(850,68,850,88);
        g.draw3DRect(626,127,125,35,true);
        g.drawLine(750,127,790,112);
        g.draw3DRect(789,127,132,35,true);
        g.drawLine(850,112,850,127);
        g.draw3DRect(970,127,110,25,true);
        g.drawLine(914,112,970,127);
    }
}
