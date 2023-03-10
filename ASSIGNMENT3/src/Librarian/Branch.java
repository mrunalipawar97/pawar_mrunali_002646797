/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Librarian;


import LibraryAppSystem.UserAccountDirectory;

/**
 *
 * @author mrunalipawar
 */
public class Branch {
    
    String branchName;
    Librarian librarian;
    UserAccountDirectory branchUserAccountDirectory;
    private static int count = 0;
    String branchID;

    public Branch () {
        branchUserAccountDirectory = new UserAccountDirectory();
        this.librarian = new Librarian();
        this.branchID = "Branch-Id" + this.count++;
    }
    
    /*public Branch(String branchName)  {
        this.branchName = branchName;
    }*/

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Branch.count = count;
    }

    public String getBranchID() {
        return branchID;
    }

    public void setBranchID(String branchID) {
        this.branchID = branchID;
    }

    public UserAccountDirectory getBranchUserAccountDirectory() {
        return branchUserAccountDirectory;
    }

    public void setBranchUserAccountDirectory(UserAccountDirectory branchUserAccountDirectory) {
        this.branchUserAccountDirectory = branchUserAccountDirectory;
    }

    public Librarian createLibrary(String libraryName, String location, int buildingNo) {
        Librarian l = new Librarian();
        l.setLibraryName(libraryName);
        l.setLocation(location);
        l.setBuildingNo(buildingNo);
        
        this.librarian = l;
        return l;
    }

    @Override
    public String toString(){
        return branchName;
    }
   
}
