package com.company;

import javax.swing.*;
import java.awt.*;

public class OksalatPanel extends JPanel {
    public OksalatPanel (){
        super(null);
    }
    public void paintComponent (Graphics g){
        g.drawLine(505,30,505,39);
        g.drawLine(505,59,184,88);
        g.drawLine(97,112,97,126);
        g.draw3DRect(424,5,176,25,true);
        g.drawRect(9,89,176,23);
        g.draw3DRect(29,126,126,25,true);
        g.drawLine(97,152,97,163);
        g.draw3DRect(29,163,126,25,true);
        g.drawLine(505,59,405,88);
        g.draw3DRect(223,88,185,23,true);
        g.drawLine(310,112,310,126);
        g.draw3DRect(239,126,136,25,true);
        g.drawLine(505,59,560,88);
        g.draw3DRect(469,88,161,23,true);
        g.drawLine(560,112,560,126);
        g.draw3DRect(449,126,211,23,true);
        g.drawLine(560,150,560,163);
        g.draw3DRect(449,163,211,23,true);
        g.drawLine(505,59,690,88);
        g.draw3DRect(689,88,171,23,true);
        g.drawLine(790,112,790,126);
        g.draw3DRect(689,126,211,23,true);
        g.drawLine(790,150,790,163);
        g.draw3DRect(689,163,211,45,true);
        g.drawLine(505,59,910,88);
        g.draw3DRect(910,88,173,23,true);
        g.drawLine(1000,112,1000,126);
        g.draw3DRect(935,126,130,23,true);
    }
}
