/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import LibraryAppSystem.ApplicationSystem;
import LibraryAppSystem.Branch;
import LibraryAppSystem.UserAccount;
import UI.CustomerWorkArea.CustomerJFrame;
import javax.swing.JFrame;

/**
 *
 * @author mrunalipawar
 */
public class CustomerRole extends Role {

    public CustomerRole() {
    }

    
    @Override
    public JFrame getWorkArea(ApplicationSystem applicationSystem, UserAccount useraccount) {
        return new CustomerJFrame(applicationSystem, useraccount);
    }
    
}
