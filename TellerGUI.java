/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.awt.*;
import javax.swing.*;
public class TellerGUI {
    private JFrame frame;
    private JPanel pn1, pn2;
    private JLabel lb1, lb2, lb6000;
    private JTextField tf;
    private JButton bn1, bn2, bn3;
    private EventHandling02 eh;
    public TellerGUI() {
        eh = new EventHandling02(this);
        frame = new JFrame("Teller GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3,1));
        pn1 = new JPanel();
        pn2 = new JPanel();
        lb1 = new JLabel("Balance");
        lb2 = new JLabel("Amount");
        lb6000 = new JLabel("6000");
        tf = new JTextField("");
        bn1 = new JButton("Deposit");
        bn2 = new JButton("WithDraw");
        bn3 = new JButton("Exit");
        pn1.setLayout(new GridLayout(2,2));
        pn1.add(lb1);   pn1.add(lb6000);
        pn1.add(lb2);   pn1.add(tf);
        pn2.add(bn1);   pn2.add(bn2);   pn2.add(bn3);
        bn1.addActionListener(eh);
        bn2.addActionListener(eh);
        bn3.addActionListener(eh);
        frame.add(pn1);
        frame.add(pn2);
        frame.setSize(200, 150);
        frame.setVisible(true);
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JPanel getPn1() {
        return pn1;
    }

    public void setPn1(JPanel pn1) {
        this.pn1 = pn1;
    }

    public JPanel getPn2() {
        return pn2;
    }

    public void setPn2(JPanel pn2) {
        this.pn2 = pn2;
    }

    public JLabel getLb1() {
        return lb1;
    }

    public void setLb1(JLabel lb1) {
        this.lb1 = lb1;
    }

    public JLabel getLb2() {
        return lb2;
    }

    public void setLb2(JLabel lb2) {
        this.lb2 = lb2;
    }

    public JLabel getLb6000() {
        return lb6000;
    }

    public void setLb6000(JLabel lb6000) {
        this.lb6000 = lb6000;
    }

    public JTextField getTf() {
        return tf;
    }

    public void setTf(JTextField tf) {
        this.tf = tf;
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

    public EventHandling02 getEh() {
        return eh;
    }

    public void setEh(EventHandling02 eh) {
        this.eh = eh;
    }
    
}
