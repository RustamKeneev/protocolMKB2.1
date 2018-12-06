package com.company;

import javax.swing.*;
import java.awt.*;

public class OksalatPanel extends JPanel {
    public OksalatPanel (){
        super(null);
    }
    public void paintComponent (Graphics g){
        g.drawLine(505,24,505,39);
        g.drawLine(505,59,134,89);
        g.drawLine(67,109,67,123);
        g.drawRect(9,88,176,23);
    }
}
