package Role;



import LibraryAppSystem.ApplicationSystem;
import LibraryAppSystem.Branch;
import LibraryAppSystem.UserAccount;
import UI.AdminWorkArea.AdminJFrame;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrunali Pawar
 */
public class AdminRole extends Role {

    public AdminRole() {
    }

    
    @Override
    public JFrame getWorkArea(ApplicationSystem applicationSystem,Branch branch, UserAccount useraccount) {
        return new AdminJFrame(applicationSystem, branch, useraccount);
    }
    
}
