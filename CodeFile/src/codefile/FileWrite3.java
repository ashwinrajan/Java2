/*
 Name: Ashwin Rajan
 Program: Computer Engineering
 Course: PROG 24178 Winter 2012
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package codefile;

/**
 *
 * @author Ashwin Rajan
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class FileWrite3 extends JFrame implements ActionListener {

    private JTextField[] txtFields;		// array of the 4 fields
    // captions for the labels
    private String[] captions = {"Course Code:", "Assignment:",
        "Mark:", "Out of:", "Weighting:"};
    private JButton cmdSave, // save button
            cmdExit;		// exit button
    // output stream stuff
    private PrintWriter fileOut;
    private final String FILE_NAME = "grades.dat";

    public FileWrite3() {
        super("Grades");

        // create the text field array
        txtFields = new JTextField[captions.length];

        // create gridbaglayout objects
        GridBagLayout grid = new GridBagLayout();
        GridBagConstraints con = new GridBagConstraints();

        // layout the label/textbox pairs in a panel
        JPanel pnlFields = new JPanel(grid);
        for (int i = 0; i < txtFields.length; i++) {
            // label
            JLabel lbl = new JLabel(captions[i]);
            // set up label's layout constraints
            setCon(con, 0, i, 1, 1, GridBagConstraints.NONE, GridBagConstraints.EAST, new Insets(2, 5, 2, 2));
            grid.setConstraints(lbl, con);

            // text box
            txtFields[i] = new JTextField(10);
            // set up text box's layout constraints
            setCon(con, 1, i, 1, 1, GridBagConstraints.NONE, GridBagConstraints.WEST, new Insets(2, 2, 0, 2));
            grid.setConstraints(txtFields[i], con);

            // if resizing occurs, this makes the label/textboxes
            // stay together nicer (sometimes!)
            lbl.setLabelFor(txtFields[i]);

            // add label and text box to panel
            pnlFields.add(lbl);
            pnlFields.add(txtFields[i]);
        }

        // set up the buttons
        cmdSave = new JButton("Save");
        cmdSave.addActionListener(this);
        cmdSave.setMnemonic(KeyEvent.VK_S);
        cmdExit = new JButton("Exit");
        cmdExit.addActionListener(this);
        cmdExit.setMnemonic(KeyEvent.VK_X);
        // buttons in their own panel so they don't have to be
        // aligned with textbox/label columns
        JPanel pnlButtons =
                new JPanel(new FlowLayout(FlowLayout.CENTER, 5, 0));
        pnlButtons.add(cmdSave);
        pnlButtons.add(cmdExit);

        // set up constraints for the button panel
        setCon(con, 0, txtFields.length, 2, 1, GridBagConstraints.HORIZONTAL, GridBagConstraints.CENTER, new Insets(2, 0, 2, 0));
        grid.setConstraints(pnlButtons, con);
        // add button panel to the rest of the fields
        pnlFields.add(pnlButtons);

        // set up content pane and put it all together
        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        pane.add(pnlFields);

        // set up main frame
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        // TODO: open the output stream
        //  (don't forget the try-catch block -- for now print
        //   a stack trace..  what would you want to do later?)

    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == cmdSave) {
            // TODO:
            // Save each field to as one record to the file.
            // Remember to use delimiters!
            // TODO:
            // Clear the fields using the method you will create below
            // then set the focus to the first field.
        } else if (event.getSource() == cmdExit) {
            int ok = JOptionPane.showConfirmDialog(null,
                    "Are you sure you wish to exit?", "Exit",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (ok == JOptionPane.YES_OPTION) {
                // TODO:  close the file stream and exit the program
            }
        }
    }

    /*
     * TODO: clearFields method - empties all the text fields
     */
    private void clearFields() {
    }
    /*
     * Sets all the constraints -- much easier than always typing the same
     * statements all the darn time.
     */

    private void setCon(GridBagConstraints con, int x, int y,
            int w, int h, int fill, int anchor, Insets i) {
        con.gridx = x;
        con.gridy = y;
        con.gridwidth = w;
        con.gridheight = h;
        con.fill = fill;
        con.anchor = anchor;
        con.insets = i;
    }
}
