/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.awt.*;
import javax.swing.*;

public class CalculatorTwoGUI {

    private JFrame frame;
    private JButton bn1, bn2, bn3, bn4, bn5, bn6, bn7, bn8, bn9, bn10, bn11, bn12, bn13, bn14, bn15, bn16;
    private JTextField tf1;
    private JPanel pn1;
    private String oper;
    private double num1 ,num2 ,total;;
    private EventHandling01 eh;

    public CalculatorTwoGUI() {
        eh = new EventHandling01(this);
        frame = new JFrame("My Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        pn1 = new JPanel();
        pn1.setLayout(new GridLayout(4, 4));
        tf1 = new JTextField("");
        bn1 = new JButton("7");
        bn2 = new JButton("8");
        bn3 = new JButton("9");
        bn4 = new JButton("+");
        bn5 = new JButton("4");
        bn6 = new JButton("5");
        bn7 = new JButton("6");
        bn8 = new JButton("-");
        bn9 = new JButton("1");
        bn10 = new JButton("2");
        bn11 = new JButton("3");
        bn12 = new JButton("X");
        bn13 = new JButton("0");
        bn14 = new JButton("c");
        bn15 = new JButton("=");
        bn16 = new JButton("/");
        pn1.add(bn1);
        pn1.add(bn2);
        pn1.add(bn3);
        pn1.add(bn4);
        pn1.add(bn5);
        pn1.add(bn6);
        pn1.add(bn7);
        pn1.add(bn8);
        pn1.add(bn9);
        pn1.add(bn10);
        pn1.add(bn11);
        pn1.add(bn12);
        pn1.add(bn13);
        pn1.add(bn14);
        pn1.add(bn15);
        pn1.add(bn16);
        bn1.addActionListener(eh);
        bn2.addActionListener(eh);
        bn3.addActionListener(eh);
        bn4.addActionListener(eh);
        bn5.addActionListener(eh);
        bn6.addActionListener(eh);
        bn7.addActionListener(eh);
        bn8.addActionListener(eh);
        bn9.addActionListener(eh);
        bn10.addActionListener(eh);
        bn11.addActionListener(eh);
        bn12.addActionListener(eh);
        bn13.addActionListener(eh);
        bn14.addActionListener(eh);
        bn15.addActionListener(eh);
        bn16.addActionListener(eh);
        frame.add(tf1, BorderLayout.NORTH);
        frame.add(pn1);
        frame.setSize(200, 150);
        frame.setVisible(true);
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JButton getBn1() {
        return bn1;
    }

    public void setBn1(JButton bn1) {
        this.bn1 = bn1;
    }

    public JButton getBn2() {
        return bn2;
    }

    public void setBn2(JButton bn2) {
        this.bn2 = bn2;
    }

    public JButton getBn3() {
        return bn3;
    }

    public void setBn3(JButton bn3) {
        this.bn3 = bn3;
    }

    public JButton getBn4() {
        return bn4;
    }

    public void setBn4(JButton bn4) {
        this.bn4 = bn4;
    }

    public JButton getBn5() {
        return bn5;
    }

    public void setBn5(JButton bn5) {
        this.bn5 = bn5;
    }

    public JButton getBn6() {
        return bn6;
    }

    public void setBn6(JButton bn6) {
        this.bn6 = bn6;
    }

    public JButton getBn7() {
        return bn7;
    }

    public void setBn7(JButton bn7) {
        this.bn7 = bn7;
    }

    public JButton getBn8() {
        return bn8;
    }

    public void setBn8(JButton bn8) {
        this.bn8 = bn8;
    }

    public JButton getBn9() {
        return bn9;
    }

    public void setBn9(JButton bn9) {
        this.bn9 = bn9;
    }

    public JButton getBn10() {
        return bn10;
    }

    public void setBn10(JButton bn10) {
        this.bn10 = bn10;
    }

    public JButton getBn11() {
        return bn11;
    }

    public void setBn11(JButton bn11) {
        this.bn11 = bn11;
    }

    public JButton getBn12() {
        return bn12;
    }

    public void setBn12(JButton bn12) {
        this.bn12 = bn12;
    }

    public JButton getBn13() {
        return bn13;
    }

    public void setBn13(JButton bn13) {
        this.bn13 = bn13;
    }

    public JButton getBn14() {
        return bn14;
    }

    public void setBn14(JButton bn14) {
        this.bn14 = bn14;
    }

    public JButton getBn15() {
        return bn15;
    }

    public void setBn15(JButton bn15) {
        this.bn15 = bn15;
    }

    public JButton getBn16() {
        return bn16;
    }

    public void setBn16(JButton bn16) {
        this.bn16 = bn16;
    }

    public JTextField getTf1() {
        return tf1;
    }

    public void setTf1(JTextField tf1) {
        this.tf1 = tf1;
    }

    public JPanel getPn1() {
        return pn1;
    }

    public void setPn1(JPanel pn1) {
        this.pn1 = pn1;
    }

    public String getOper() {
        return oper;
    }

    public void setOper(String oper) {
        this.oper = oper;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public EventHandling01 getEh() {
        return eh;
    }

    public void setEh(EventHandling01 eh) {
        this.eh = eh;
    }

    
}
