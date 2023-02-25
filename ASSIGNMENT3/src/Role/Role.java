package Role;



import LibraryAppSystem.ApplicationSystem;
import LibraryAppSystem.UserAccount;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nidhi Raghavendra
 */
public abstract class Role {
    static String[] roles = {"SYSAdmin", "Customer", "Librarian" };

    public static String[] getRoles() {
        return roles;
    }
    
    
    public abstract JFrame getWorkArea(ApplicationSystem applicationSystem, UserAccount useraccount);
    
}
