/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryAppSystem;

import Librarian.Librarian;

/**
 *
 * @author mrunalipawar
 */
public class Branch {
    
    String branchName;
    Librarian library;
    UserAccountDirectory branchuseraccountDirectory;

    public Branch(String branchName)  {
        library = new Librarian();
        this.branchName = branchName;
        branchuseraccountDirectory = new UserAccountDirectory();
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

    public UserAccountDirectory getBranchuseraccountDirectory() {
        return branchuseraccountDirectory;
    }

    public void setBranchuseraccountDirectory(UserAccountDirectory branchuseraccountDirectory) {
        this.branchuseraccountDirectory = branchuseraccountDirectory;
    }

    @Override
    public String toString(){
        return branchName;
    }
   
}
