/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryAppSystem;

import Role.AdminRole;
import Role.BranchManagerRole;
import Role.CustomerRole;
import Role.LibrarianRole;
import javax.swing.JFrame;

/**
 *
 * @author mrunalipawar
 */
public class UserAccount {
    
    private static int count =0;
    private String accountId;
    private String username;
    private String password;
    
    private String role;
    
    public UserAccount() {
        this.accountId = "ACC" +count++;
        this.username = username;
        this.password = password;
        this.role = role;
    }
    
    public UserAccount(String username, String password, String role) {
        this.accountId = role+count++;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        UserAccount.count = count;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
   
    
    public JFrame getWorkArea(String role, ApplicationSystem applicationSystem, UserAccount useraccount) {
        // the abstract class way
        if (role.equals("SYSAdmin")) {
            return new AdminRole().getWorkArea(applicationSystem, useraccount);
        }
        if (role.equals("Customer")) {
            return new CustomerRole().getWorkArea(applicationSystem, useraccount);
        }
        if (role.equals("Librarian")) {
            return new LibrarianRole().getWorkArea(applicationSystem, useraccount);
        }
        if (role.equals("BranchManager")) {
            return new BranchManagerRole().getWorkArea(applicationSystem, useraccount);
        }
        return null;
    }
}
