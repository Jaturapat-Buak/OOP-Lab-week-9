/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.awt.*;
import javax.swing.*;
public class MDIFromGUI {
    private JDesktopPane dtp;
    private JInternalFrame mainframe, frame1, frame2, frame3;
    private JFrame fr;
    private JMenuBar mb;
    private JMenu m1,m2, m3, mi1;
    private JMenuItem mi2, mi3, mi4, mi11, mi12;
    public MDIFromGUI() {
        fr = new JFrame("SubMenuItem Demo");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dtp = new JDesktopPane();
        dtp.setBackground(Color.BLACK);
        mainframe = new JInternalFrame("SubMenuItem Demo", true, true, true, true);
        frame1 = new JInternalFrame("Application 01", true, true, true, true);
        frame2 = new JInternalFrame("Application 02", true, true, true, true);
        frame3 = new JInternalFrame("Application 03", true, true, true, true);
        frame1.setSize(200, 150);
        frame2.setSize(200, 200);
        frame3.setSize(300,300);
        frame1.setVisible(true);
        frame2.setVisible(true);
        frame3.setVisible(true);
        dtp.add(frame1);
        dtp.add(frame2);
        dtp.add(frame3);
        mb = new JMenuBar();
        fr.setJMenuBar(mb);
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        mb.add(m1); mb.add(m2); mb.add(m3);
        mi1 = new JMenu("New");
        mi2 = new JMenuItem("Open");
        mi3 = new JMenuItem("Save");
        mi4 = new JMenuItem("Exit");
        mi11 = new JMenuItem("Window");
        mi12 = new JMenuItem("Message");
        m1.add(mi1); m1.addSeparator(); m1.add(mi2); m1.addSeparator(); m1.add(mi3); m1.addSeparator(); m1.add(mi4);
        mi1.add(mi11); mi1.addSeparator(); mi1.add(mi12);
        fr.add(dtp);
        fr.setSize(200, 150);
        fr.setVisible(true);
    }
}
