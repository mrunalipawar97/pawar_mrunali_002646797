/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import LibraryAppSystem.ApplicationSystem;
import LibraryAppSystem.Branch;
import LibraryAppSystem.UserAccount;
import UI.LibrarianWorkArea.LibrarianJFrame;
import javax.swing.JFrame;

/**
 *
 * @author mrunalipawar
 */
public class LibrarianRole extends Role {

    public LibrarianRole() {
    }

    
    @Override
    public JFrame getWorkArea(ApplicationSystem applicationSystem, Branch branch, UserAccount useraccount) {
        return new LibrarianJFrame(applicationSystem, branch,useraccount);
    }
    
}
