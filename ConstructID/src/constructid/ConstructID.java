/*
    Name: Ashwin Rajan
    Program: Computer Engineering
    Course: PROG 24178 Winter 2012
*/

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package constructid;

/**
 *
 * @author Ashwin Rajan
 */
import javax.swing.JOptionPane;
public class ConstructID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String usersInitials= " ";
        String streetNumber= " ";

        String inputUserName = JOptionPane.showInputDialog(null, "Enter Your Full Name - first,middle and last", "");
        usersInitials += inputUserName.charAt(0);
        for (int i = 1; i < inputUserName.length(); i++) {
            if (inputUserName.charAt(i) == ' ') {

                usersInitials += inputUserName.charAt(i + 1);

            }
        }

        usersInitials = usersInitials.toUpperCase();
        
        
        String inputAddress = JOptionPane.showInputDialog(null, "Enter Your Complete Street Address", "");
        streetNumber += inputAddress.charAt(0);
        for (int i = 1; i < inputAddress.length(); i++) {
        
            if (inputAddress.charAt(i) == ' ') {
                break;
            }
            streetNumber += inputAddress.charAt(i);
        }
        
        String output = "ID is "+usersInitials+streetNumber;JOptionPane.showMessageDialog(null, output);
        
        
    }

}
