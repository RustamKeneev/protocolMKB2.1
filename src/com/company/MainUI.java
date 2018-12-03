package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainUI {
    public void build(String[] transparency, String[] ColoursOfUrine, String[] cilindresUrine, String[] slimeUrine, String []saltUrine) {
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel(new BorderLayout());
        jPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE));

        JPanel jPanel1 = new JPanel(new BorderLayout());
        jPanel.add(jPanel1, BorderLayout.EAST);
        jPanel1.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        jPanel1.setPreferredSize(new Dimension(120, 35));
        JPanel jPanelButtonResult = new JPanel();
        JButton jButtonresult = new JButton("<html>Выдать <br>результат</html>");
        jButtonresult.setPreferredSize(new Dimension(120, 35));
        jPanelButtonResult.add(jButtonresult);
        jPanel1.add(jPanelButtonResult);

        JPanel jPanelWest = new JPanel(null);
        jPanelWest.setPreferredSize(new Dimension(108, 0));
        jPanel.add(jPanelWest, BorderLayout.WEST);

        JPanel jPanel2 = new JPanel(null);
        jPanel.add(jPanel2, BorderLayout.CENTER);
        jPanel2.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        jPanel2.setPreferredSize(new Dimension(1020, 3500));

        JPanel jPanel3 = new JpanelLongStone();
        jPanel2.add(jPanel3);
        jPanel3.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        jPanel3.setBounds(10, 10, 1095, 280);
        JLabel stoneClassification = new JLabel("КЛИНИЧЕСКИЙ ПРОТОКОЛ ПО МКБ:");
        stoneClassification.setBounds(472, 10, 370, 20);
        jPanel3.add(stoneClassification);

        JLabel jLabel1 = new JLabel("ПО ЛОКАЛИЗАЦИИ КОНКРЕМЕНТА СПРАВА:");
        jLabel1.setBounds(10, 35, 330, 20);
        jPanel3.add(jLabel1);
        JLabel jLabel2 = new JLabel("Верхняя чашечка");
        jLabel2.setBounds(10, 55, 150, 20);
        jPanel3.add(jLabel2);
        JTextField jTextField = new JTextField();
        jTextField.setBounds(250, 55, 40, 20);
        jPanel3.add(jTextField);
        JLabel jLabel3 = new JLabel("мм");
        jLabel3.setBounds(295, 55, 20, 20);
        jPanel3.add(jLabel3);
        JLabel jLabel4 = new JLabel("Средняя чашечка");
        jLabel4.setBounds(10, 80, 150, 20);
        jPanel3.add(jLabel4);
        JTextField jTextField1 = new JTextField();
        jTextField1.setBounds(250, 80, 40, 20);
        jPanel3.add(jTextField1);
        JLabel jLabel5 = new JLabel("мм");
        jLabel5.setBounds(295, 80, 20, 20);
        jPanel3.add(jLabel5);
        JLabel jLabel6 = new JLabel("Нижняя чашечка");
        jLabel6.setBounds(10, 105, 150, 20);
        jPanel3.add(jLabel6);
        JTextField jTextField2 = new JTextField();
        jTextField2.setBounds(250, 105, 40, 20);
        jPanel3.add(jTextField2);
        JLabel jLabel7 = new JLabel("мм");
        jLabel7.setBounds(295, 105, 20, 20);
        jPanel3.add(jLabel7);
        JLabel jLabel8 = new JLabel("Почечная лоханка");
        jLabel8.setBounds(10, 130, 150, 20);
        jPanel3.add(jLabel8);
        JTextField jTextField3 = new JTextField();
        jTextField3.setBounds(250, 130, 40, 20);
        jPanel3.add(jTextField3);
        JLabel jLabel9 = new JLabel("мм");
        jLabel9.setBounds(295, 130, 20, 20);
        jPanel3.add(jLabel9);
        JLabel jLabel10 = new JLabel("вехний отдел мочеточника");
        jLabel10.setBounds(10, 155, 190, 20);
        jPanel3.add(jLabel10);
        JTextField jTextField4 = new JTextField();
        jTextField4.setBounds(250, 155, 40, 20);
        jPanel3.add(jTextField4);
        JLabel jLabel11 = new JLabel("мм");
        jLabel11.setBounds(295, 155, 20, 20);
        jPanel3.add(jLabel11);
        JLabel jLabel12 = new JLabel("средний отдел мочеточника");
        jLabel12.setBounds(10, 180, 225, 20);
        jPanel3.add(jLabel12);
        JTextField jTextField5 = new JTextField();
        jTextField5.setBounds(250, 180, 40, 20);
        jPanel3.add(jTextField5);
        JLabel jLabel13 = new JLabel("мм");
        jLabel13.setBounds(295, 180, 20, 20);
        jPanel3.add(jLabel13);
        JLabel jLabel14 = new JLabel("<html>нижний (дистальный) отдел<br> мочеточника</html>");
        jLabel14.setBounds(10, 207, 245, 30);
        jPanel3.add(jLabel14);
        JTextField jTextField6 = new JTextField();
        jTextField6.setBounds(250, 205, 40, 20);
        jPanel3.add(jTextField6);
        JLabel jLabel15 = new JLabel("мм");
        jLabel15.setBounds(295, 203, 20, 20);
        jPanel3.add(jLabel15);

        JLabel jLabel16 = new JLabel("ПО ЛОКАЛИЗАЦИИ КОНКРЕМЕНТА СЛЕВА:");
        jLabel16.setBounds(390, 35, 350, 20);
        jPanel3.add(jLabel16);
        JLabel jLabel17 = new JLabel("Верхняя чашечка");
        jLabel17.setBounds(390, 55, 150, 20);
        jPanel3.add(jLabel17);
        JTextField jTextField7 = new JTextField();
        jTextField7.setBounds(615, 55, 40, 20);
        jPanel3.add(jTextField7);
        JLabel jLabel18 = new JLabel("мм");
        jLabel18.setBounds(660, 55, 20, 20);
        jPanel3.add(jLabel18);
        JLabel jLabel19 = new JLabel("Средняя чашечка");
        jLabel19.setBounds(390, 80, 150, 20);
        jPanel3.add(jLabel19);
        JTextField jTextField8 = new JTextField();
        jTextField8.setBounds(615, 80, 40, 20);
        jPanel3.add(jTextField8);
        JLabel jLabel20 = new JLabel("мм");
        jLabel20.setBounds(660, 80, 20, 20);
        jPanel3.add(jLabel20);
        JLabel jLabel21 = new JLabel("Нижняя чашечка");
        jLabel21.setBounds(390, 105, 150, 20);
        jPanel3.add(jLabel21);
        JTextField jTextField9 = new JTextField();
        jTextField9.setBounds(615, 105, 40, 20);
        jPanel3.add(jTextField9);
        JLabel jLabel22 = new JLabel("мм");
        jLabel22.setBounds(660, 105, 20, 20);
        jPanel3.add(jLabel22);
        JLabel jLabel23 = new JLabel("Почечная лоханка");
        jLabel23.setBounds(390, 130, 150, 20);
        jPanel3.add(jLabel23);
        JTextField jTextField10 = new JTextField();
        jTextField10.setBounds(615, 130, 40, 20);
        jPanel3.add(jTextField10);
        JLabel jLabel24 = new JLabel("мм");
        jLabel24.setBounds(660, 130, 20, 20);
        jPanel3.add(jLabel24);
        JLabel jLabel25 = new JLabel("вехний отдел мочеточника");
        jLabel25.setBounds(390, 155, 190, 20);
        jPanel3.add(jLabel25);
        JTextField jTextField11 = new JTextField();
        jTextField11.setBounds(615, 155, 40, 20);
        jPanel3.add(jTextField11);
        JLabel jLabel26 = new JLabel("мм");
        jLabel26.setBounds(660, 155, 20, 20);
        jPanel3.add(jLabel26);
        JLabel jLabel27 = new JLabel("средний отдел мочеточника");
        jLabel27.setBounds(390, 180, 220, 20);
        jPanel3.add(jLabel27);
        JTextField jTextField12 = new JTextField();
        jTextField12.setBounds(615, 180, 40, 20);
        jPanel3.add(jTextField12);
        JLabel jLabel28 = new JLabel("мм");
        jLabel28.setBounds(660, 180, 20, 20);
        jPanel3.add(jLabel28);
        JLabel jLabel29 = new JLabel("<html>нижний (дистальный) отдел<br> мочеточника</html>");
        jLabel29.setBounds(390, 207, 250, 30);
        jPanel3.add(jLabel29);
        JTextField jTextField13 = new JTextField();
        jTextField13.setBounds(615, 205, 40, 20);
        jPanel3.add(jTextField13);
        JLabel jLabel30 = new JLabel("мм");
        jLabel30.setBounds(660, 203, 20, 20);
        jPanel3.add(jLabel30);

        JLabel jLabel31 = new JLabel("ПО ЛОКАЛИЗАЦИИ КОНКРЕМЕНТА:");
        jLabel31.setBounds(750, 35, 250, 20);
        jPanel3.add(jLabel31);
        JLabel jLabel32 = new JLabel("Мочевой пузырь");
        jLabel32.setBounds(750, 55, 195, 20);
        jPanel3.add(jLabel32);
        JTextField jTextField14 = new JTextField();
        jTextField14.setBounds(925, 55, 40, 20);
        jPanel3.add(jTextField14);
        JLabel jLabel33 = new JLabel("мм");
        jLabel33.setBounds(970, 55, 20, 20);
        jPanel3.add(jLabel33);
        JLabel jLabel34 = new JLabel("Уретра");
        jLabel34.setBounds(750, 80, 195, 20);
        jPanel3.add(jLabel34);
        JTextField jTextField15 = new JTextField();
        jTextField15.setBounds(925, 80, 40, 20);
        jPanel3.add(jTextField15);
        JLabel jLabel35 = new JLabel("мм");
        jLabel35.setBounds(970, 80, 20, 20);
        jPanel3.add(jLabel35);

        JLabel jLabel36 = new JLabel("ПО КЛИНИКЕ:");
        jLabel36.setBounds(750, 110, 150, 20);
        jPanel3.add(jLabel36);
        JCheckBox jCheckBox = new JCheckBox("первичный");
        jCheckBox.setBounds(750, 130, 150, 20);
        jPanel3.add(jCheckBox);
        JCheckBox jCheckBox1 = new JCheckBox("рецидивный");
        jCheckBox1.setBounds(750, 155, 150, 20);
        jPanel3.add(jCheckBox1);
        JCheckBox jCheckBox2 = new JCheckBox("инфицированный");
        jCheckBox2.setBounds(750, 180, 150, 20);
        jPanel3.add(jCheckBox2);
        JCheckBox jCheckBox3 = new JCheckBox("не инфицированный");
        jCheckBox3.setBounds(750, 205, 200, 20);
        jPanel3.add(jCheckBox3);


        JLabel jLabel37 = new JLabel("<html><i>Конкременты подразделяются на группы размером: 1) < 5 мм, 2) 5–10 мм, 3) 10–20 мм и 4) > 20 мм.</i></html>");
        jLabel37.setBounds(260, 255, 800, 20);
        jPanel3.add(jLabel37);

        JPanel jPanel4 = new JPanel(null);
        jPanel2.add(jPanel4);
        jPanel4.setBounds(10, 295, 1095, 150);
        jPanel4.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel jLabel38 = new JLabel("ПО РЕНТГЕЛОГИЧЕСКОЙ ХАРАКТЕРИСТИКЕ:");
        jLabel38.setBounds(419, 5, 350, 20);
        jPanel4.add(jLabel38);
        JLabel jLabel39 = new JLabel("РЕНТГЕНОКОНТРАСТНЫЙ КАМЕНЬ:");
        jLabel39.setBounds(10, 25, 250, 20);
        jPanel4.add(jLabel39);
        JCheckBox jCheckBox4 = new JCheckBox("Дигидрат  оксалат кальция");
        jCheckBox4.setBounds(10, 45, 250, 20);
        jPanel4.add(jCheckBox4);
        JCheckBox jCheckBox5 = new JCheckBox("Моногидрат оксалат кальция");
        jCheckBox5.setBounds(10, 65, 250, 20);
        jPanel4.add(jCheckBox5);
        JCheckBox jCheckBox6 = new JCheckBox("Фосфат кальция");
        jCheckBox6.setBounds(10, 85, 150, 20);
        jPanel4.add(jCheckBox6);
        JLabel jLabel40 = new JLabel("НИЗКАЯ РЕНТГЕНОКОНТРАСТНОСТЬ:");
        jLabel40.setBounds(390, 25, 300, 20);
        jPanel4.add(jLabel40);
        JCheckBox jCheckBox7 = new JCheckBox("Фосфат магния и аммония");
        jCheckBox7.setBounds(390, 45, 250, 20);
        jPanel4.add(jCheckBox7);
        JCheckBox jCheckBox8 = new JCheckBox("Апатит");
        jCheckBox8.setBounds(390, 65, 100, 20);
        jPanel4.add(jCheckBox8);
        JCheckBox jCheckBox9 = new JCheckBox("Цистин");
        jCheckBox9.setBounds(390, 85, 100, 20);
        jPanel4.add(jCheckBox9);
        JLabel jLabel41 = new JLabel("РЕНТГЕННЕГАТИВНЫЙ КОНКРЕМЕНТ:");
        jLabel41.setBounds(750, 25, 300, 20);
        jPanel4.add(jLabel41);
        JCheckBox jCheckBox10 = new JCheckBox("Мочевая кислота");
        jCheckBox10.setBounds(750, 45, 150, 20);
        jPanel4.add(jCheckBox10);
        JCheckBox jCheckBox11 = new JCheckBox("Урат аммония");
        jCheckBox11.setBounds(750, 65, 150, 20);
        jPanel4.add(jCheckBox11);
        JCheckBox jCheckBox12 = new JCheckBox("Ксантин");
        jCheckBox12.setBounds(750, 85, 100, 20);
        jPanel4.add(jCheckBox12);
        JCheckBox jCheckBox13 = new JCheckBox("2,8-дигидроксиаденин");
        jCheckBox13.setBounds(750, 105, 200, 20);
        jPanel4.add(jCheckBox13);
        JCheckBox jCheckBox14 = new JCheckBox("Лекарственные камни");
        jCheckBox14.setBounds(750, 125, 200, 20);
        jPanel4.add(jCheckBox14);

        JPanel jPanel5 = new JPanel(null);
        jPanel2.add(jPanel5);
        jPanel5.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        jPanel5.setBounds(10, 450, 1095, 115);
        JLabel jLabel42 = new JLabel("ПО ЭТИОЛОГИИ");
        jLabel42.setBounds(472, 5, 150, 20);
        jPanel5.add(jLabel42);
        JLabel jLabel43 = new JLabel("НЕИНФЕКЦИОННЫЕ КАМНИ");
        jLabel43.setBounds(10, 25, 250, 20);
        jPanel5.add(jLabel43);
        JCheckBox jCheckBox15 = new JCheckBox("оксалат кальция");
        jCheckBox15.setBounds(10, 45, 150, 20);
        jPanel5.add(jCheckBox15);
        JCheckBox jCheckBox16 = new JCheckBox("фосфат кальция");
        jCheckBox16.setBounds(10, 65, 150, 20);
        jPanel5.add(jCheckBox16);
        JCheckBox jCheckBox17 = new JCheckBox("мочевая кислота");
        jCheckBox17.setBounds(10, 85, 150, 20);
        jPanel5.add(jCheckBox17);
        JLabel jLabel44 = new JLabel("ИНФНЕЦИОННЫЕ КАМНИ:");
        jLabel44.setBounds(275, 25, 200, 20);
        jPanel5.add(jLabel44);
        JCheckBox jCheckBox18 = new JCheckBox("фосфат магния-аммония");
        jCheckBox18.setBounds(275, 45, 200, 20);
        jPanel5.add(jCheckBox18);
        JCheckBox jCheckBox19 = new JCheckBox("апатит");
        jCheckBox19.setBounds(275, 65, 100, 20);
        jPanel5.add(jCheckBox19);
        JCheckBox jCheckBox20 = new JCheckBox("урат аммония");
        jCheckBox20.setBounds(275, 85, 150, 20);
        jPanel5.add(jCheckBox20);
        JLabel jLabel45 = new JLabel("ГЕНЕТИЧЕСКИЕ ПРИЧИНЫ:");
        jLabel45.setBounds(550, 25, 250, 20);
        jPanel5.add(jLabel45);
        JCheckBox jCheckBox21 = new JCheckBox("цистин");
        jCheckBox21.setBounds(550, 45, 100, 20);
        jPanel5.add(jCheckBox21);
        JCheckBox jCheckBox22 = new JCheckBox("ксантин");
        jCheckBox22.setBounds(550, 65, 120, 20);
        jPanel5.add(jCheckBox22);
        JCheckBox jCheckBox23 = new JCheckBox("2,8-дигидроксиаденин");
        jCheckBox23.setBounds(550, 85, 200, 20);
        jPanel5.add(jCheckBox23);
        JLabel jLabel46 = new JLabel("ЛЕКАРСТВЕННЫЕ КАМНИ:");
        jLabel46.setBounds(800, 25, 250, 20);
        jPanel5.add(jLabel46);

        JPanel jPanel6 = new MineralogicalComposition();
        jPanel6.setBounds(10, 570, 1095, 815);
        jPanel6.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        jPanel2.add(jPanel6);
        JLabel jLabel47 = new JLabel("ПО МИНЕРАЛОГИЧЕСКОМУ СОСТАВУ");
        jLabel47.setBounds(396, 5, 300, 20);
        jPanel6.add(jLabel47);
        JLabel jLabel48 = new JLabel("НАЗВАНИЕ ХИМИЧЕСКОГО ВЕЩЕСТВА:");
        jLabel48.setBounds(55, 30, 300, 20);
        jPanel6.add(jLabel48);
        JLabel jLabel49 = new JLabel("НАЗВАНИЕ МИНЕРАЛА:");
        jLabel49.setBounds(460, 30, 200, 20);
        jPanel6.add(jLabel49);
        JLabel jLabel50 = new JLabel("ХИМИЧЕСКАЯ ФОРМУЛА:");
        jLabel50.setBounds(820, 30, 200, 20);
        jPanel6.add(jLabel50);
        JCheckBox jCheckBox24 = new JCheckBox("Моногидрат оксалата кальция");
        jCheckBox24.setBounds(15, 58, 250, 20);
        jPanel6.add(jCheckBox24);
        JLabel jLabel51 = new JLabel("Вевеллит");
        jLabel51.setBounds(385, 58, 100, 20);
        jPanel6.add(jLabel51);
        JLabel jLabel52 = new JLabel("CaC2O4.H2O");
        jLabel52.setBounds(760, 58, 150, 20);
        jPanel6.add(jLabel52);
        JCheckBox jCheckBox25 = new JCheckBox("Дигидрат оксалата кальция");
        jCheckBox25.setBounds(15, 83, 250, 20);
        jPanel6.add(jCheckBox25);
        JLabel jLabel53 = new JLabel("Ведделлит");
        jLabel53.setBounds(385, 83, 120, 20);
        jPanel6.add(jLabel53);
        JLabel jLabel54 = new JLabel("CaC2O4.2H2O");
        jLabel54.setBounds(760, 83, 150, 20);
        jPanel6.add(jLabel54);
        JCheckBox jCheckBox26 = new JCheckBox("Фосфат кальция");
        jCheckBox26.setBounds(15, 108, 150, 20);
        jPanel6.add(jCheckBox26);
        JLabel jLabel55 = new JLabel("Апатит");
        jLabel55.setBounds(385, 108, 100, 20);
        jPanel6.add(jLabel55);
        JLabel jLabel56 = new JLabel("Ca10(PO4)6.(OH)2");
        jLabel56.setBounds(760, 108, 200, 20);
        jPanel6.add(jLabel56);
        JCheckBox jCheckBox27 = new JCheckBox("Гидроксофосфат кальция");
        jCheckBox27.setBounds(15, 133, 250, 20);
        jPanel6.add(jCheckBox27);
        JLabel jLabel57 = new JLabel("Гидроксиапатит");
        jLabel57.setBounds(385, 133, 150, 20);
        jPanel6.add(jLabel57);
        JLabel jLabel58 = new JLabel("Ca5(PO3)3(OH)");
        jLabel58.setBounds(760, 133, 150, 20);
        jPanel6.add(jLabel58);
        JCheckBox jCheckBox28 = new JCheckBox("β-трехкальциевый фосфат");
        jCheckBox28.setBounds(15, 158, 250, 20);
        jPanel6.add(jCheckBox28);
        JLabel jLabel59 = new JLabel("Витлокит");
        jLabel59.setBounds(385, 158, 120, 20);
        jPanel6.add(jLabel59);
        JLabel jLabel60 = new JLabel("Ca3(PO4)2");
        jLabel60.setBounds(760, 158, 150, 20);
        jPanel6.add(jLabel60);
        JCheckBox jCheckBox29 = new JCheckBox("Фосфат карбонатапатита");
        jCheckBox29.setBounds(15, 183, 250, 20);
        jPanel6.add(jCheckBox29);
        JLabel jLabel61 = new JLabel("Даллит");
        jLabel61.setBounds(385, 183, 100, 20);
        jPanel6.add(jLabel61);
        JLabel jLabel62 = new JLabel("Ca5(PO4)3OH");
        jLabel62.setBounds(760, 183, 150, 20);
        jPanel6.add(jLabel62);
        JCheckBox jCheckBox30 = new JCheckBox("Гидрогенфосфат кальция");
        jCheckBox30.setBounds(15, 208, 300, 20);
        jPanel6.add(jCheckBox30);
        JLabel jLabel63 = new JLabel("Брушит");
        jLabel63.setBounds(385, 208, 100, 20);
        jPanel6.add(jLabel63);
        JLabel jLabel64 = new JLabel("CaHPO4.2H2O");
        jLabel64.setBounds(760, 208, 200, 20);
        jPanel6.add(jLabel64);
        JCheckBox jCheckBox31 = new JCheckBox("Карбонат кальция");
        jCheckBox31.setBounds(15, 233, 200, 20);
        jPanel6.add(jCheckBox31);
        JLabel jLabel65 = new JLabel("Арагонит");
        jLabel65.setBounds(385, 233, 120, 20);
        jPanel6.add(jLabel65);
        JLabel jLabel66 = new JLabel("CaCO3");
        jLabel66.setBounds(760, 233, 100, 20);
        jPanel6.add(jLabel66);
        JCheckBox jCheckBox32 = new JCheckBox("Восьмикальциевый фосфат");
        jCheckBox32.setBounds(15, 258, 250, 20);
        jPanel6.add(jCheckBox32);
        JLabel jLabel67 = new JLabel("Ca8H2(PO4)6.5H2O");
        jLabel67.setBounds(760, 258, 200, 20);
        jPanel6.add(jLabel67);
        JCheckBox jCheckBox33 = new JCheckBox("Дигидрат мочевой кислоты");
        jCheckBox33.setBounds(15, 283, 250, 20);
        jPanel6.add(jCheckBox33);
        JLabel jLabel68 = new JLabel("Урицит");
        jLabel68.setBounds(385, 283, 120, 20);
        jPanel6.add(jLabel68);
        JLabel jLabel69 = new JLabel("C5H4N4O3");
        jLabel69.setBounds(760, 283, 120, 20);
        jPanel6.add(jLabel69);
        JCheckBox jCheckBox34 = new JCheckBox("Урат аммония");
        jCheckBox34.setBounds(15, 308, 150, 20);
        jPanel6.add(jCheckBox34);
        JLabel jLabel70 = new JLabel("NH4C5H3N4O3");
        jLabel70.setBounds(760, 308, 200, 20);
        jPanel6.add(jLabel70);
        JCheckBox jCheckBox35 = new JCheckBox("Кислый урат натрия моногидрат");
        jCheckBox35.setBounds(15, 333, 300, 20);
        jPanel6.add(jCheckBox35);
        JLabel jLabel71 = new JLabel("NaC5H3N4O3.H2O");
        jLabel71.setBounds(760, 333, 200, 20);
        jPanel6.add(jLabel71);
        JCheckBox jCheckBox36 = new JCheckBox("Фосфат магния-аммония");
        jCheckBox36.setBounds(15, 358, 200, 20);
        jPanel6.add(jCheckBox36);
        JLabel jLabel72 = new JLabel("Струвит");
        jLabel72.setBounds(385, 358, 100, 20);
        jPanel6.add(jLabel72);
        JLabel jLabel73 = new JLabel("MgNH4PO4.6H2O");
        jLabel73.setBounds(760, 358, 200, 20);
        jPanel6.add(jLabel73);
        JCheckBox jCheckBox37 = new JCheckBox("Кислый фосфат магния тригидрат");
        jCheckBox37.setBounds(15, 383, 300, 20);
        jPanel6.add(jCheckBox37);
        JLabel jLabel74 = new JLabel("Ньюберит");
        jLabel74.setBounds(385, 383, 150, 20);
        jPanel6.add(jLabel74);
        JLabel jLabel75 = new JLabel("MgHPO4.3H2O");
        jLabel75.setBounds(760, 383, 200, 20);
        jPanel6.add(jLabel75);
        JCheckBox jCheckBox38 = new JCheckBox("Фосфат магния-аммония дигидрат");
        jCheckBox38.setBounds(15, 408, 300, 20);
        jPanel6.add(jCheckBox38);
        JLabel jLabel76 = new JLabel("Диттмарит");
        jLabel76.setBounds(385, 408, 120, 20);
        jPanel6.add(jLabel76);
        JLabel jLabel77 = new JLabel("MgNH4(PO4).1H2O");
        jLabel77.setBounds(760, 408, 200, 20);
        jPanel6.add(jLabel77);
        JCheckBox jCheckBox39 = new JCheckBox("Цистин");
        jCheckBox39.setBounds(15, 433, 120, 20);
        jPanel6.add(jCheckBox39);
        JLabel jLabel78 = new JLabel("[SCH2CH(NH2)COOH]2");
        jLabel78.setBounds(760, 433, 200, 20);
        jPanel6.add(jLabel78);
        JCheckBox jCheckBox40 = new JCheckBox("Гипс");
        jCheckBox40.setBounds(15, 458, 100, 20);
        jPanel6.add(jCheckBox40);
        JLabel jLabel79 = new JLabel("Сульфат кальция дигидрат");
        jLabel79.setBounds(385, 458, 200, 20);
        jPanel6.add(jLabel79);
        JLabel jLabel80 = new JLabel("CaSO4.2H2O");
        jLabel80.setBounds(760, 458, 200, 20);
        jPanel6.add(jLabel80);
        JLabel jLabel81 = new JLabel("Фосфат цинка тетрагидрат");
        jLabel81.setBounds(385, 483, 200, 20);
        jPanel6.add(jLabel81);
        JLabel jLabel82 = new JLabel("Zn3(PO4)2.4H2O ");
        jLabel82.setBounds(760, 483, 200, 20);
        jPanel6.add(jLabel82);
        JCheckBox jCheckBox41 = new JCheckBox("Ксантин");
        jCheckBox41.setBounds(15, 508, 120, 20);
        jPanel6.add(jCheckBox41);
        JCheckBox jCheckBox42 = new JCheckBox("2,8-дигидроксиаденин");
        jCheckBox42.setBounds(15, 533, 200, 20);
        jPanel6.add(jCheckBox42);
        JCheckBox jCheckBox43 = new JCheckBox("Белки");
        jCheckBox43.setBounds(15, 558, 100, 20);
        jPanel6.add(jCheckBox43);
        JCheckBox jCheckBox44 = new JCheckBox("Холестерин");
        jCheckBox44.setBounds(15, 583, 150, 20);
        jPanel6.add(jCheckBox44);
        JCheckBox jCheckBox45 = new JCheckBox("Кальцит");
        jCheckBox45.setBounds(15, 608, 120, 20);
        jPanel6.add(jCheckBox45);
        JCheckBox jCheckBox46 = new JCheckBox("Урат калия");
        jCheckBox46.setBounds(15, 633, 150, 20);
        jPanel6.add(jCheckBox46);
        JCheckBox jCheckBox47 = new JCheckBox("Трехмагниевый фосфат");
        jCheckBox47.setBounds(15, 658, 200, 20);
        jPanel6.add(jCheckBox47);
        JCheckBox jCheckBox48 = new JCheckBox("Меламин");
        jCheckBox48.setBounds(15, 683, 120, 20);
        jPanel6.add(jCheckBox48);
        JCheckBox jCheckBox49 = new JCheckBox("Матрикс");
        jCheckBox49.setBounds(15, 708, 150, 20);
        jPanel6.add(jCheckBox49);
        JCheckBox jCheckBox50 = new JCheckBox("Лекарственные камни");
        jCheckBox50.setBounds(15, 733, 200, 20);
        jPanel6.add(jCheckBox50);
        JLabel jLabel83 = new JLabel("-Активные соединения, кристаллизующиеся в моче");
        jLabel83.setBounds(385, 733, 380, 20);
        jPanel6.add(jLabel83);
        JLabel jLabel84 = new JLabel("-Вещества, ухудшающие состав мочи");
        jLabel84.setBounds(385, 758, 300, 20);
        jPanel6.add(jLabel84);
        JCheckBox jCheckBox51 = new JCheckBox("Конкременты из инородных тел");
        jCheckBox51.setBounds(15, 783, 350, 20);
        jPanel6.add(jCheckBox51);

        JPanel jPanel7 = new JPanel(null);
        jPanel2.add(jPanel7);
        jPanel7.setBounds(10, 1390, 1095, 765);
        jPanel7.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel jLabel85 = new JLabel("ПО ГРУППАМ РИСКА ОБРАЗОВАНИЯ КАМНЕЙ");
        jLabel85.setBounds(385, 5, 350, 20);
        jPanel7.add(jLabel85);
        JLabel jLabel86 = new JLabel("ОБЩИЕ ФАКТОРЫ:");
        jLabel86.setBounds(472, 25, 150, 20);
        jPanel7.add(jLabel86);
        JCheckBox jCheckBox52 = new JCheckBox("Развитие МКБ в раннем возрасте (особенно у детей и подростков)");
        jCheckBox52.setBounds(10, 45, 500, 20);
        jPanel7.add(jCheckBox52);
        JCheckBox jCheckBox53 = new JCheckBox("Семейный анамнез МКБ");
        jCheckBox53.setBounds(10, 65, 200, 20);
        jPanel7.add(jCheckBox53);
        JCheckBox jCheckBox54 = new JCheckBox("Брушит в составе камней (гидрогенфосфат кальция; СаНРО4  2(Н,0)");
        jCheckBox54.setBounds(10, 85, 600, 20);
        jPanel7.add(jCheckBox54);
        JCheckBox jCheckBox55 = new JCheckBox("Мочевая кислота и урат в составе камней");
        jCheckBox55.setBounds(10, 105, 500, 20);
        jPanel7.add(jCheckBox55);
        JCheckBox jCheckBox56 = new JCheckBox("Инфекционные камни");
        jCheckBox56.setBounds(10, 125, 200, 20);
        jPanel7.add(jCheckBox56);
        JCheckBox jCheckBox57 = new JCheckBox("Единственная почка");
        jCheckBox57.setBounds(10, 145, 200, 20);
        jPanel7.add(jCheckBox57);
        JLabel jLabel87 = new JLabel("ЗАБОЛЕВАНИЯ, СВЯЗАННЫЕ С РАЗВИТИЕМ МКБ:");
        jLabel87.setBounds(372, 165, 350, 20);
        jPanel7.add(jLabel87);
        JCheckBox jCheckBox58 = new JCheckBox("Гиперпаратиреоз");
        jCheckBox58.setBounds(10, 185, 150, 20);
        jPanel7.add(jCheckBox58);
        JCheckBox jCheckBox59 = new JCheckBox("Метаболический синдром");
        jCheckBox59.setBounds(10, 205, 250, 20);
        jPanel7.add(jCheckBox59);
        JCheckBox jCheckBox60 = new JCheckBox("Поликистозная болезнь почек");
        jCheckBox60.setBounds(10, 225, 250, 20);
        jPanel7.add(jCheckBox60);
        JCheckBox jCheckBox61 = new JCheckBox("Нефрокальциноз");
        jCheckBox61.setBounds(10, 245, 150, 20);
        jPanel7.add(jCheckBox61);
        JCheckBox jCheckBox62 = new JCheckBox("<html>Заболевания и патологии ЖКТ (еюноилеальный обходной анастомоз, резекция кишечника,болезнь Крона," +
                " мальабсорбция, кишечная гипероксалурия после деривации мочи) и бариатрические операции</html");
        jCheckBox62.setBounds(10, 265, 1080, 30);
        jPanel7.add(jCheckBox62);
        JCheckBox jCheckBox63 = new JCheckBox("Саркоидоз");
        jCheckBox63.setBounds(10, 295, 150, 20);
        jPanel7.add(jCheckBox63);
        JCheckBox jCheckBox64 = new JCheckBox("Повреждение спинного мозга, нейрогенный мочевой пузырь");
        jCheckBox64.setBounds(10, 315, 500, 20);
        jPanel7.add(jCheckBox64);
        JLabel jLabel88 = new JLabel("ГЕНЕТИЧЕСКИЕ ПРИЧИНЫ МКБ:");
        jLabel88.setBounds(427, 335, 240, 20);
        jPanel7.add(jLabel88);
        JCheckBox jCheckBox65 = new JCheckBox("Цистинурия (типы А, В, АВ)");
        jCheckBox65.setBounds(10, 355, 250, 20);
        jPanel7.add(jCheckBox65);
        JCheckBox jCheckBox66 = new JCheckBox("Первичная гипероксалурия (ПГ)");
        jCheckBox66.setBounds(10, 375, 250, 20);
        jPanel7.add(jCheckBox66);
        JCheckBox jCheckBox67 = new JCheckBox("Почечный канальцевый ацидоз (ПКА) 1-го типа");
        jCheckBox67.setBounds(10, 395, 500, 20);
        jPanel7.add(jCheckBox67);
        JCheckBox jCheckBox68 = new JCheckBox("2,8-дигидроксиаденинурия");
        jCheckBox68.setBounds(10, 415, 250, 20);
        jPanel7.add(jCheckBox68);
        JCheckBox jCheckBox69 = new JCheckBox("Ксантинурия");
        jCheckBox69.setBounds(10, 435, 150, 20);
        jPanel7.add(jCheckBox69);
        JCheckBox jCheckBox70 = new JCheckBox("Синдром Леша-Нихена");
        jCheckBox70.setBounds(10, 455, 200, 20);
        jPanel7.add(jCheckBox70);
        JCheckBox jCheckBox71 = new JCheckBox("Муковисцидоз");
        jCheckBox71.setBounds(10, 475, 200, 20);
        jPanel7.add(jCheckBox71);
        JLabel jLabel89 = new JLabel("ЛЕКАРСТВЕННЫЕ ПРЕПАРАТЫ, СПОСОБСТВУЩИЕ КАМНЕОБРАЗОВАНИЮ:");
        jLabel89.setBounds(287, 495, 520, 20);
        jPanel7.add(jLabel89);
        JCheckBox jCheckBox72 = new JCheckBox("Кальциевые добавки");
        jCheckBox72.setBounds(10, 515, 200, 20);
        jPanel7.add(jCheckBox72);
        JCheckBox jCheckBox73 = new JCheckBox("Добавки с витамином D");
        jCheckBox73.setBounds(10, 535, 200, 20);
        jPanel7.add(jCheckBox73);
        JCheckBox jCheckBox74 = new JCheckBox("Аскорбиновая кислота (>4 г в день)");
        jCheckBox74.setBounds(10, 555, 350, 20);
        jPanel7.add(jCheckBox74);
        JCheckBox jCheckBox75 = new JCheckBox("Сульфаниламиды (Триамтерен, Индинавира)");
        jCheckBox75.setBounds(10, 575, 350, 20);
        jPanel7.add(jCheckBox75);
        JLabel jLabel90 = new JLabel("АНАТОМИЧЕСКИЕ И УРОДИНАМИЧЕСКИЕ НАРУШЕНИЯ, СПОСОБСТВУЮЩИЕ КАМНЕОБРАЗОВАНИЮ:");
        jLabel90.setBounds(200, 595, 700, 20);
        jPanel7.add(jLabel90);
        JCheckBox jCheckBox76 = new JCheckBox("Медуллярная губчатая почка (тубулярная эктазия)");
        jCheckBox76.setBounds(10, 615, 400, 20);
        jPanel7.add(jCheckBox76);
        JCheckBox jCheckBox77 = new JCheckBox("Обструкция лоханочно-мочеточникового сегмента (ЛМС)");
        jCheckBox77.setBounds(10, 635, 500, 20);
        jPanel7.add(jCheckBox77);
        JCheckBox jCheckBox78 = new JCheckBox("Дивертикул чашки, киста чашки");
        jCheckBox78.setBounds(10, 655, 400, 20);
        jPanel7.add(jCheckBox78);
        JCheckBox jCheckBox79 = new JCheckBox("Стриктура мочеточника");
        jCheckBox79.setBounds(10, 675, 250, 20);
        jPanel7.add(jCheckBox79);
        JCheckBox jCheckBox80 = new JCheckBox("Пузырно-мочеточниково-почечный рефлюкс");
        jCheckBox80.setBounds(10, 695, 400, 20);
        jPanel7.add(jCheckBox80);
        JCheckBox jCheckBox81 = new JCheckBox("Подковообразная почка");
        jCheckBox81.setBounds(10, 715, 250, 20);
        jPanel7.add(jCheckBox81);
        JCheckBox jCheckBox82 = new JCheckBox("Уретероцеле");
        jCheckBox82.setBounds(10, 735, 200, 20);
        jPanel7.add(jCheckBox82);

        JPanel jPanel8 = new JPanel(null);
        jPanel2.add(jPanel8);
        jPanel8.setBounds(10, 2160, 1095, 175);
        jPanel8.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel jLabel91 = new JLabel("ПРОДОЛЖИТЕЛЬНОСТЬ КЛИНИЧЕСКОЙ КАРТИНЫ");
        jLabel91.setBounds(408, 5, 400, 20);
        jPanel8.add(jLabel91);
        JLabel jLabel92 = new JLabel("Почечная колика:");
        jLabel92.setBounds(10, 25, 130, 20);
        jPanel8.add(jLabel92);
        JLabel jLabel93 = new JLabel("Часы:");
        jLabel93.setBounds(140, 25, 50, 20);
        jPanel8.add(jLabel93);
        JTextField jTextField16 = new JTextField();
        jTextField16.setBounds(190,28,40,20);
        jPanel8.add(jTextField16);
        JLabel jLabel94 = new JLabel("Сутки:");
        jLabel94.setBounds(240,25,70,20);
        jPanel8.add(jLabel94);
        JTextField jTextField17 = new JTextField();
        jTextField17.setBounds(295,28,40,20);
        jPanel8.add(jTextField17);
        JLabel jLabel95 = new JLabel("Двигательное возбуждение:");
        jLabel95.setBounds(350,25,220,20);
        jPanel8.add(jLabel95);
        JLabel jLabel96 = new JLabel("Часы:");
        jLabel96.setBounds(560,25,50,20);
        jPanel8.add(jLabel96);
        JTextField jTextField18 = new JTextField();
        jTextField18.setBounds(610,28,40,20);
        jPanel8.add(jTextField18);
        JLabel jLabel97 = new JLabel("Сутки:");
        jLabel97.setBounds(660,25,50,20);
        jPanel8.add(jLabel97);
        JTextField jTextField19 = new JTextField();
        jTextField19.setBounds(710,28,40,20);
        jPanel8.add(jTextField19);
        JLabel jLabel98 = new JLabel("Тошнота, рвота:");
        jLabel98.setBounds(770,25,150,20);
        jPanel8.add(jLabel98);
        JLabel jLabel99 = new JLabel("Часы:");
        jLabel99.setBounds(895,25,50,20);
        jPanel8.add(jLabel99);
        JTextField jTextField20 = new JTextField();
        jTextField20.setBounds(945,28,40,20);
        jPanel8.add(jTextField20);
        JLabel jLabel100 = new JLabel("Сутки:");
        jLabel100.setBounds(990,25,50,20);
        jPanel8.add(jLabel100);
        JTextField jTextField21 = new JTextField();
        jTextField21.setBounds(1040,28,40,20);
        jPanel8.add(jTextField21);
        JLabel jLabel101 = new JLabel("Возможное повышение температуры тела с потрясающим ознобом:");
        jLabel101.setBounds(10,50,480,20);
        jPanel8.add(jLabel101);
        JLabel jLabel102 = new JLabel("Часы:");
        jLabel102.setBounds(560,50,50,20);
        jPanel8.add(jLabel102);
        JTextField jTextField22 = new JTextField();
        jTextField22.setBounds(610,53,40,20);
        jPanel8.add(jTextField22);
        JLabel jLabel103 = new JLabel("Сутки:");
        jLabel103.setBounds(660,50,50,20);
        jPanel8.add(jLabel103);
        JTextField jTextField23 = new JTextField();
        jTextField23.setBounds(710,53,40,20);
        jPanel8.add(jTextField23);
        JLabel jLabel104 = new JLabel("Дизурия:");
        jLabel104.setBounds(770,50,140,20);
        jPanel8.add(jLabel104);
        JLabel jLabel105 = new JLabel("Часы:");
        jLabel105.setBounds(895,50,50,20);
        jPanel8.add(jLabel105);
        JTextField jTextField24 = new JTextField();
        jTextField24.setBounds(945,53,40,20);
        jPanel8.add(jTextField24);
        JLabel jLabel106 = new JLabel("Сутки:");
        jLabel106.setBounds(990,50,50,20);
        jPanel8.add(jLabel106);
        JTextField jTextField25 = new JTextField();
        jTextField25.setBounds(1040,53,40,20);
        jPanel8.add(jTextField25);
        JLabel jLabel107 = new JLabel("<html>Специфичные изменения локализации болевых ощущений при перемещении конкремента:</html>");
        jLabel107.setBounds(10,138,600,30);
        jPanel8.add(jLabel107);
        JLabel jLabel108 = new JLabel("Часы:");
        jLabel108.setBounds(560,138,50,20);
        jPanel8.add(jLabel108);
        JTextField jTextField26 = new JTextField();
        jTextField26.setBounds(610,141,40,20);
        jPanel8.add(jTextField26);
        JLabel jLabel109 = new JLabel("Сутки:");
        jLabel109.setBounds(660,138,50,20);
        jPanel8.add(jLabel109);
        JTextField jTextField27 = new JTextField();
        jTextField27.setBounds(710,138,40,20);
        jPanel8.add(jTextField27);
        JLabel jLabel110 = new JLabel("Анурия при обтурации камнями обеих мочеточников или единственной почки:");
        jLabel110.setBounds(10,108,550,20);
        jPanel8.add(jLabel110);
        JLabel jLabel111 = new JLabel("Часы:");
        jLabel111.setBounds(560,108,50,20);
        jPanel8.add(jLabel111);
        JTextField jTextField28 = new JTextField();
        jTextField28.setBounds(610,111,40,20);
        jPanel8.add(jTextField28);
        JLabel jLabel112 = new JLabel("Сутки:");
        jLabel112.setBounds(660,108,50,20);
        jPanel8.add(jLabel112);
        JTextField jTextField29 = new JTextField();
        jTextField29.setBounds(710,111,40,20);
        jPanel8.add(jTextField29);
        JLabel jLabel113= new JLabel("Может также протекать бессимптомно:");
        jLabel113.setBounds(10,78,300,20);
        jPanel8.add(jLabel113);
        JLabel jLabel114 = new JLabel("Часы:");
        jLabel114.setBounds(300,78,50,20);
        jPanel8.add(jLabel114);
        JTextField jTextField30 = new JTextField();
        jTextField30.setBounds(350,81,40,20);
        jPanel8.add(jTextField30);
        JLabel jLabel115 = new JLabel("Сутки:");
        jLabel115.setBounds(400,78, 50,20);
        jPanel8.add(jLabel115);
        JTextField jTextField31 = new JTextField();
        jTextField31.setBounds(450,81,40,20);
        jPanel8.add(jTextField31);
        JLabel jLabel116 = new JLabel("Отхождение конкремента (специфический признак):");
        jLabel116.setBounds(520,78,370,20);
        jPanel8.add(jLabel116);
        JLabel jLabel117 = new JLabel("Часы:");
        jLabel117.setBounds(895,78,50,20);
        jPanel8.add(jLabel117);
        JTextField jTextField32 = new JTextField();
        jTextField32.setBounds(945,78,40,20);
        jPanel8.add(jTextField32);
        JLabel jLabel118 = new JLabel("Сутки:");
        jLabel118.setBounds(990,81,50,20);
        jPanel8.add(jLabel118);
        JTextField jTextField33 = new JTextField();
        jTextField33.setBounds(1040,81,40,20);
        jPanel8.add(jTextField33);

        JPanel jPanel9 = new JPanel(null);
        jPanel2.add(jPanel9);
        jPanel9.setBounds(10,2340,1095,220);
        jPanel9.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel jLabel119 = new JLabel("ДИАГНОСТИКА");
        jLabel119.setBounds(472,5,150,20);
        jPanel9.add(jLabel119);
        JLabel jLabel120 = new JLabel("<html>Стандартное обследование включает  " +
                "подробный сбор  анамнеза и физикальное исследование, лабораторные исследования и методы диагностической " +
                "визуализации методы диагностической визуализации и др.</html>");
        jLabel120.setBounds(10,25,1095,40);
        jPanel9.add(jLabel120);
        JLabel jLabel121 = new JLabel("Диагностическая визуализация");
        jLabel121.setBounds(422,65,250,20);
        jPanel9.add(jLabel121);
        JLabel jLabel122 = new JLabel("* УЗИ почек, мочеточников, мочевого пузыря (22,23).");
        jLabel122.setBounds(10,85,500,20);
        jPanel9.add(jLabel122);
        JLabel jLabel123 = new JLabel("* Обзорная урография (20,). Не следует назначать обзорный снимок, если планируется проведение бесконтрастной КТ(21).");
        jLabel123.setBounds(10,105,1095,20);
        jPanel9.add(jLabel123);
        JLabel jLabel124 = new JLabel("<html>Если обзорная урография не информативна следует провести бескотрастную КТ или, если последняя недоступна, внутривенную урографию (24)." +
                " Последнюю не рекомендуется  при аллергии на контрастное вещество, содержанием креатинина крови более 172 мкмоль\\л (25), принимающим метморфин, с миеломатозом." +
                "  Бесконтрастная КТ может быть использована для подтверждения диагноза МКБ у больных с почечной коликой, т.к. этот метод превосходит метод в/в экскреторной " +
                "урографии (26). КТ может определить среднюю плотность конкремента и расстояние от конкремента до кожного покрова — параметры, влияющие на эффективность ДУВЛ" +
                " (27-30). Но не предоставляет данных о функции почек и индивидуальных анатомических особенностях мочевыводящей системы, а также сопровождается высокой дозой облучения.</html>");
        jLabel124.setBounds(10,125,1095,85);
        jPanel9.add(jLabel124);

        JPanel jPanel10 = new JPanel(null);
        jPanel10.setBounds(10,2565,1095,435);
        jPanel2.add(jPanel10);
        jPanel10.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel jLabelClinicAnaliz = new JLabel("ЛАБОРАТОРНЫЕ ИССЛЕДОВАНИЯ");
        jLabelClinicAnaliz.setBounds(427,5,240,20);
        jPanel10.add(jLabelClinicAnaliz);
        JLabel jLabel125 = new JLabel("Рутинные лабораторные исследования при первичном выявлении МКБ (31-34), (А):");
        jLabel125.setBounds(247,25,600,20);
        jPanel10.add(jLabel125);

        JPanel jPanel11 = new JPanel(null);
        jPanel10.add(jPanel11);
        jPanel11.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        jPanel11.setBounds(5,50,185,375);
        JLabel jLabel126 = new JLabel("ОБЩИЙ АНАЛИЗ КРОВИ:");
        jLabel126.setBounds(5,10,185,20);
        jPanel11.add(jLabel126);
        JLabel jLabel127 = new JLabel("Гемоглобин:");
        jLabel127.setBounds(5,30,100,20);
        jPanel11.add(jLabel127);
        JTextField jTextField34 = new JTextField();
        jTextField34.setBounds(145,30,30,20);
        jPanel11.add(jTextField34);
        JLabel jLabel128 = new JLabel("Эритроциты:");
        jLabel128.setBounds(5,55,100,20);
        jPanel11.add(jLabel128);
        JTextField jTextField35 = new JTextField();
        jTextField35.setBounds(145,55,30,20);
        jPanel11.add(jTextField35);
        JLabel jLabel129 = new JLabel("Ht:");
        jLabel129.setBounds(5,80,100,20);
        jPanel11.add(jLabel129);
        JTextField jTextField36 = new JTextField();
        jTextField36.setBounds(145,80,30,20);
        jPanel11.add(jTextField36);
        JLabel jLabel130 = new JLabel("Лейкоциты:");
        jLabel130.setBounds(5,105,100,20);
        jPanel11.add(jLabel130);
        JTextField jTextField37 = new JTextField();
        jTextField37.setBounds(145,105,30,20);
        jPanel11.add(jTextField37);
        JLabel jLabel131 = new JLabel("ЦП:");
        jLabel131.setBounds(5,130,100,20);
        jPanel11.add(jLabel131);
        JTextField jTextField38 = new JTextField();
        jTextField38.setBounds(145,130,30,20);
        jPanel11.add(jTextField38);
        JLabel jLabel132 = new JLabel("Палочкоядерные:");
        jLabel132.setBounds(5,155,130,20);
        jPanel11.add(jLabel132);
        JTextField jTextField39 = new JTextField();
        jTextField39.setBounds(145,155,30,20);
        jPanel11.add(jTextField39);
        JLabel jLabel133 = new JLabel("Сегментоядерные:");
        jLabel133.setBounds(5,180,140,20);
        jPanel11.add(jLabel133);
        JTextField jTextField40 = new JTextField();
        jTextField40.setBounds(145,180,30,20);
        jPanel11.add(jTextField40);
        JLabel jLabel134 = new JLabel("Тромбоциты:");
        jLabel134.setBounds(5,205,100,20);
        jPanel11.add(jLabel134);
        JTextField jTextField41 = new JTextField();
        jTextField41.setBounds(145,205,30,20);
        jPanel11.add(jTextField41);
        JLabel jLabel135 = new JLabel("Эозинофилы:");
        jLabel135.setBounds(5,230,100,20);
        jPanel11.add(jLabel135);
        JTextField jTextField42 = new JTextField();
        jTextField42.setBounds(145,230,30,20);
        jPanel11.add(jTextField42);
        JLabel jLabel136 = new JLabel("Лимфоциты:");
        jLabel136.setBounds(5,255,100,20);
        jPanel11.add(jLabel136);
        JTextField jTextField43 = new JTextField();
        jTextField43.setBounds(145,255,30,20);
        jPanel11.add(jTextField43);
        JLabel jLabel137 = new JLabel("Моноциты:");
        jLabel137.setBounds(5,280,100,20);
        jPanel11.add(jLabel137);
        JTextField jTextField44 = new JTextField();
        jTextField44.setBounds(145,280,30,20);
        jPanel11.add(jTextField44);
        JLabel jLabel138 = new JLabel("Базофилы:");
        jLabel138.setBounds(5,305,100,20);
        jPanel11.add(jLabel138);
        JTextField jTextField45 = new JTextField();
        jTextField45.setBounds(145,305,30,20);
        jPanel11.add(jTextField45);
        JLabel jLabel139 = new JLabel("СОЭ:");
        jLabel139.setBounds(5,330, 100,20);
        jPanel11.add(jLabel139);
        JTextField jTextField46 = new JTextField();
        jTextField46.setBounds(145,330, 30,20);
        jPanel11.add(jTextField46);

        JPanel jPanel12 = new JPanel(null);
        jPanel10.add(jPanel12);
        jPanel12.setBounds(195,50,300,375);
        jPanel12.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel jLabel140 = new JLabel("ОБЩИЙ АНАЛИЗ МОЧИ:");
        jLabel140.setBounds(60,10, 180,20);
        jPanel12.add(jLabel140);
        JLabel jLabel141 = new JLabel("цвет:");
        jLabel141.setBounds(5,30,100,20);
        jPanel12.add(jLabel141);
        JComboBox jComboBox =new JComboBox(ColoursOfUrine);
        jComboBox.setBounds(135,30,160,20);
        jPanel12.add(jComboBox);
        JLabel jLabel142 = new JLabel("прозрачность:");
        jLabel142.setBounds(5,55,100,20);
        jPanel12.add(jLabel142);
        JComboBox jComboBox1 = new JComboBox(transparency);
        jPanel12.add(jComboBox1);
        jComboBox1.setBounds(135,55,160,20);
        JLabel jLabel143 = new JLabel("удельный вес:");
        jLabel143.setBounds(5,80,110,20);
        jPanel12.add(jLabel143);
        JTextField jTextField47 = new JTextField();
        jTextField47.setBounds(135,80,160,20);
        jPanel12.add(jTextField47);
        JLabel jLabel144 = new JLabel("белок:");
        jLabel144.setBounds(5,105,100,20);
        jPanel12.add(jLabel144);
        JTextField jTextField48 = new JTextField();
        jTextField48.setBounds(135,105,160,20);
        jPanel12.add(jTextField48);
        JLabel jLabel145 = new JLabel("плоский эпителий:");
        jLabel145.setBounds(5, 130,130,20);
        jPanel12.add(jLabel145);
        JTextField jTextField49 = new JTextField();
        jTextField49.setBounds(135,130,160,20);
        jPanel12.add(jTextField49);
        JLabel jLabel146 = new JLabel("глюкоза:");
        jLabel146.setBounds(5,155,100,20);
        jPanel12.add(jLabel146);
        JTextField jTextField50 = new JTextField();
        jTextField50.setBounds(135,155,160,20);
        jPanel12.add(jTextField50);
        JLabel jLabel147 = new JLabel("эритроциты:");
        jLabel147.setBounds(5,180,100,20);
        jPanel12.add(jLabel147);
        JTextField jTextField51 = new JTextField();
        jTextField51.setBounds(135,180,160,20);
        jPanel12.add(jTextField51);
        JLabel jLabel148 = new JLabel("лейкоциты:");
        jLabel148.setBounds(5,205,100,20);
        jPanel12.add(jLabel148);
        JTextField jTextField52 = new JTextField();
        jTextField52.setBounds(135,205,160,20);
        jPanel12.add(jTextField52);
        JLabel jLabel149 = new JLabel("Ph");
        jLabel149.setBounds(5,230,100,20);
        jPanel12.add(jLabel149);
        JTextField jTextField53 = new JTextField();
        jTextField53.setBounds(135,230,160,20);
        jPanel12.add(jTextField53);
        JLabel jLabel150 = new JLabel("цилиндры:");
        jLabel150.setBounds(5,255,100,20);
        jPanel12.add(jLabel150);
        JComboBox jComboBox2 = new JComboBox(cilindresUrine);
        jComboBox2.setBounds(135,255,160,20);
        jPanel12.add(jComboBox2);
        JLabel jLabel151 = new JLabel("слизь:");
        jLabel151.setBounds(5,280,100,20);
        jPanel12.add(jLabel151);
        JComboBox jComboBox3 = new JComboBox(slimeUrine);
        jComboBox3.setBounds(135,280,160,20);
        jPanel12.add(jComboBox3);
        JLabel jLabel152 = new JLabel("бактерии:");
        jLabel152.setBounds(5,305,100,20);
        jPanel12.add(jLabel152);
        JTextField jTextField54 = new JTextField();
        jTextField54.setBounds(135,305,160,20);
        jPanel12.add(jTextField54);
        JLabel jLabel153 = new JLabel("соли:");
        jLabel153.setBounds(5,330,100,20);
        jPanel12.add(jLabel153);
        JComboBox jComboBox4 = new JComboBox(saltUrine);
        jComboBox4.setBounds(135,330,160,20);
        jPanel12.add(jComboBox4);

        JPanel jPanel13 = new JPanel(null);
        jPanel13.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        jPanel13.setBounds(500,50,180,105);
        jPanel10.add(jPanel13);
        JLabel jLabel154 = new JLabel("ПРОБА НЕЧИПОРЕНКО");
        jLabel154.setBounds(5,10,180,20);
        jPanel13.add(jLabel154);
        JLabel jLabel155 = new JLabel("Цилиндры:");
        jLabel155.setBounds(5,30,100,20);
        jPanel13.add(jLabel155);
        JTextField jTextField55 = new JTextField();
        jTextField55.setBounds(135,30,40,20);
        jPanel13.add(jTextField55);
        JLabel jLabel156 = new JLabel("Эритроциты:");
        jLabel156.setBounds(5,55,100,20);
        jPanel13.add(jLabel156);
        JTextField jTextField56 = new JTextField();
        jTextField56.setBounds(135,55,40,20);
        jPanel13.add(jTextField56);
        JLabel jLabel157 = new JLabel("Лейкоциты:");
        jLabel157.setBounds(5,80,100,20);
        jPanel13.add(jLabel157);
        JTextField jTextField57 = new JTextField();
        jTextField57.setBounds(135,80,40,20);
        jPanel13.add(jTextField57);

        JPanel jPanel14 = new JPanel(null);
        jPanel14.setBounds(500,160,180,130);
        jPanel10.add(jPanel14);
        jPanel14.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel jLabel158 = new JLabel("ПРОБА ЗИМНИЦСКОГО");
        jLabel158.setBounds(5,10,170,20);
        jPanel14.add(jLabel158);
        JLabel jLabel159 = new JLabel("Удельный вес:");
        jLabel159.setBounds(5,30,110,20);
        jPanel14.add(jLabel159);
        JTextField jTextField58 = new JTextField();
        jTextField58.setBounds(135,30,40,20);
        jPanel14.add(jTextField58);
        JLabel jLabel160 = new JLabel("Дневной диурез:");
        jLabel160.setBounds(5,55,120,20);
        jPanel14.add(jLabel160);
        JTextField jTextField59 = new JTextField();
        jTextField59.setBounds(135,56,40,20);
        jPanel14.add(jTextField59);
        JLabel jLabel161 = new JLabel("Ночной диурез:");
        jLabel161.setBounds(5,80,120,20);
        jPanel14.add(jLabel161);
        JTextField jTextField60 = new JTextField();
        jTextField60.setBounds(135,82,40,20);
        jPanel14.add(jTextField60);
        JLabel jLabel162 = new JLabel("Общий диурез:");
        jLabel162.setBounds(5,105,120,20);
        jPanel14.add(jLabel162);
        JTextField jTextField61 = new JTextField();
        jTextField61.setBounds(135,105,40,20);
        jPanel14.add(jTextField61);

        JPanel jPanel15 = new JPanel(null);
        jPanel15.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        jPanel15.setBounds(500,295,180,130);
        jPanel10.add(jPanel15);
        JLabel jLabel163 = new JLabel("ПЕЧЕНОЧНЫЕ ТЕСТЫ");
        jLabel163.setBounds(15,5,150,20);
        jPanel15.add(jLabel163);
        JLabel jLabel164 = new JLabel("общий билирубин:");
        jLabel164.setBounds(5,25,130,20);
        jPanel15.add(jLabel164);
        JTextField jTextField62 = new JTextField();
        jTextField62.setBounds(135,25,40,20);
        jPanel15.add(jTextField62);
        JLabel jLabel165 = new JLabel("прямой:");
        jLabel165.setBounds(5,50,100,20);
        jPanel15.add(jLabel165);
        JTextField jTextField63 = new JTextField();
        jTextField63.setBounds(135,50,40,20);
        jPanel15.add(jTextField63);
        JLabel jLabel166 = new JLabel("непрямой:");
        jLabel166.setBounds(5,75,100,20);
        jPanel15.add(jLabel166);
        JTextField jTextField64 = new JTextField();
        jTextField64.setBounds(135,75,40,20);
        jPanel15.add(jTextField64);
        JLabel jLabel167 = new JLabel("тимоловая проба:");
        jLabel167.setBounds(5,100,130,20);
        jPanel15.add(jLabel167);
        JTextField jTextField65 = new JTextField();
        jTextField65.setBounds(135,100,40,20);
        jPanel15.add(jTextField65);

        JPanel jPanel16 = new JPanel(null);
        jPanel16.setBounds(685,50,170,105);
        jPanel16.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        jPanel10.add(jPanel16);
        JLabel jLabel168 = new JLabel("ПОЧЕЧНЫЕ ТЕСТЫ");
        jLabel168.setBounds(15,10,150,20);
        jPanel16.add(jLabel168);
        JLabel jLabel169 = new JLabel("мочевина:");
        jLabel169.setBounds(5,30,100,20);
        jPanel16.add(jLabel169);
        JTextField jTextField66 = new JTextField();
        jTextField66.setBounds(125,32,40,20);
        jPanel16.add(jTextField66);
        JLabel jLabel170 = new JLabel("остаточный азот:");
        jLabel170.setBounds(5,55,120,20);
        jPanel16.add(jLabel170);
        JTextField jTextField67 = new JTextField();
        jTextField67.setBounds(125,57,40,20);
        jPanel16.add(jTextField67);
        JLabel jLabel171 = new JLabel("креатинин:");
        jLabel171.setBounds(5,80,120,20);
        jPanel16.add(jLabel171);
        JTextField jTextField68 = new JTextField();
        jTextField68.setBounds(125,80,40,20);
        jPanel16.add(jTextField68);

        JPanel jPanel17 = new JPanel(null);
        jPanel10.add(jPanel17);
        jPanel17.setBounds(685,160,170,105);
        jPanel17.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel jLabel172 = new JLabel("<html>БЕЛКИ И БЕЛКОВЫЕ<br> ФРАКЦИИ</html>");
        jLabel172.setBounds(10,3,150,30);
        jPanel17.add(jLabel172);
        JLabel jLabel173 = new JLabel("Общий белок:");
        jLabel173.setBounds(5,30,100,20);
        jPanel17.add(jLabel173);
        JTextField jTextField69 = new JTextField();
        jTextField69.setBounds(125,30,40,20);
        jPanel17.add(jTextField69);
        JLabel jLabel174 = new JLabel("альбумины:");
        jLabel174.setBounds(5,55,100,20);
        jPanel17.add(jLabel174);
        JTextField jTextField70 = new JTextField();
        jTextField70.setBounds(125,57,40,20);
        jPanel17.add(jTextField70);
        JLabel jLabel175 = new JLabel("глобулины:");
        jLabel175.setBounds(5,80,100,20);
        jPanel17.add(jLabel175);
        JTextField jTextField71 = new JTextField();
        jTextField71.setBounds(125,80,40,20);
        jPanel17.add(jTextField71);

        JPanel jPanel18 = new JPanel(null);
        jPanel10.add(jPanel18);
        jPanel18.setBounds(685,270,170,155);
        jPanel18.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel jLabel176 = new JLabel("ЭЛЕКТРОЛИТЫ КРОВИ");
        jLabel176.setBounds(5,5,170,20);
        jPanel18.add(jLabel176);
        JLabel jLabel177 = new JLabel("Калий (K):");
        jLabel177.setBounds(5,30,100,20);
        jPanel18.add(jLabel177);
        JTextField jTextField72 = new JTextField();
        jTextField72.setBounds(125,30,40,20);
        jPanel18.add(jTextField72);
        JLabel jLabel178 = new JLabel("Натрий (Na):");
        jLabel178.setBounds(5,55,100,20);
        jPanel18.add(jLabel178);
        JTextField jTextField73 = new JTextField();
        jTextField73.setBounds(125,55,40,20);
        jPanel18.add(jTextField73);
        JLabel jLabel179 = new JLabel("Кальций (Ca):");
        jLabel179.setBounds(5,80,100,20);
        jPanel18.add(jLabel179);
        JTextField jTextField74 = new JTextField();
        jTextField74.setBounds(125,80,40,20);
        jPanel18.add(jTextField74);
        JLabel jLabel180 = new JLabel("Фосфор (P):");
        jLabel180.setBounds(5,105,100,20);
        jPanel18.add(jLabel180);
        JTextField jTextField75 = new JTextField();
        jTextField75.setBounds(125,105,40,20);
        jPanel18.add(jTextField75);
        JLabel jLabel181 = new JLabel("Магний (Mg):");
        jLabel181.setBounds(5,130,100,20);
        jPanel18.add(jLabel181);
        JTextField jTextField76 = new JTextField();
        jTextField76.setBounds(125,130,40,20);
        jPanel18.add(jTextField76);

        JPanel jPanel19 = new JPanel(null);
        jPanel10.add(jPanel19);
        jPanel19.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        jPanel19.setBounds(860,50,190,215);
        JLabel jLabel182 = new JLabel("КОАГУЛОГРАММА");
        jLabel182.setBounds(5,10,150,20);
        jPanel19.add(jLabel182);
        JLabel jLabel183 = new JLabel("По Ли-Уайту:");
        jLabel183.setBounds(5,30,100,20);
        jPanel19.add(jLabel183);
        JTextField jTextField77 =  new JTextField();
        jTextField77.setBounds(145,30,40,20);
        jPanel19.add(jTextField77);
        JLabel jLabel184 = new JLabel("По Дюку:");
        jLabel184.setBounds(5,55,120,20);
        jPanel19.add(jLabel184);
        JTextField jTextField78 =  new JTextField();
        jTextField78.setBounds(145,55,40,20);
        jPanel19.add(jTextField78);
        JLabel jLabel185 = new JLabel("<html>Протромбирование<br>время по Квику:</html>");
        jLabel185.setBounds(5,80,135,30);
        jPanel19.add(jLabel185);
        JTextField jTextField79 = new JTextField();
        jTextField79.setBounds(145,85,40,20);
        jPanel19.add(jTextField79);
        JLabel jLabel186 = new JLabel("МНО:");
        jLabel186.setBounds(5,110,120,20);
        jPanel19.add(jLabel186);
        JTextField jTextField80 =  new JTextField();
        jTextField80.setBounds(145,110,40,20);
        jPanel19.add(jTextField80);
        JLabel jLabel187 = new JLabel("ПТИ:");
        jLabel187.setBounds(5,133,120,20);
        jPanel19.add(jLabel187);
        JTextField jTextField81 = new JTextField();
        jTextField81.setBounds(145,133,40,20);
        jPanel19.add(jTextField81);
        JLabel jLabel188 = new JLabel("<html>тромбированое <br>время:</html>");
        jLabel188.setBounds(5,156,120,30);
        jPanel19.add(jLabel188);
        JTextField jTextField82 = new JTextField();
        jTextField82.setBounds(145,158,40,20);
        jPanel19.add(jTextField82);
        JLabel jLabel189 = new JLabel("Фибриноген:");
        jLabel189.setBounds(5,185,120,20);
        jPanel19.add(jLabel189);
        JTextField jTextField83 = new JTextField();
        jTextField83.setBounds(145,185,40,20);
        jPanel19.add(jTextField83);

        JPanel jPanel20 = new JPanel(null);
        jPanel20.setBounds(860,270,190,90);
        jPanel20.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        jPanel10.add(jPanel20);
        JLabel jLabel190 = new JLabel("ГОРМОНЫ:");
        jLabel190.setBounds(35,5,120,20);
        jPanel20.add(jLabel190);
        JLabel jLabel191 = new JLabel("<html>паратиреоидный<br>гормон (ПТГ):</html>");
        jLabel191.setBounds(5,30,120,30);
        jPanel20.add(jLabel191);
        JTextField jTextField84 = new JTextField();
        jTextField84.setBounds(145,37,40,20);
        jPanel20.add(jTextField84);
        JLabel jLabel192 = new JLabel("кальтитонин крови:");
        jLabel192.setBounds(5,65,140,20);
        jPanel20.add(jLabel192);
        JTextField jTextField85 = new JTextField();
        jTextField85.setBounds(145,65,40,20);
        jPanel20.add(jTextField85);

        JPanel jPanel21 = new JPanel(null);
        jPanel21.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        jPanel21.setBounds(860,365,190,60);
        jPanel10.add(jPanel21);
        JLabel jLabel193 = new JLabel("ПОСЕВ МОЧИ:");
        jLabel193.setBounds(10,5,120,20);
        jPanel21.add(jLabel193);
        JTextField jTextField86 = new JTextField();
        jTextField86.setBounds(5,30,180,20);
        jPanel21.add(jTextField86);















        String regex = "\\d+";
        jButtonresult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = "";
                String details = "";
                int t1 = getNumber(jTextField.getText());
                int single = 0;
                if (t1 == -1) {
                    System.out.println("Введите число");
                }
                if (t1 > 0) {
                    details += "Камень верхней чашечки справа с размером " + t1 + "мм\n";
                    single++;
                }
                int t2 = getNumber(jTextField1.getText());
                if (t2 == -1) {
                    System.out.println("Введите число");
                }
                if (t2 > 0) {
                    single++;
                    details += "Камень средней чашечки справа с размером " + t2 + "мм";
                }
                int t3 = getNumber(jTextField2.getText());
                if (t3 == -1) {
                    System.out.println("Введите число");
                }
                if (t3 > 0) {
                    single++;
                    details += "Камень нижней чашечки справа с размером " + t3 + "мм\n";
                }
                int t4 = getNumber(jTextField3.getText());
                if (t4 == -1) {
                    System.out.println("Введите число");
                }
                if (t4 > 0) {
                    details += "Камень почечной лоханки справа с размером  " + t4 + "мм\n";
                    single++;
                }
                int t5 = getNumber(jTextField4.getText());
                if (t5 == -1) {
                    System.out.println("Введите число");
                }
                if (t5 > 0) {
                    details += "Камень верхней треть мочечточника справа с размером " + t5 + "мм\n";
                    single++;
                }
                int t6 = getNumber(jTextField5.getText());
                if (t6 == -1) {
                    System.out.println("Введите число");
                }
                if (t6 > 0) {
                    details += "Камень средней треть мочечточника справа с размером " + t6 + "мм\n";
                    single++;
                }
                int t7 = getNumber(jTextField6.getText());
                if (t7 == -1) {
                    System.out.println("Введите число");
                }
                if (t7 > 0) {
                    details += "Камень нижнего (дистальный) отдела  мочеточника справа с размером " + t7 + "мм\n";
                    single++;
                }
                int t8 = getNumber(jTextField7.getText());
                if (t8 == -1) {
                    System.out.println("Введите число");
                }
                if (t8 > 0) {
                    details += "Камень верхней чашечки  слева с размером " + t8 + "мм\n";
                    single++;
                }
                int t9 = getNumber(jTextField8.getText());
                if (t9 == -1) {
                    System.out.println("Введите число");
                }
                if (t9 > 0) {
                    details += "Камень средней чашечки слева с  размером " + t9 + "мм\n";
                    single++;
                }
                int t10 = getNumber(jTextField9.getText());
                if (t10 == -1) {
                    System.out.println("Введите число");
                }
                if (t10 > 0) {
                    details += "Камень нижней чашечки слева с размером " + t10 + "мм\n";
                    single++;
                }
                int t11 = getNumber(jTextField10.getText());
                if (t11 == -1) {
                    System.out.println("Введите число");
                }
                if (t11 > 0) {
                    details += "Камень почечной лоханки слева с размером " + t11 + "мм\n";
                    single++;
                }
                int t12 = getNumber(jTextField11.getText());
                if (t12 == -1) {
                    System.out.println("Введите число");
                }
                if (t12 > 0) {
                    details += "Камень верхней трертьи мочечточника слева с  размером " + t12 + "мм\n";
                    single++;
                }
                int t13 = getNumber(jTextField12.getText());
                if (t13 == -1) {
                    System.out.println("Введите число");
                }
                if (t13 > 0) {
                    details += "Камень средней третьи мочеточника слева с  размером " + t13 + "мм\n";
                    single++;
                }
                int t14 = getNumber(jTextField13.getText());
                if (t14 == -1) {
                    System.out.println("Введите число");
                }
                if (t14 > 0) {
                    details += "Камень нижнего (дистальный) отдела мочеточника слева с  размером " + t14 + "мм\n";
                    single++;
                }
                int t15 = getNumber(jTextField14.getText());
                if (t15 == -1) {
                    System.out.println("Введите число");
                }
                if (t15 > 0) {
                    details += "Камень мочевого пузыря с размером " + t15 + "мм\n";
                    single++;
                }
                int t16 = getNumber(jTextField15.getText());
                if (t16 == -1) {
                    System.out.println("Введите число");
                }
                if (t16 > 0) {
                    details += "Камень уретры с  размером " + t16 + "мм\n";
                    single++;
                }
                if (single == 1) {
                    System.out.println("МКБ.Одиночный камень");
                    result += "МКБ.Одиночный камень.";
                } else if (single > 1) {
                    System.out.println("МКБ.Множественный камень");
                    result += "МКБ.Множественный камень.";
                }
                System.out.println("Details " + details);
                System.out.println("Результат " + result);
                String clinic = "";
                if (jCheckBox.isSelected()) {
                    clinic += "первичный ";
                }
                if (jCheckBox1.isSelected()) {
                    clinic += "рецидивный ";
                }
                if (jCheckBox2.isSelected()) {
                    clinic += "инфицированный ";
                }
                if (jCheckBox3.isSelected()) {
                    clinic += "неинфицированный ";
                }
                String clinic1 = !clinic.isEmpty() ? "По клинике: " + clinic : "";
                System.out.println(result);

                String xray = "";
                if (jCheckBox4.isSelected()) {
                    xray += "Рентгенконтрастный конкремент - дигигдрат оксалат кальция ";
                }
                if (jCheckBox5.isSelected()) {
                    xray += "Рентгенконтрастный конкремент - моногидрат оксалат кальция ";
                }
                if (jCheckBox6.isSelected()) {
                    xray += "Рентгеноконтрастный конкремент - фосфат кальция ";
                }
                if (jCheckBox7.isSelected()) {
                    xray += "Низкая рентгеноконтрастный конкремент - фосфат магния и аммония ";
                }
                if (jCheckBox8.isSelected()) {
                    xray += "Низкая рентгеноконтрастный конкремент - апатит ";
                }
                if (jCheckBox9.isSelected()) {
                    xray += "Низкая рентгеноконтрастный конкремент - цистин ";
                }
                if (jCheckBox10.isSelected()) {
                    xray += "Рентгеннегативный конкремент - мочевая кислота ";
                }
                if (jCheckBox11.isSelected()) {
                    xray += "Рентгеннегативный конкремент - урат аммония ";
                }
                if (jCheckBox12.isSelected()) {
                    xray += "Рентгеннегативный конкремент - ксантин ";
                }
                if (jCheckBox13.isSelected()) {
                    xray += "Рентгеннегативный конкремент - 2,8-дигидроксиаденин";
                }
                if (jCheckBox14.isSelected()) {
                    xray += "Рентгеннегативный конкремент - лекарственные камни";
                }
                String xray1 = !xray.isEmpty() ? "По рентгенологическом характеристике:  " + xray : "";

                String etiology = "";
                if (jCheckBox15.isSelected()) {
                    etiology += "Неинфекционные камни: - оксалат кальция\n";
                }
                if (jCheckBox16.isSelected()) {
                    etiology += "Неинфекционные камни: - фосфат кальция\n";
                }
                if (jCheckBox17.isSelected()) {
                    etiology += "Неинфекционные камни: - мочевая кислота\n";
                }
                if (jCheckBox18.isSelected()) {
                    etiology += "Инфекционные камни: - фосфат магния-аммония\n";
                }
                if (jCheckBox19.isSelected()) {
                    etiology += "Инфекционные камни: - апатит\n";
                }
                if (jCheckBox20.isSelected()) {
                    etiology += "Инфекционные камни: - урат аммония\n";
                }
                if (jCheckBox21.isSelected()) {
                    etiology += "Генетические причины: - цистин\n";
                }
                if (jCheckBox22.isSelected()) {
                    etiology += "Генетические причины: - ксантин\n";
                }
                if (jCheckBox23.isSelected()) {
                    etiology += "Генетические причины: - 2,8-дигидроксиаденин\n";
                }
                String etiology1 = !etiology.isEmpty() ? "ПО ЭТИОЛОГИИ: " + etiology : "";

                String mineral = "";
                if (jCheckBox24.isSelected()) {
                    mineral += "Моногидрат оксалата кальция - (Вевеллит - CaC2O4.H2O)";
                }
                if (jCheckBox25.isSelected()) {
                    mineral += "Дигидрат оксалата кальция - (Ведделлит - CaC2O4.2H2O)";
                }
                if (jCheckBox26.isSelected()) {
                    mineral += "Фосфат кальция - (Апатит - Ca10(PO4)6.(OH)2)";
                }
                if (jCheckBox27.isSelected()) {
                    mineral += "Гидроксофосфат кальция - (Гидроксиапатит - Ca5(PO3)3(OH))";
                }
                if (jCheckBox28.isSelected()) {
                    mineral += "β-трехкальциевый фосфат - (Витлокит - Ca3(PO4)2)";
                }
                if (jCheckBox29.isSelected()) {
                    mineral += "Фосфат карбонатапатита - (Даллит - Ca5(PO4)3OH\n)";
                }
                if (jCheckBox30.isSelected()) {
                    mineral += "Гидрогенфосфат кальция - (Брушит - CaHPO4.2H2O)";
                }
                if (jCheckBox31.isSelected()) {
                    mineral += "Карбонат кальция - (Арагонит - CaCO3)";
                }
                if (jCheckBox32.isSelected()) {
                    mineral += "Восьмикальциевый фосфат - (Ca8H2(PO4)6.5H2O)";
                }
                if (jCheckBox33.isSelected()) {
                    mineral += "Дигидрат мочевой кислоты - (Урицит - C5H4N4O3)";
                }
                if (jCheckBox34.isSelected()) {
                    mineral += "Урат аммония - (NH4C5H3N4O3)";
                }
                if (jCheckBox35.isSelected()) {
                    mineral += "Кислый урат натрия моногидрат - (NaC5H3N4O3.H2O)";
                }
                if (jCheckBox36.isSelected()) {
                    mineral += "Фосфат магния-аммония - (Струвит - MgNH4PO4.6H2O)";
                }
                if (jCheckBox37.isSelected()) {
                    mineral += "Кислый фосфат магния тригидрат - (Ньюберит - MgHPO4.3H2O)";
                }
                if (jCheckBox38.isSelected()) {
                    mineral += "Фосфат магния-аммония дигидрат - (Диттмарит - MgNH4(PO4).1H2O)";
                }
                if (jCheckBox39.isSelected()) {
                    mineral += "Цистин - ([SCH2CH(NH2)COOH]2)";
                }
                if (jCheckBox40.isSelected()) {
                    mineral += "Гипс - (Сульфат кальция дигидрат - CaSO4.2H2O)\n" + "Гипс - (Фосфат цинка тетрагидрат - Zn3(PO4)2.4H2O)";
                    ;
                }
                if (jCheckBox41.isSelected()) {
                    mineral += "Ксантин";
                }
                if (jCheckBox42.isSelected()) {
                    mineral += "2,8-дигидроксиаденин";
                }
                if (jCheckBox43.isSelected()) {
                    mineral += "Белки";
                }
                if (jCheckBox44.isSelected()) {
                    mineral += "Холестерин";
                }
                if (jCheckBox45.isSelected()) {
                    mineral += "Кальцит";
                }
                if (jCheckBox46.isSelected()) {
                    mineral += "Урат калия";
                }
                if (jCheckBox47.isSelected()) {
                    mineral += "Трехмагниевый фосфат";
                }
                if (jCheckBox48.isSelected()) {
                    mineral += "Меламин";
                }
                if (jCheckBox49.isSelected()) {
                    mineral += "Матрикс";
                }
                if (jCheckBox50.isSelected()) {
                    mineral += "Лекарственные камни - (-Активные соединения, кристаллизующиеся в моче\n  --Вещества, ухудшающие состав мочи )";
                }
                if (jCheckBox51.isSelected()) {
                    mineral += "Конкременты из инородных тел";
                }
                String mineral1 = !mineral.isEmpty() ? "ПО МИНЕРАЛОГИЧЕСКОМУ СОСТАВУ " + mineral : "";

                String riskFormation = "";
                if (jCheckBox52.isSelected()) {
                    riskFormation += "О6щие факторы - Развитие МКБ в раннем возрасте (особенно у детей и подростков)\n";
                }
                if (jCheckBox53.isSelected()) {
                    riskFormation += "О6щие факторы - Семейный анамнез МКБ";
                }
                if (jCheckBox54.isSelected()) {
                    riskFormation += "О6щие факторы - Брушит в составе камней (гидрогенфосфат кальция; СаНРО4  2(Н,0)\n";
                }
                if (jCheckBox55.isSelected()) {
                    riskFormation += "О6щие факторы - Мочевая кислота и урат в составе камней\n";
                }
                if (jCheckBox56.isSelected()) {
                    riskFormation += "О6щие факторы - Инфекционные камни\n";
                }
                if (jCheckBox57.isSelected()) {
                    riskFormation += "О6щие факторы - Единственная почка\n";
                }
                if (jCheckBox58.isSelected()) {
                    riskFormation += "Заболевания, связанные с развитием МКБ - Гиперпаратиреоз\n";
                }
                if (jCheckBox59.isSelected()) {
                    riskFormation += "Заболевания, связанные с развитием МКБ - Метаболический синдром\n";
                }
                if (jCheckBox60.isSelected()) {
                    riskFormation += "Заболевания, связанные с развитием МКБ - Поликистозная болезнь почек\n";
                }
                if (jCheckBox61.isSelected()) {
                    riskFormation += "Заболевания, связанные с развитием МКБ - Нефрокальциноз\n";
                }
                if (jCheckBox62.isSelected()) {
                    riskFormation += "Заболевания, связанные с развитием МКБ - Заболевания и патологии ЖКТ (еюноилеальный обходной анастомоз, резекция кишечника,\nболезнь Крона, мальабсорбция, " +
                            "кишечная гипероксалурия после деривации мочи) и бариатрические операции\\n";
                }
                if (jCheckBox63.isSelected()) {
                    riskFormation += "Заболевания, связанные с развитием МКБ - Саркоидоз\n";
                }
                if (jCheckBox64.isSelected()) {
                    riskFormation += "Заболевания, связанные с развитием МКБ - Повреждение спинного мозга, нейрогенный мочевой пузырь\n";
                }
                if (jCheckBox65.isSelected()) {
                    riskFormation += "Генетические причины МКБ - Цистинурия (типы А, В, АВ)\n";
                }
                if (jCheckBox66.isSelected()) {
                    riskFormation += "Генетические причины МКБ - Первичная гипероксалурия (ПГ)\n";
                }
                if (jCheckBox67.isSelected()) {
                    riskFormation += "Генетические причины МКБ - Почечный канальцевый ацидоз (ПКА) 1-го типа\n";
                }
                if (jCheckBox68.isSelected()) {
                    riskFormation += "Генетические причины МКБ - 2,8-дигидроксиаденинурия\n";
                }
                if (jCheckBox69.isSelected()) {
                    riskFormation += "Генетические причины МКБ - Ксантинурия\n";
                }
                if (jCheckBox70.isSelected()) {
                    riskFormation += "Генетические причины МКБ - Синдром Леша-Нихена\n";
                }
                if (jCheckBox71.isSelected()) {
                    riskFormation += "Генетические причины МКБ - Муковисцидоз\n";
                }
                if (jCheckBox72.isSelected()) {
                    riskFormation += "Лекарственные препараты, способствующие камнеобразованию: - Кальциевые добавки.\n";
                }
                if (jCheckBox73.isSelected()) {
                    riskFormation += "Лекарственные препараты, способствующие камнеобразованию: - Добавки с витамином D.\n";
                }
                if (jCheckBox74.isSelected()) {
                    riskFormation += "Лекарственные препараты, способствующие камнеобразованию: - Аскорбиновая кислота (>4 г в день).\n";
                }
                if (jCheckBox75.isSelected()) {
                    riskFormation += "Лекарственные препараты, способствующие камнеобразованию: - Сульфаниламиды (Триамтерен, Индинавира)\n";
                }
                if (jCheckBox76.isSelected()) {
                    riskFormation += "Анатомические и уродинамические нарушения, способствующие камнеобразованию - Медуллярная губчатая почка (тубулярная эктазия)\n";
                }
                if (jCheckBox77.isSelected()) {
                    riskFormation += "Анатомические и уродинамические нарушения, способствующие камнеобразованию - Обструкция лоханочно-мочеточникового \n сегмента (ЛМС)\n";
                }
                if (jCheckBox78.isSelected()) {
                    riskFormation += "Анатомические и уродинамические нарушения, способствующие камнеобразованию - Дивертикул чашки, киста чашки\n";
                }
                if (jCheckBox79.isSelected()) {
                    riskFormation += "Анатомические и уродинамические нарушения, способствующие камнеобразованию - Стриктура мочеточника\n";
                }
                if (jCheckBox80.isSelected()) {
                    riskFormation += "Анатомические и уродинамические нарушения, способствующие камнеобразованию - Пузырно-мочеточниково-почечныйрефлюкс\n";
                }
                if (jCheckBox81.isSelected()) {
                    riskFormation += "Анатомические и уродинамические нарушения, способствующие камнеобразованию - Подковообразная почка\n";
                }
                if (jCheckBox82.isSelected()) {
                    riskFormation += "Анатомические и уродинамические нарушения, способствующие камнеобразованию - Уретероцеле\n";
                }
                String riskFormation1 = !riskFormation.isEmpty() ? "ПО ГРУППАМ РИСКА ОБРАЗОВАНИЯ КАМНЕЙ: " + riskFormation : "\n";

                String Hours = "";
                int hours = getNumber(jTextField16.getText());
                if (hours == -1) {
                    System.out.println("Введите число");
                }
                if (hours >=1 && hours<=24) {
                    Hours += "срочно обезболивайте ";
                    single++;
                }
                String Days ="";
                int days = getNumber(jTextField17.getText());
                if (days == -1){
                    System.out.println("Введите число");
                }
                if (days >=1 && days<=365){
                    Days +="срочно обезболивайте 1";
                    single++;
                }else if (days>366){
                    Days +="В году 365 дней введите не больще 365 число";
                }

                String OAK = "";
                String hbString = jTextField34.getText();
                if (!hbString.isEmpty()) {
                    int hb = Integer.parseInt(hbString);
                    if (hb == 120) {
                        //System.out.println("Ваши показатели гемоглобина соответствует к  норму");
                        OAK+= "Ваши показатели гемоглобина соответствует к  норму\n";
                    } else if (hb <= 119) {
                        //System.out.println("Ваши показатели гемоглобина соответствует анемию");
                        OAK+= "Ваши показатели гемоглобина соответствует анемию\n";
                    } else if (hb <= 160) {
                        OAK+= "Ваши показатели гемошлобина соответствует к  норму\n";
//                        System.out.println("Ваши показатели гемошлобина соответствует к  норму");
                    } else if (hb > 160 && hb <= 180) {
                        OAK+="Уровень показатели гемоглобина высоко, необходимо повторно сдать ОАК\n";
//                        System.out.println("Уровень показатели гемоглобина высоко, необходимо повторно сдать ОАК");
                    } else {
                        OAK+="Вы ввели неправильную показатели уровня гемглобина\n";
                        //System.out.println("Вы ввели неправильную показатели уровня гемглобина");
                    }
                }

                String EritString = jTextField35.getText();
                if (!EritString.isEmpty()) {
                    double Erit = Double.parseDouble(EritString);
                    if (Erit == 3.6) {
                        OAK += "Показатели эритроцитов в  норме\n";
//                        System.out.println("Показатели эритроцитов в  норме");
                    } else if (Erit < 2.9 && Erit > 4.9) {
                        OAK += "Показатели эритроцитов в  норме\n";
//                        System.out.println("Показатели эритроцитов в  норме");
                    } else if (Erit > 4.9) {
                        OAK += "У вас эритроцитоз (Повышено уровня эритроцитов (Эритроцитоз:)\n";
//                        System.out.println("У вас эритроцитоз (Повышено уровня эритроцитов (Эритроцитоз:)");
                    } else if (Erit < 2.89) {
                        OAK += "у вас эритропения\n";
//                        System.out.println("у вас эритропения");
                    } else {
                        OAK +="Вы ввели неправильную показатели уровня эритроцита\n";
//                        System.out.println("Вы ввели неправильную показатели уровня эритроцита");
                    }
                }

                String HtString = jTextField36.getText();
                if (!HtString.isEmpty()) {
                    int Ht = Integer.parseInt(HtString);
                    if (Ht == 40) {
                        OAK += "Показатели гематокрита в норме\n";
//                        System.out.println("Показатели гематокрита в норме");
                    } else if (Ht > 35 && Ht < 50) {
                        OAK += "Показатели гематокрита в норме:\n";
//                        System.out.println("Показатели гематокрита в норме:");
                    } else if (Ht < 39) {
                        OAK +="Показатели гематокрита снижен (Исключить анемию:)\n";
//                        System.out.println("Показатели гематокрита снижен (Исключить анемию:)");
                    } else if (Ht > 51) {
                        OAK += "Показатели гематокрита высоко (исключите Полицистемия:)\n";
//                        System.out.println("Показатели гематокрита высоко (исключите Полицистемия:)");
                    } else {
                        OAK += "Вы ввели неправильную показатели уровня эритроцита\n";
//                        System.out.println("Вы ввели неправильную показатели уровня эритроцита");
                    }
                }

                String LString = jTextField37.getText();
                if (!LString.isEmpty()) {
                    double L = Double.parseDouble(LString);
                    if (L == 9) {
                        OAK+= "Показатели лейкоциты в норме:\n";
//                        System.out.println("Показатели лейкоциты в норме:");
                    } else if (L < 4) {
                        OAK +="Показатели лейкоцитов снижен:\n";
//                        System.out.println("Показатели лейкоцитов снижен:");
                    } else if (L > 10) {
                        OAK+= "Показатели лейкоциты повышенно (Исключите воспалению:)\n";
//                        System.out.println("Показатели лейкоциты повышенно (Исключите воспалению:)");
                    }
                }

                String SPString=jTextField38.getText();
                if (!SPString.isEmpty()) {
                    double SP = Double.parseDouble(SPString);
                    if (SP == 1) {
                        OAK+= "Показатели цветного показателя в  норме (нормохромия)\n";
//                        System.out.println("Показатели цветного показателя в  норме (нормохромия)");
                    } else if (SP > 0.86 && SP < 1.05) {
                        OAK+= "Показатели цветного показателя в  норме (нормохромия)\n";
//                        System.out.println("Показатели цветного показателя в  норме (нормохромия)");
                    } else if (SP < 1.06) {
                        OAK+="Гиперхромия\n";
//                        System.out.println("Гиперхромия");
                    } else {
                        OAK+= "Вы ввели неправильную показатели уровня цветного показателя (ЦП)\n";
//                        System.out.println("Вы ввели неправильную показатели уровня цветного показателя (ЦП)");
                    }
                }
                String PalochkiString = jTextField39.getText();
                if (!PalochkiString.isEmpty()) {
                    double Palochki = Double.parseDouble(PalochkiString);
                    if (Palochki == 4) {
                        OAK += "Показатели палочкоядерных нейтрофилов в норме\n";
//                        System.out.println("Показатели палочкоядерных нейтрофилов в норме");
                    } else if (Palochki < 0.5 && Palochki > 6) {
                        OAK += "Показатели палочкоядерных нейтрофилов в норме\n";
//                        System.out.println("Показатели палочкоядерных нейтрофилов в норме");
                    } else if (Palochki < 0.5) {
                        OAK += "Показатели палочкоядерных нейтрофилов снижен\n";
//                        System.out.println("Показатели палочкоядерных нейтрофилов снижен(Исключите-Бактериальные инфекции в тяжелой форме " +
//                                "(сильно сниженный уровень).\n" +
//                                "Вирусные заболевания.\n" +
//                                "Сильное отравление лекарствами или химикатами.\n" +
//                                "Анемия, вызванная дефицитом витамина В.\n" +
//                                "Онкологические болезни.\n" +
//                                "Радиоактивное облучение )");
                    } else if (Palochki > 6) {
                        OAK += "Показатели палочкоядерных нейтрофилов  превышен\n";
//                        System.out.println("Показатели палочкоядерных нейтрофилов  превышен Исклюсите(Воспаление легких (нейтрофилы палочкоядерные " +
//                                "могут резко повыситься).\n" +
//                                "Острый отит (клетки в крови повышены в несколько раз).\n" +
//                                "Ревматизм.\n" +
//                                "Ожоги.\n" +
//                                "Подагра.\n" +
//                                "Опухоли.\n" +
//                                "Нефрит.\n" +
//                                "Травмы различного характера.\n" +
//                                "Дерматит.\n" +
//                                "Анемия.\n" +
//                                "Сахарный диабет и др.) В крови у женщин при беременности.\n" +
//                                "Повышаться уровень можеи после операции.\n" +
//                                "При медикаментозной терапии.\n" +
//                                "От перемены температур.\n" +
//                                "При кровопотерях.\n" +
//                                "Нейтрофилы повышаются при тяжелых физических нагрузках.\n" +
//                                "При эмоциональном стрессе.\n" +
//                                "У ребенка в первые дни жизни.\n" +
//                                "Ядерная желтуха. Опухоль органов ЖКТ.\n" +
//                                "Инфаркт.\n" +
//                                "Инсульт.\n" +
//                                "Кожные болезни.\n" +
//                                "Трофические язвы.\n" +
//                                "Гнойные воспалительные процессы.\n" +
//                                "Химическое отравление.");
                    } else {
                        OAK += "Вы ввели неправильную показатели палочкиядерных нейтрофилов\n";
//                        System.out.println("Вы ввели неправильную показатели палочкиядерных нейтрофилов");
                    }
                }

                String SegmentsString = jTextField40.getText();
                if (!SegmentsString.isEmpty()) {
                    int Segments = Integer.parseInt(SegmentsString);
                    if (Segments == 60) {
                       OAK += "Показатели сегментоядерных нейтроилов в норме\n";
//                        System.out.println("Показатели сегментоядерных нейтроилов в норме");
                    } else if (Segments < 47 && Segments > 72) {
                        OAK+= "Показатели сегментоядерных нейтроилов в норме\n";
//                        System.out.println("Показатели сегментоядерных нейтроилов в норме");
                    } else if (Segments < 47) {
                        OAK+= "Показатели сегментоядерных снижен.\n";
//                        System.out.println("Показатели сегментоядерных снижен. Исключите (заболеваниях кровеносной системы и органов, " +
//                                "отвечающих за кроветворение;\n" +
//                                "применении химиотерапии при лечении больных со злокачественными новообразованиями;\n" +
//                                "терапии противовирусными средствами;\n" +
//                                "продолжительной инфекционной болезни;\n" +
//                                "ярком аллергическом процессе;\n" +
//                                "тиреотоксикозе;\n" +
//                                "различных отклонениях в наследственности.)");
                    } else if (Segments > 72) {
                        OAK+= "Показатели сегментоядерных нейтрофилов повышен.\n";
//                        System.out.println("Показатели сегментоядерных нейтрофилов повышен. Исклюсите (возникновение в острой форме инфекционного процесса;\n" +
//                                "возникновение воспаления при некоторых заболеваниях;\n" +
//                                "появление в организме мертвой зоны (при инфаркте сердечной мышцы);\n" +
//                                "проведение вакцинации;\n" +
//                                "отравление спиртным напитками;\n" +
//                                "распадающееся новообразование;\n" +
//                                "патологии почек;\n" +
//                                "терапия такими веществами, как стероидные гормоны, гепарин." +
//                                "повышаются клетки в состоянии длительной стрессовой ситуации;\n" +
//                                "физическом переутомлении;\n" +
//                                "состоянии у женщин перед менструациями;\n" +
//                                "количество клеток увеличено при наличии беременности.)");
                    } else {
                        OAK += "Вы ввели неправильную показатели сегментоядерных нейтрофилов\n";
//                        System.out.println("Вы ввели неправильную показатели сегментоядерных нейтрофилов");
                    }
                }
                String RLTString = jTextField41.getText();
                if (!RLTString.isEmpty()) {
                    int RLT = Integer.parseInt(RLTString);
                    if (RLT == 180) {
                        OAK+= "Показатели тромбоцитов в норме:\n";
//                        System.out.println("Показатели тромбоцитов в норме:");
                    } else if (RLT > 181 && RLT < 320) {
                        OAK+= "Показатели тромбоцитов в норме:\n";
//                        System.out.println("Показатели тромбоцитов в норме:");
                    } else if (RLT < 180) {
                        OAK+= "Показатели тромбоцитов снижен\n";
//                        System.out.println("Показатели тромбоцитов снижен");
                    } else if (RLT > 320) {
                        OAK+= "Показатели тромбоциты повышен\n";
//                        System.out.println("Показатели тромбоциты повышен");
                    }
                }

                String EozinphilsSting = jTextField42.getText();
                if (!EozinphilsSting.isEmpty()) {
                    double Eozinphils = Double.parseDouble(EozinphilsSting);
                    if (Eozinphils == 3.0) {
                        OAK+= "Показатели эозинофилов в  норме\n";
//                        System.out.println("Показатели эозинофилов в  норме");
                    } else if (Eozinphils > 0.5 && Eozinphils < 5) {
                        OAK+= "Показатели эозинофилов  в  норме\n";
//                        System.out.println("Показатели эозинофилов  в  норме");
                    } else if (Eozinphils < 0.5) {
                        OAK+= "Показатели эозинофилов снижен\n";
//                        System.out.println("Показатели эозинофилов снижен");
                    } else if (Eozinphils > 5) {
                        OAK+= "Показатели эозинофилов превышен (Исключите аллергию или глисты в органзме)\n";
//                        System.out.println("Показатели эозинофилов превышен (Исключите аллергию или глисты в органзме)");
                    }
                }
                String LimfocitesString = jTextField43.getText();
                if (!LimfocitesString.isEmpty()) {
                    int Limfocites = Integer.parseInt(LimfocitesString);
                    if (Limfocites == 25) {
                        OAK+= "Показатели лимфоцитов в норме\n";
//                        System.out.println("Показатели лимфоцитов в норме");
                    } else if (Limfocites < 19 && Limfocites > 37) {
                        OAK+= "Показатели лимфоцитов в норме\n";
//                        System.out.println("Показатели лимфоцитов в норме");
                    } else if (Limfocites < 19) {
                        OAK+= "Показатели лимфоцитов снижен. Исключите лимфопения.\n";
//                        System.out.println("Показатели лимфоцитов снижен. Исключите лимфопения. (СПИД.\n" +
//                                "Хронические заболевания печени.\n" +
//                                "Анемия.\n" +
//                                "Гнойные процессы.\n" +
//                                "Туберкулез.\n" +
//                                "Инфекционные заболевание с тяжелым течением болезни.\n" +
//                                "Противораковая терапия.\n" +
//                                "Поражения лимфатических узлов.\n" +
//                                "Врожденные иммунные заболевания.\n" +
//                                "Патологии почек.\n" +
//                                "Красная волчанка.\n" +
//                                "Лимфосаркома и др.)" +
//                                "Лейкоз.\n" +
//                                "Лейкоцитоз.\n" +
//                                "Облучение.\n" +
//                                "Нейтрофилез.\n" +
//                                "Хронические и острые инфекционные заболевания.");
                    } else if (Limfocites > 37) {
                        OAK+= "Показатели лимфоцитов превышен\n";
//                        System.out.println("Показатели лимфоцитов превышен");
                    } else {
                        OAK+= "Вы ввели неправильную показателей лимфоцитов\n";
//                        System.out.println("Вы ввели неправильную показателей лимфоцитов");
                    }
                }

                String MonocitesString = jTextField44.getText();
                if (!MonocitesString.isEmpty()) {
                    int Monocites = Integer.parseInt(MonocitesString);
                    if (Monocites == 5) {
                        OAK+= "Показатели моноцитов в  норме\n";
//                        System.out.println("Показатели моноцитов в  норме");
                    } else if (Monocites < 3 && Monocites > 11) {
                        OAK+= "Показатели моноцитов в норме\n";
//                        System.out.println("Показатели моноцитов в норме");
                    } else if (Monocites < 3) {
                        OAK+= "Показатели моноцитов снижен. Исключите (Моноцитопения)\n";
//                        System.out.println("Показатели моноцитов снижен. Исключите (Моноцитопения)- Апластическая и фолиеводефицитная анемии – " +
//                                "наиболее распространенные причины.\n" +
//                                "Острые инфекции, при которых происходит уменьшение количества нейтрофилов.\n" +
//                                "Длительная терапия глюкокортикостероидами.\n" +
//                                "Панцитопения.\n" +
//                                "Волосатоклеточный лейкоз – самостоятельное заболевание, хотя и считается вариантом хронического лейкоза. " +
//                                "Недуг довольно редкостный.\n" +
//                                "Лучевая болезнь. ");
                    } else if (Monocites > 11) {
                        OAK+= "Показатели моноцитов превышен.\n";
//                        System.out.println("Показатели моноцитов превыен. Исключите (туберкулез легких и внелегочный;\n" +
//                                "сифилис;\n" +
//                                "бруцеллез;\n" +
//                                "подострый эндокардит;\n" +
//                                "сепсис.)" +
//                                "язвенный колит;\n" +
//                                "энтерит.");
                    } else {
                        OAK+= "Вы ввели неправильную число\n";
//                        System.out.println("Вы ввели неправильную число");
                    }
                }

                String BazofilesString = jTextField45.getText();
                if (!BazofilesString.isEmpty()) {
                    double Bazofiles = Double.parseDouble(BazofilesString);
                    if (Bazofiles == 0.65) {
                        OAK+= "Показатели базофилов в норме\n";
//                        System.out.println("Показатели базофилов в норме");
                    } else if (Bazofiles < 0.01 && Bazofiles > 1) {
                        OAK+="Показатели базофилов в норме\n";
//                        System.out.println("Показатели базофилов в норме");
                    } else if (Bazofiles < 0.01) {
                        OAK+= "Показатели базофилов снижен.\n";
//                        System.out.println("Показатели базофилов снижен. Исключите (Острые инфекционные недуги.\n" +
//                                "Гипертиреоз.\n" +
//                                "Болезнь и синдром Кушинга.\n" +
//                                "Пневмония.)");
                    } else if (Bazofiles > 1) {
                        OAK+= "хронический миелолейкоз;\n";
//                        System.out.println("хронический миелолейкоз;\n" +
//                                "лимфогранулематоз или болезнь Ходжкина: чаще встречается у подростков, а также пики заболеваемости наблюдаются" +
//                                " в 20 и в 50 лет;\n" +
//                                "острый лейкоз;\n" +
//                                "истинная полицитемия.\n" +
//                                "Хронические воспалительные процессы в ЖКТ.\n" +
//                                "Гипотиреоз.\n" +
//                                "Острый гепатит, который проходит в сопровождении желтухи.\n" +
//                                "Гемолитическая анемия.");
                    } else {
                        OAK+= "Вы ввели неправильную показатели базофилов\n";
//                        System.out.println("Вы ввели неправильную показатели базофилов");
                    }
                }
                String SOEString = jTextField46.getText();
                if (!SOEString.isEmpty()) {
                    int SOE = Integer.parseInt(SOEString);
                    if (SOE == 15) {
                        OAK+= "Показатели СОЭ соответствует к  норму\n";
//                        System.out.println("Показатели СОЭ соответствует к  норму");
                    } else if (SOE > 1 && SOE < 15) {
                        OAK += "Показатели СОЭ соответствует к  норму\n";
//                        System.out.println("Показатели СОЭ соответствует к  норму");
                    } else if (SOE < 1) {
                        OAK += "Показатели СОЭ снижен:\n";
//                        System.out.println("Показатели СОЭ снижен:");
                    } else if (SOE > 16) {
                        OAK += "Показатели СОЭ повышенно исключите воспалению:\n";
//                        System.out.println("Показатели СОЭ повышенно исключите воспалению:");
                    } else {
                        OAK += "Вы ввели не верную число:\n";
//                        System.out.println("Вы ввели не верную число:");
                    }
                }
                String svetyMocha = (String) jComboBox.getSelectedItem();
                OAK += svetyMocha;

                String generalUrineAnalysis ="";

                String transparency = (String) jComboBox1.getSelectedItem();
                generalUrineAnalysis +=transparency;

                String udelniyVesString = jTextField47.getText();
                if (!udelniyVesString.isEmpty()) {
                    int udelniyVes = Integer.parseInt(udelniyVesString);
                    if (udelniyVes >= 1005 && udelniyVes <= 1025) {
                        generalUrineAnalysis += "Показатели удельного веса соответствует к норму\n";
//                                System.out.println("Показатели удельного веса соответствует к норму");
                    } else if (udelniyVes < 1005) {
                        generalUrineAnalysis += "Показатели удельного веса снижен\n";
//                                System.out.println("Показатели удельного веса снижен");
                    } else if (udelniyVes > 1025) {
                        generalUrineAnalysis += "Показатели удельного веса превышен\n";
//                                System.out.println("Показатели удельного веса превышен");
                    } else {
                        generalUrineAnalysis +="Вы ввели неправильную показатели удельного веса\n";
//                                System.out.println("Вы ввели неправильную показатели удельного веса");
                    }
                }
                String urineProteinString = jTextField48.getText();
                if (!urineProteinString.isEmpty()){
                    double urineProtein = Double.parseDouble(urineProteinString);
                    if (urineProtein>=0.001 && urineProtein<=0.035 ){
                        generalUrineAnalysis+="Показатели белок мочи в норме";
                    }else if (urineProtein>0.036){
                        generalUrineAnalysis+="Показатели белок мочи превышено";
                    }else {
                        generalUrineAnalysis+="Вы ввели неправильную число";
                    }
                }
                String epiteliyString = jTextField49.getText();
                if (!epiteliyString.isEmpty()){
                    // добить их значений
                }

                String nechiporenko = "";
                String cilindresString = jTextField55.getText();
                if (!cilindresString.isEmpty()) {
                    int cilindres = Integer.parseInt(cilindresString);
                    if (cilindres == 20) {
                        nechiporenko += "Показатели цилиндры соответствует к норму\n";
//                            System.out.println("Показатели цилиндры соответствует к норму");
                    } else if (cilindres < 19) {
                        nechiporenko += "Показатели цилиндры в норме, цилиндры не должен соржать не более 20\n";
//                            System.out.println("Показатели цилиндры в норме, цилиндры не должен соржать не более 20");
                    } else if (cilindres > 21) {
                        nechiporenko +="Показатели цилиндры превышен\n";
//                            System.out.println("Показатели цилиндры превышен");
                    } else {
                        nechiporenko += "Вы ввели непавильную показатели цилиндра мочи\n";
//                            System.out.println("Вы ввели непавильную показатели цилиндра мочи");
                    }
                }
                String eritrocitesString =jTextField56.getText();
                if (!eritrocitesString.isEmpty()) {
                    int eritrocites = Integer.parseInt(eritrocitesString);
                    if (eritrocites <= 1000) {
                        nechiporenko += "Показатели эритроциты соответствует к  норму\n";
//                            System.out.println("Показатели эритроциты соответствует к  норму");
                    } else if (eritrocites > 1000) {
                        nechiporenko += "Показатели эритроцитов превышен\n";
//                            System.out.println("Показатели эритроцитов превышен");
                    } else {
                        nechiporenko += "Вы ввели неправильную показатели эритроцитов\n";
//                            System.out.println("Вы ввели неправильную показатели эритроцитов");
                    }
                }
                String leykocitesString = jTextField57.getText();
                if (!leykocitesString.isEmpty()) {
                    int leykocites = Integer.parseInt(leykocitesString);
                    if (leykocites <= 2000) {
                        nechiporenko += "Показатели лейкоцитов соответствует к норму\n";
//                                System.out.println("Показатели лейкоцитов соответствует к норму");
                    } else if (leykocites > 2000) {
                        nechiporenko += "Показатели лейкоцитов превышен\n";
//                                System.out.println("Показатели лейкоцитов превышен");
                    } else {
                        nechiporenko += "Вы ввели неправильную показатели лейкоцитов\n";
//                                System.out.println("Вы ввели неправильную показатели лейкоцитов");
                    }
                }
                JOptionPane.showMessageDialog(jFrame,
                        result + "\n" + clinic1 + "\n" + details + "\n" + xray1 + "\n" + etiology1 + "\n" + mineral1 + "\n" + riskFormation1 + "\n"+ Hours + "\n" + Days + "\n"
                +OAK +"\n" + generalUrineAnalysis + "\n" +nechiporenko +"\n");
            }
        });

        JScrollPane jScrollPane = new JScrollPane(jPanel2);
        jScrollPane.setBorder(BorderFactory.createLineBorder(Color.CYAN));
        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jPanel.add(jScrollPane);


        jFrame.add(jPanel);
        jFrame.getContentPane().add(jPanel);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setPreferredSize(new Dimension(1200, 1000));
        jFrame.setVisible(true);
        jFrame.pack();
    }

    private int getNumber(String text) {
        int result = 0;
        String regex = "\\d+";
        if (!text.isEmpty()) {
            if (!text.matches(regex)) {
                result = -1;
            } else {
                result = Integer.parseInt(text);
            }
        }
        return result;
    }
}
