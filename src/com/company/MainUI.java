package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainUI {
    public void build (String [] args){
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel(new BorderLayout());
        jPanel.setBorder(BorderFactory.createLineBorder(Color.BLUE));

        JPanel jPanel1 = new JPanel(new BorderLayout());
        jPanel.add(jPanel1, BorderLayout.EAST);
        jPanel1.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        jPanel1.setPreferredSize(new Dimension(120,35));
        JPanel jPanelButtonResult = new JPanel();
        JButton jButtonresult = new JButton("<html>Выдать <br>результат</html>");
        jButtonresult.setPreferredSize(new Dimension(120,35));
        jPanelButtonResult.add(jButtonresult);
        jPanel1.add(jPanelButtonResult);

        JPanel jPanelWest = new JPanel(null);
        jPanelWest.setPreferredSize(new Dimension(108,0));
        jPanel.add(jPanelWest, BorderLayout.WEST);

        JPanel jPanel2 = new JPanel(null);
        jPanel.add(jPanel2, BorderLayout.CENTER);
        jPanel2.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        jPanel2.setPreferredSize(new Dimension(1020,2000));

        JPanel jPanel3 = new JpanelLongStone();
        jPanel2.add(jPanel3);
        jPanel3.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        jPanel3.setBounds(10,10,1095,280);
        JLabel stoneClassification = new JLabel("КЛИНИЧЕСКИЙ ПРОТОКОЛ ПО МКБ:");
        stoneClassification.setBounds(472,10,370,20);
        jPanel3.add(stoneClassification);

        JLabel jLabel1 = new JLabel("ПО ЛОКАЛИЗАЦИИ КОНКРЕМЕНТА СПРАВА:");
        jLabel1.setBounds(10,35, 330,20);
        jPanel3.add(jLabel1);
        JLabel jLabel2 = new JLabel("Верхняя чашечка");
        jLabel2.setBounds(10,55,150,20);
        jPanel3.add(jLabel2);
        JTextField jTextField = new JTextField();
        jTextField.setBounds(250,55,40,20);
        jPanel3.add(jTextField);
        JLabel jLabel3 = new JLabel("мм");
        jLabel3.setBounds(295,55,20,20);
        jPanel3.add(jLabel3);
        JLabel jLabel4 = new JLabel("Средняя чашечка");
        jLabel4.setBounds(10,80,150,20);
        jPanel3.add(jLabel4);
        JTextField jTextField1 = new JTextField();
        jTextField1.setBounds(250,80,40,20);
        jPanel3.add(jTextField1);
        JLabel jLabel5 = new JLabel("мм");
        jLabel5.setBounds(295,80,20,20);
        jPanel3.add(jLabel5);
        JLabel jLabel6 = new JLabel("Нижняя чашечка");
        jLabel6.setBounds(10,105,150,20);
        jPanel3.add(jLabel6);
        JTextField jTextField2 = new JTextField();
        jTextField2.setBounds(250,105,40,20);
        jPanel3.add(jTextField2);
        JLabel jLabel7 = new JLabel("мм");
        jLabel7.setBounds(295,105,20,20);
        jPanel3.add(jLabel7);
        JLabel jLabel8 = new JLabel("Почечная лоханка");
        jLabel8.setBounds(10,130,150,20);
        jPanel3.add(jLabel8);
        JTextField jTextField3 = new JTextField();
        jTextField3.setBounds(250,130,40,20);
        jPanel3.add(jTextField3);
        JLabel jLabel9 = new JLabel("мм");
        jLabel9.setBounds(295,130,20,20);
        jPanel3.add(jLabel9);
        JLabel jLabel10 = new JLabel("вехний отдел мочеточника");
        jLabel10.setBounds(10,155,190,20);
        jPanel3.add(jLabel10);
        JTextField jTextField4 = new JTextField();
        jTextField4.setBounds(250,155,40,20);
        jPanel3.add(jTextField4);
        JLabel jLabel11 = new JLabel("мм");
        jLabel11.setBounds(295,155,20,20);
        jPanel3.add(jLabel11);
        JLabel jLabel12 = new JLabel("средний отдел мочеточника");
        jLabel12.setBounds(10,180,225,20);
        jPanel3.add(jLabel12);
        JTextField jTextField5 = new JTextField();
        jTextField5.setBounds(250,180,40,20);
        jPanel3.add(jTextField5);
        JLabel jLabel13 = new JLabel("мм");
        jLabel13.setBounds(295,180,20,20);
        jPanel3.add(jLabel13);
        JLabel jLabel14 = new JLabel("<html>нижний (дистальный) отдел<br> мочеточника</html>");
        jLabel14.setBounds(10,207,245,30);
        jPanel3.add(jLabel14);
        JTextField jTextField6 = new JTextField();
        jTextField6.setBounds(250,205,40,20);
        jPanel3.add(jTextField6);
        JLabel jLabel15 = new JLabel("мм");
        jLabel15.setBounds(295,203,20,20);
        jPanel3.add(jLabel15);

        JLabel jLabel16 = new JLabel("ПО ЛОКАЛИЗАЦИИ КОНКРЕМЕНТА СЛЕВА:");
        jLabel16.setBounds(390,35,350,20);
        jPanel3.add(jLabel16);
        JLabel jLabel17 = new JLabel("Верхняя чашечка");
        jLabel17.setBounds(390,55,150,20);
        jPanel3.add(jLabel17);
        JTextField jTextField9 = new JTextField();
        jTextField9.setBounds(615,55,40,20);
        jPanel3.add(jTextField9);
        JLabel jLabel18 = new JLabel("мм");
        jLabel18.setBounds(660,55,20,20);
        jPanel3.add(jLabel18);
        JLabel jLabel19 = new JLabel("Средняя чашечка");
        jLabel19.setBounds(390,80,150,20);
        jPanel3.add(jLabel19);
        JTextField jTextField10 = new JTextField();
        jTextField10.setBounds(615,80,40,20);
        jPanel3.add(jTextField10);
        JLabel jLabel20 = new JLabel("мм");
        jLabel20.setBounds(660,80,20,20);
        jPanel3.add(jLabel20);
        JLabel jLabel21 = new JLabel("Нижняя чашечка");
        jLabel21.setBounds(390,105,150,20);
        jPanel3.add(jLabel21);
        JTextField jTextField11 = new JTextField();
        jTextField11.setBounds(615,105,40,20);
        jPanel3.add(jTextField11);
        JLabel jLabel22 = new JLabel("мм");
        jLabel22.setBounds(660,105,20,20);
        jPanel3.add(jLabel22);
        JLabel jLabel23 = new JLabel("Почечная лоханка");
        jLabel23.setBounds(390,130,150,20);
        jPanel3.add(jLabel23);
        JTextField jTextField12 = new JTextField();
        jTextField12.setBounds(615,130,40,20);
        jPanel3.add(jTextField12);
        JLabel jLabel24 = new JLabel("мм");
        jLabel24.setBounds(660,130,20,20);
        jPanel3.add(jLabel24);
        JLabel jLabel25 = new JLabel("вехний отдел мочеточника");
        jLabel25.setBounds(390,155,190,20);
        jPanel3.add(jLabel25);
        JTextField jTextField13 = new JTextField();
        jTextField13.setBounds(615,155,40,20);
        jPanel3.add(jTextField13);
        JLabel jLabel26 = new JLabel("мм");
        jLabel26.setBounds(660,155,20,20);
        jPanel3.add(jLabel26);
        JLabel jLabel27 = new JLabel("средний отдел мочеточника");
        jLabel27.setBounds(390,180,220,20);
        jPanel3.add(jLabel27);
        JTextField jTextField14 = new JTextField();
        jTextField14.setBounds(615,180,40,20);
        jPanel3.add(jTextField14);
        JLabel jLabel28 = new JLabel("мм");
        jLabel28.setBounds(660,180,20,20);
        jPanel3.add(jLabel28);
        JLabel jLabel29 = new JLabel("<html>нижний (дистальный) отдел<br> мочеточника</html>");
        jLabel29.setBounds(390,207,250,30);
        jPanel3.add(jLabel29);
        JTextField jTextField15 = new JTextField();
        jTextField15.setBounds(615,205,40,20);
        jPanel3.add(jTextField15);
        JLabel jLabel30 = new JLabel("мм");
        jLabel30.setBounds(660,203,20,20);
        jPanel3.add(jLabel30);

        JLabel jLabel31 = new JLabel("ПО ЛОКАЛИЗАЦИИ КОНКРЕМЕНТА:");
        jLabel31.setBounds(750,35,250,20);
        jPanel3.add(jLabel31);
        JLabel jLabel32 = new JLabel("Мочевой пузырь");
        jLabel32.setBounds(750,55,195,20);
        jPanel3.add(jLabel32);
        JTextField jTextField16 = new JTextField();
        jTextField16.setBounds(925,55,40,20);
        jPanel3.add(jTextField16);
        JLabel jLabel33 = new JLabel("мм");
        jLabel33.setBounds(970,55,20,20);
        jPanel3.add(jLabel33);
        JLabel jLabel34 = new JLabel("Уретра");
        jLabel34.setBounds(750,80,195,20);
        jPanel3.add(jLabel34);
        JTextField jTextField17 = new JTextField();
        jTextField17.setBounds(925,80,40,20);
        jPanel3.add(jTextField17);
        JLabel jLabel35 = new JLabel("мм");
        jLabel35.setBounds(970,80,20,20);
        jPanel3.add(jLabel35);

        JLabel jLabel36 = new JLabel("ПО КЛИНИКЕ:");
        jLabel36.setBounds(750,110,150,20);
        jPanel3.add(jLabel36);
        JCheckBox jCheckBox = new JCheckBox("первичный");
        jCheckBox.setBounds(750,130,150,20);
        jPanel3.add(jCheckBox);
        JCheckBox jCheckBox1 = new JCheckBox("рецидивный");
        jCheckBox1.setBounds(750,155,150,20);
        jPanel3.add(jCheckBox1);
        JCheckBox jCheckBox2 = new JCheckBox("инфицированный");
        jCheckBox2.setBounds(750,180,150,20);
        jPanel3.add(jCheckBox2);
        JCheckBox jCheckBox3 = new JCheckBox("не инфицированный");
        jCheckBox3.setBounds(750,205,200,20);
        jPanel3.add(jCheckBox3);

        JLabel jLabel37 = new JLabel("<html><i>Конкременты подразделяются на группы размером: 1) < 5 мм, 2) 5–10 мм, 3) 10–20 мм и 4) > 20 мм.</i></html>");
        jLabel37.setBounds(260,255,800,20);
        jPanel3.add(jLabel37);

        JPanel jPanel4 = new JPanel(null);
        jPanel2.add(jPanel4);
        jPanel4.setBounds(10,295,1095,150);
        jPanel4.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JLabel jLabel38 = new JLabel("ПО РЕНТГЕЛОГИЧЕСКОЙ ХАРАКТЕРИСТИКЕ:");
        jLabel38.setBounds(419,5,350,20);
        jPanel4.add(jLabel38);
        JLabel jLabel39 = new JLabel("РЕНТГЕНОКОНТРАСТНЫЙ КАМЕНЬ:");
        jLabel39.setBounds(10,25,250,20);
        jPanel4.add(jLabel39);
        JCheckBox jCheckBox4 = new JCheckBox("Дигидрат  оксалат кальция");
        jCheckBox4.setBounds(10,45,250,20);
        jPanel4.add(jCheckBox4);
        JCheckBox jCheckBox5 = new JCheckBox("Моногидрат оксалат кальция");
        jCheckBox5.setBounds(10,65,250,20);
        jPanel4.add(jCheckBox5);
        JCheckBox jCheckBox6 = new JCheckBox("Фосфат кальция");
        jCheckBox6.setBounds(10,85,150,20);
        jPanel4.add(jCheckBox6);
        JLabel jLabel40 = new JLabel("НИЗКАЯ РЕНТГЕНОКОНТРАСТНОСТЬ:");
        jLabel40.setBounds(390,25,300,20);
        jPanel4.add(jLabel40);
        JCheckBox jCheckBox7 = new JCheckBox("Фосфат магния и аммония");
        jCheckBox7.setBounds(390,45,250,20);
        jPanel4.add(jCheckBox7);
        JCheckBox jCheckBox8 = new JCheckBox("Апатит");
        jCheckBox8.setBounds(390,65,100,20);
        jPanel4.add(jCheckBox8);
        JCheckBox jCheckBox9 = new JCheckBox("Цистин");
        jCheckBox9.setBounds(390,85,100,20);
        jPanel4.add(jCheckBox9);
        JLabel jLabel41 = new JLabel("РЕНТГЕННЕГАТИВНЫЙ КОНКРЕМЕНТ:");
        jLabel41.setBounds(750,25,300,20);
        jPanel4.add(jLabel41);
        JCheckBox jCheckBox10 = new JCheckBox("Мочевая кислота");
        jCheckBox10.setBounds(750,45,150,20);
        jPanel4.add(jCheckBox10);
        JCheckBox jCheckBox11 = new JCheckBox("Урат аммония");
        jCheckBox11.setBounds(750,65,150,20);
        jPanel4.add(jCheckBox11);
        JCheckBox jCheckBox12 = new JCheckBox("Ксантин");
        jCheckBox12.setBounds(750,85,100,20);
        jPanel4.add(jCheckBox12);
        JCheckBox jCheckBox13 = new JCheckBox("2,8-дигидроксиаденин");
        jCheckBox13.setBounds(750,105,200,20);
        jPanel4.add(jCheckBox13);
        JCheckBox jCheckBox14 = new JCheckBox("Лекарственные камни");
        jCheckBox14.setBounds(750,125,200,20);
        jPanel4.add(jCheckBox14);

        JPanel jPanel5 = new JPanel(null);
        jPanel2.add(jPanel5);
        jPanel5.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        jPanel5.setBounds(10,450,1095,115);
        JLabel jLabel42 = new JLabel("ПО ЭТИОЛОГИИ");
        jLabel42.setBounds(472,5,150,20);
        jPanel5.add(jLabel42);
        JLabel jLabel43 = new JLabel("НЕИНФЕКЦИОННЫЕ КАМНИ");
        jLabel43.setBounds(10,25,250,20);
        jPanel5.add(jLabel43);
        JCheckBox jCheckBox15 = new JCheckBox("оксалат кальция");
        jCheckBox15.setBounds(10,45,150,20);
        jPanel5.add(jCheckBox15);
        JCheckBox jCheckBox16 = new JCheckBox("фосфат кальция");
        jCheckBox16.setBounds(10,65,150,20);
        jPanel5.add(jCheckBox16);
        JCheckBox jCheckBox17 = new JCheckBox("мочевая кислота");
        jCheckBox17.setBounds(10,85,150,20);
        jPanel5.add(jCheckBox17);
        JLabel jLabel44 = new JLabel("ИНФНЕЦИОННЫЕ КАМНИ:");
        jLabel44.setBounds(275,25,200,20);
        jPanel5.add(jLabel44);
        JCheckBox jCheckBox18 = new JCheckBox("фосфат магния-аммония");
        jCheckBox18.setBounds(275,45,200,20);
        jPanel5.add(jCheckBox18);
        JCheckBox jCheckBox19 = new JCheckBox("апатит");
        jCheckBox19.setBounds(275,65,100,20);
        jPanel5.add(jCheckBox19);
        JCheckBox jCheckBox20 = new JCheckBox("урат аммония");
        jCheckBox20.setBounds(275,85,150,20);
        jPanel5.add(jCheckBox20);
        JLabel jLabel45 = new JLabel("ГЕНЕТИЧЕСКИЕ ПРИЧИНЫ:");
        jLabel45.setBounds(550,25,250,20);
        jPanel5.add(jLabel45);
        JCheckBox jCheckBox21 = new JCheckBox("цистин");
        jCheckBox21.setBounds(550,45,100,20);
        jPanel5.add(jCheckBox21);
        JCheckBox jCheckBox22 = new JCheckBox("ксантин");
        jCheckBox22.setBounds(550,65,120,20);
        jPanel5.add(jCheckBox22);
        JCheckBox jCheckBox23 = new JCheckBox("2,8-дигидроксиаденин");
        jCheckBox23.setBounds(550,85,200,20);
        jPanel5.add(jCheckBox23);
        JLabel jLabel46 = new JLabel("ЛЕКАРСТВЕННЫЕ КАМНИ:");
        jLabel46.setBounds(800,25,250,20);
        jPanel5.add(jLabel46);

        JPanel jPanel6 = new MineralogicalComposition();
        jPanel6.setBounds(10,570,1095,200);
        jPanel6.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        jPanel2.add(jPanel6);
        JLabel jLabel47 = new JLabel("ПО МИНЕРАЛОГИЧЕСКОМУ СОСТАВУ");
        jLabel47.setBounds(396,5,300,20);
        jPanel6.add(jLabel47);
        JLabel jLabel48 = new JLabel("НАЗВАНИЕ ХИМИЧЕСКОГО ВЕЩЕСТВА:");
        jLabel48.setBounds(55,30,300,20);
        jPanel6.add(jLabel48);

        String regex = "\\d+";
        jButtonresult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result = "";
                String details ="";
                int t1 = getNumber(jTextField.getText());
                int single = 0;
                if (t1 == -1) {
                    System.out.println("Введите число");
                }
                if (t1 > 0) {
                    details += "Камень верхней чашечки справа с размером " + t1+ "мм\n";
                    single++;
                }
                int t2 = getNumber(jTextField1.getText());
                if (t2 == -1) {
                    System.out.println("Введите число");
                }
                if (t2 > 0) {
                    single++;
                    details += "Камень средней чашечки справа с размером "+ t2 + "мм";
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
                if (t4 == -1){
                    System.out.println("Введите число");
                }if (t4 > 0) {
                    details += "Камень почечной лоханки справа с размером  " + t4 + "мм\n";
                    single++;
                }
                int t5 = getNumber(jTextField4.getText());
                if (t5 == -1){
                    System.out.println("Введите число");
                }if (t5 > 0) {
                    details += "Камень верхней треть мочечточника справа с размером " + t5 + "мм\n";
                    single++;
                }
                int t6 = getNumber(jTextField5.getText());
                if (t6 == -1){
                    System.out.println("Введите число");
                }if (t6 > 0) {
                    details += "Камень средней треть мочечточника справа с размером " + t6 + "мм\n";
                    single++;
                }
                int t7 = getNumber(jTextField6.getText());
                if (t7 == -1){
                    System.out.println("Введите число");
                }if (t7 > 0) {
                    details += "Камень нижнего (дистальный) отдела  мочеточника справа с размером " + t7 + "мм\n";
                    single++;
                }
                int t8 = getNumber(jTextField9.getText());
                if (t8 == -1){
                    System.out.println("Введите число");
                }if (t8 > 0) {
                    details += "Камень верхней чашечки  слева с размером " + t8 + "мм\n";
                    single++;
                }
                int t9 = getNumber(jTextField10.getText());
                if (t9 == -1){
                    System.out.println("Введите число");
                }if (t9 > 0) {
                    details += "Камень средней чашечки слева с  размером " + t9 + "мм\n";
                    single++;
                }
                int t10 = getNumber(jTextField11.getText());
                if (t10 == -1){
                    System.out.println("Введите число");
                }if (t10 > 0) {
                    details += "Камень нижней чашечки слева с размером " + t10 + "мм\n";
                    single++;
                }
                int t11 = getNumber(jTextField12.getText());
                if (t11 == -1){
                    System.out.println("Введите число");
                }if (t11 > 0) {
                    details += "Камень почечной лоханки слева с размером " + t11 + "мм\n";
                    single++;
                }
                int t12 = getNumber(jTextField13.getText());
                if (t12 == -1){
                    System.out.println("Введите число");
                }if (t12 > 0) {
                    details += "Камень верхней трертьи мочечточника слева с  размером " + t12 + "мм\n";
                    single++;
                }
                int t13 = getNumber(jTextField14.getText());
                if (t13 == -1){
                    System.out.println("Введите число");
                }if (t13 > 0) {
                    details += "Камень средней третьи мочеточника слева с  размером " + t13+"мм\n";
                    single++;
                }
                int t14 = getNumber(jTextField15.getText());
                if (t14 == -1){
                    System.out.println("Введите число");
                }if (t14 > 0) {
                    details += "Камень нижнего (дистальный) отдела мочеточника слева с  размером " + t14+"мм\n";
                    single++;
                }
                int t15 = getNumber(jTextField16.getText());
                if (t15 == -1){
                    System.out.println("Введите число");
                }if (t15 > 0) {
                    details += "Камень мочевого пузыря с размером " + t15 + "мм\n";
                    single++;
                }
                int t16 = getNumber(jTextField17.getText());
                if (t16 == -1){
                    System.out.println("Введите число");
                }if (t16 > 0) {
                    details += "Камень уретры с  размером " + t16+ "мм\n";
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
                if (jCheckBox.isSelected()){
                    clinic += "первичный ";
                }
                if (jCheckBox1.isSelected()){
                    clinic += "рецидивный ";
                }
                if (jCheckBox2.isSelected()){
                    clinic += "инфицированный ";
                }
                if (jCheckBox3.isSelected()){
                    clinic += "неинфицированный ";
                }
                String clinic1 = !clinic.isEmpty() ? "По клинике: " + clinic : "";
                System.out.println(result);

                String xray ="";
                if (jCheckBox4.isSelected()){
                    xray += "Рентгенконтрастный конкремент - дигигдрат оксалат кальция ";
                }
                if (jCheckBox5.isSelected()){
                    xray +="Рентгенконтрастный конкремент - моногидрат оксалат кальция ";
                }
                if (jCheckBox6.isSelected()){
                    xray +="Рентгеноконтрастный конкремент - фосфат кальция ";
                }
                if (jCheckBox7.isSelected()){
                    xray += "Низкая рентгеноконтрастный конкремент - фосфат магния и аммония ";
                }
                if (jCheckBox8.isSelected()){
                    xray +="Низкая рентгеноконтрастный конкремент - апатит ";
                }
                if (jCheckBox9.isSelected()){
                    xray +="Низкая рентгеноконтрастный конкремент - цистин ";
                }
                if (jCheckBox10.isSelected()){
                    xray +="Рентгеннегативный конкремент - мочевая кислота ";
                }
                if (jCheckBox11.isSelected()){
                    xray +="Рентгеннегативный конкремент - урат аммония ";
                }
                if (jCheckBox12.isSelected()){
                    xray +="Рентгеннегативный конкремент - ксантин ";
                }
                if (jCheckBox13.isSelected()){
                    xray+="Рентгеннегативный конкремент - 2,8-дигидроксиаденин";
                }
                if (jCheckBox14.isSelected()){
                    xray+="Рентгеннегативный конкремент - лекарственные камни";
                }
                String xray1 = !xray.isEmpty() ? "По рентгенологическом характеристике:  "+xray: "";

                String etiology ="";
                if (jCheckBox15.isSelected()){
                    etiology+="Неинфекционные камни: - оксалат кальция\n";
                }
                if (jCheckBox16.isSelected()){
                    etiology+="Неинфекционные камни: - фосфат кальция\n";
                }
                if (jCheckBox17.isSelected()){
                    etiology+="Неинфекционные камни: - мочевая кислота\n";
                }
                if (jCheckBox18.isSelected()){
                    etiology+="Инфекционные камни: - фосфат магния-аммония\n";
                }
                if (jCheckBox19.isSelected()){
                    etiology+="Инфекционные камни: - апатит\n";
                }
                if (jCheckBox20.isSelected()){
                    etiology+="Инфекционные камни: - урат аммония\n";
                }
                if (jCheckBox21.isSelected()){
                    etiology+="Генетические причины: - цистин\n";
                }
                if (jCheckBox22.isSelected()){
                    etiology+="Генетические причины: - ксантин\n";
                }
                if (jCheckBox23.isSelected()){
                    etiology+="Генетические причины: - 2,8-дигидроксиаденин\n";
                }
                String etiology1 = !etiology.isEmpty() ? "ПО ЭТИОЛОГИИ: " +etiology: "";

                JOptionPane.showMessageDialog(jFrame,
                        result + "\n" + clinic1 +"\n" + details +"\n"+ xray1 +"\n" + etiology1 +"\n");
            }
        });

        JScrollPane jScrollPane = new JScrollPane(jPanel2);
        jScrollPane.setBorder(BorderFactory.createLineBorder(Color.CYAN));
        jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jPanel.add(jScrollPane);


        jFrame.add(jPanel);
        jFrame.getContentPane().add(jPanel);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setPreferredSize(new Dimension(1200,1000));
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
