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
import UI.BranchWorkArea.BranchManagerJFrame;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author mrunalipawar
 */
public class BranchManagerRole extends Role {

    public BranchManagerRole() {
    }

    
    @Override
    public JFrame getWorkArea(ApplicationSystem applicationSystem, Branch branch, UserAccount useraccount) {
        return new BranchManagerJFrame(applicationSystem, branch ,useraccount);
    }
    
    /*@Override
    public JFrame getWorkArea(ApplicationSystem applicationSystem,Branch branch, UserAccount userAccount) {
        Librarian librarian = new Librarian();
        ArrayList<Branch> branchList = applicationSystem.getBranchLists();
        for( Branch b : branchList){
            ArrayList<Employee> empList=branch.getLibrary().getEmployeeDirectory().getEmployeeist();
            for(Employee emp: empList){
                System.out.println(userAccount.getUsername());
                System.out.println(emp.getUsername());
                if(userAccount.getUsername().equals(emp.getUsername())){        
                  librarian=branch.getLibrary();
                }
            }
        }
        return new BranchManagerJFrame(applicationSystem, branch, librarian, userAccount);
    }*/
    
}
