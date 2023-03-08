/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Role;

import Employees.Employee;
import Librarian.Librarian;
import LibraryAppSystem.ApplicationSystem;
import LibraryAppSystem.Branch;
import LibraryAppSystem.UserAccount;
import UI.LibrarianWorkArea.LibrarianJFrame;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author mrunalipawar
 */
public class LibrarianRole extends Role {

    public LibrarianRole() {
    }

    
    /*@Override
    public JFrame getWorkArea(ApplicationSystem applicationSystem, Branch branch, UserAccount useraccount) {
        return new LibrarianJFrame(applicationSystem,useraccount);
    }*/
    
     @Override
    public JFrame getWorkArea(ApplicationSystem applicationSystem, UserAccount useraccount) {
         Librarian lib= new Librarian();
        ArrayList<Branch> branchList = applicationSystem.getBranchLists();
        for(Branch branch: branchList){
            ArrayList<Employee> empList=branch.getLibrary().getEmployeeDirectory().getEmployeeist();
            for(Employee emp: empList){
                System.out.println(useraccount.getUsername());
                System.out.println(emp.getUsername());
                if(useraccount.getUsername().equals(emp.getUsername())){        
                  lib=branch.getLibrary();
                }
            }
        }
        return new LibrarianJFrame(applicationSystem, useraccount,lib);
    }
    
}
