/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Librarian;

import LibraryAppSystem.UserAccount;
import LibraryAppSystem.UserAccountDirectory;

/**
 *
 * @author mrunalipawar
 */
public class Branch {
    
    String branchName;
    Librarian library;
    UserAccountDirectory userAccountDirectory;

    public Branch()  {
        library = new Librarian();
        userAccountDirectory = new UserAccountDirectory();
    }

    public Branch(String branchName, Librarian library, UserAccountDirectory userAccountDirectory) {
        this.branchName = branchName;
        this.library = library;
        this.userAccountDirectory = userAccountDirectory;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public Librarian getLibrary() {
        return library;
    }

    public void setLibrary(Librarian library) {
        this.library = library;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }
    
    @Override
    public String toString(){
        return branchName;
    }
    
}
