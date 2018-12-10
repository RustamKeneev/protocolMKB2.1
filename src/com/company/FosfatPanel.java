package com.company;

import javax.swing.*;
import java.awt.*;

public class FosfatPanel extends JPanel {
    public FosfatPanel(){
        super(null);
    }
    public void paintComponent (Graphics g){
        g.draw3DRect(446,5,164,25,true);
    }
}
