/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Ashwin Rajan
 */
public class ListEvents extends JFrame implements ActionListener {

    private JButton cmdAdd;
    private JButton cmdRem;
    private JTextField txtProvince;
    private DefaultListModel model;
    private JList lstProvince;

    public ListEvents() {
        super("List Box ");

        cmdAdd = new JButton("Add Province ");
        cmdAdd.addActionListener(this);
        cmdRem = new JButton("Remove Province");
        cmdRem.addActionListener(this);
        txtProvince = new JTextField(15);

        model = new DefaultListModel();
        lstProvince = new JList(model);
        lstProvince.setVisibleRowCount(7);

        model.addElement("ON");
        model.addElement("BC");
        model.addElement("AB");
        model.addElement("MA");
        model.addElement("QC");

        JPanel pnlProvince = new JPanel(new FlowLayout(FlowLayout.LEFT, 3, 0));
        pnlProvince.add(new JLabel("New Provience:"));
        pnlProvince.add(txtProvince);

        JPanel pnlNorth = new JPanel(new GridLayout(0, 1));
        pnlNorth.add(pnlProvince);
        pnlNorth.add(cmdAdd);

        JScrollPane scrProvinces = new JScrollPane(lstProvince,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        Container pane = this.getContentPane();

        pane.add(pnlNorth, BorderLayout.NORTH);
        pane.add(scrProvinces, BorderLayout.CENTER);
        pane.add(cmdRem, BorderLayout.SOUTH);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == cmdAdd) {
            String s = txtProvince.getText();
            model.addElement(s);
        }
        if (e.getSource() == cmdRem) {
            int i = model.getSize();
            model.removeElementAt(i - 1);
        }

    }

    public static void main(String[] args) {
        ListEvents list = new ListEvents();
    }
}
