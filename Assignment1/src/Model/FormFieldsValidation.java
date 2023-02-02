/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author mrunalipawar
 */
public class FormFieldsValidation {
    
    Pattern p;
    
    public boolean validateName(String chefName){
        
        String nameValidate = "[A-Za-z]";
        
        p = Pattern.compile(nameValidate);
        
        if(!p.matcher(chefName).matches()) {
            JOptionPane.showMessageDialog(null, "Please enter a valid name", "warning", JOptionPane.WARNING_MESSAGE);
            return true;
        }
        return false;
    }
    
    public static boolean isValidEmail(String email) {

        String emailFormat = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\."
                + "[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";

        Pattern p = Pattern.compile(emailFormat);
        if (email == null) {
            return false;
        }
        return p.matcher(email).matches();
    }

}
