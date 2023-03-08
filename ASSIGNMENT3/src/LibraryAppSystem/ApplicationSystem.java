/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryAppSystem;

import Customer.CustomerDirectory;
import Employees.EmployeeDirectory;

import Role.AdminRole;
import Services.MasterRentalRequestDirectory;
import java.util.ArrayList;

/**
 *
 * @author mrunalipawar
 */
public class ApplicationSystem {
    
     private CustomerDirectory customerDirectory;
     private UserAccountDirectory userAccountDirectory;
     private MasterRentalRequestDirectory rentalRequestDirectory;
     ArrayList<Branch> branchLists;
     private EmployeeDirectory employeeDirectory;
     
    
    public ApplicationSystem () {
        this.branchLists = new ArrayList<Branch>();
        this.customerDirectory = new CustomerDirectory();
        this.rentalRequestDirectory = new MasterRentalRequestDirectory();
        this.userAccountDirectory = new UserAccountDirectory();
        this.employeeDirectory = new EmployeeDirectory();
       
     // create a restaurant manager here
        UserAccount user = this.userAccountDirectory.createUserAccount("admin", "admin", new AdminRole());
    }
    
    public static ApplicationSystem getBusinessInstance() {
        
        return new ApplicationSystem();
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory useraccountDirectory) {
        this.userAccountDirectory = useraccountDirectory;
    }

    public MasterRentalRequestDirectory getRentalRequestDirectory() {
        return rentalRequestDirectory;
    }

    public void setRentalRequestDirectory(MasterRentalRequestDirectory rentalRequestDirectory) {
        this.rentalRequestDirectory = rentalRequestDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public ArrayList<Branch> getBranchLists() {
        return branchLists;
    }

    public void setBranchLists(ArrayList<Branch> branchLists) {
        this.branchLists = branchLists;
    }

    public Branch findbyBranchName(String name) {
        for(Branch b: this.branchLists) {
            if(b.getBranchName().equals(name)) {
                return b;
            }
        }
        return null;
    }
    
     public Branch createBranch(String name) {
        Branch branch = new Branch();
        branch.setBranchName(name);
        this.branchLists.add(branch);
        return branch;
    }
    
    public void removeBranch(String branchName){

         for (Branch b : this.branchLists) {
             if (b.getBranchName().equals(branchName)) {
                 this.branchLists.remove(b);
                 break;
             }
         }
     }  

    public Boolean branchExists(String branchName) {
        for(Branch b: this.branchLists) {
            if(b.getBranchName().equals(branchName)) {
                return true;
            }
        }
        return false;
    }
     
    public static ApplicationSystem getInstance() {
        return new ApplicationSystem();
    }
}
