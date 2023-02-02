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
    
    int phone;
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
    
    public boolean validateEmail(String email) {
        String emailValidate = "[a-z0-9!-_.&#*]{2,10} [@][a-z][3,100][.][a-z][3]";
        
        p = Pattern.compile(emailValidate);
        
        if(!p.matcher(email).matches()){
            JOptionPane.showMessageDialog(null,"Email Format : someone@email.com", "warning", JOptionPane.WARNING_MESSAGE);
            return true;
        }
        return false;
    }
    
    
}
