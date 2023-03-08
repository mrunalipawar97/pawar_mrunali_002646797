/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryAppSystem;

import Role.Role;
import java.util.ArrayList;

/**
 *
 * @author mrunalipawar
 */
public class UserAccountDirectory {
    
     
    ArrayList<UserAccount> userAccountlist;
    
    public UserAccountDirectory () {
        this.userAccountlist = new ArrayList<UserAccount>();
    }
    
    public String[] getAllRoles() {
       return Role.getRoles();
    }
    
    public UserAccount createUserAccount(String username, String password, Role role){
        UserAccount user = new UserAccount(username, password, role);
        userAccountlist.add(user);
        return user;
        
    }
    
    public UserAccount findbyId(String id) {
        for(UserAccount u: this.userAccountlist) {
            if(u.getAccountId().equals(id)) {
                return u;
            }
        }
        return null;
    }
   
    
    public UserAccount getUserAccount(String username, String password, Role role) {
        for (UserAccount u : this.userAccountlist) {
            if(u.getUsername().equals(username) && u.getPassword().equals(password) && u.getRole().equals(role)){
                return u;
            }
        }
        return null;
    }
    
    public Boolean accountExists(String username, String password, Role role) {
        
        for (UserAccount u : this.userAccountlist) {
            if(u.getUsername().equals(username) && u.getPassword().equals(password) && u.getRole().equals(role)){
                return true;
            }
        }
        return false;
    }
    
    public UserAccount authenticateUser(String name, String password) {
        for(UserAccount ua: this.userAccountlist) {
            if(ua.getUsername().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public UserAccount findByUsername(String name) {
        for(UserAccount u: this.userAccountlist) {
            if(u.getUsername().equals(name)) {
                return u;
            }
        }
        return null;
    }
    
    public void removeUser(UserAccount u){
        this.userAccountlist.remove(u);
    }

}
