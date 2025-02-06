/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.awt.event.*;
public class EventHandling01 implements ActionListener , WindowListener{
    private final CalculatorTwoGUI gui;
    public EventHandling01 (CalculatorTwoGUI gui) {
        this.gui = gui;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        if (command.matches("[0-9]")) {
            gui.getTf1().setText(gui.getTf1().getText() + command);
        }
        if (command.matches("[+-/X]")) {
            gui.setNum1(Double.parseDouble(gui.getTf1().getText()));
            gui.setOper(command);
            gui.getTf1().setText("");
        }
        if (command.matches("=")){
            gui.setNum2(Double.parseDouble(gui.getTf1().getText()));
        
            if (gui.getOper().equals("+") ){
                gui.setTotal(gui.getNum1() + gui.getNum2());
            }
            else if (gui.getOper().equals("-") ){
                gui.setTotal(gui.getNum1() - gui.getNum2());
            }
            else if (gui.getOper().equals("/") ){
                gui.setTotal(gui.getNum1() / gui.getNum2());
            }
            else if (gui.getOper().equals("X") ){
                gui.setTotal(gui.getNum1() * gui.getNum2());
            }
            gui.getTf1().setText(String.valueOf(gui.getTotal()));
        }
        if (command.equals("c")) {
            gui.getTf1().setText("");
            gui.setNum1(0);
            gui.setNum2(0);
            gui.setOper("");
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowClosing(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

