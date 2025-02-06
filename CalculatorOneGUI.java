/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.awt.*;
import javax.swing.*;
public class CalculatorOneGUI {
    private final JFrame frame;
    private final JButton bn1;
    private final JButton bn2;
    private final JButton bn3;
    private final JButton bn4;
    private final JPanel pn;
    private final JTextField tf1;
    private final JTextField tf2;
    private final JTextField tf3;
    public CalculatorOneGUI() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4,1));
        pn = new JPanel();
        tf1 = new JTextField("", 15);
        tf2 = new JTextField("", 15);
        tf3 = new JTextField("", 15);
        bn1 = new JButton("Add");
        bn2 = new JButton("Minus");
        bn3 = new JButton("Multiply");
        bn4 = new JButton("Divide");
        pn.add(bn1); pn.add(bn2); pn.add(bn3); pn.add(bn4);
        frame.add(tf1);
        frame.add(tf2);
        frame.add(pn);
        frame.add(tf3);
        frame.setSize(200, 150);
        frame.setVisible(true);
    }
}
