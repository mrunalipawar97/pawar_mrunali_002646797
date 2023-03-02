/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibraryAppSystem;

import BookAuthor.AuthorDirectory;
import BookGenre.GenreDirectory;
import Books.BooksDirectory;
import Customer.CustomerDirectory;
import Employees.EmployeeDirectory;
import Librarian.Librarian;
import Magazines.MagazineDirectory;
import Role.AdminRole;
import Services.MasterRentalRequestDirectory;
import java.util.ArrayList;

/**
 *
 * @author mrunalipawar
 */
public class ApplicationSystem {
    
     private CustomerDirectory customerDirectory;
     private BooksDirectory bookDirectory;
     private Librarian librarian;
     private UserAccountDirectory userAccountDirectory;
     private MasterRentalRequestDirectory rentalRequestDirectory;
     private AuthorDirectory authorDirectory;
     private GenreDirectory genreDirectory;
     ArrayList<Branch> branchLists;
     private EmployeeDirectory employeeDirectory;
     private MagazineDirectory magazineDirectory;
    
    public ApplicationSystem () {
         
        this.customerDirectory = new CustomerDirectory();
        this.librarian = new Librarian();
        this.rentalRequestDirectory = new MasterRentalRequestDirectory();
        this.userAccountDirectory = new UserAccountDirectory();
        this.bookDirectory = new BooksDirectory();
        this.authorDirectory = new AuthorDirectory();
        this.genreDirectory = new GenreDirectory();
        this.employeeDirectory = new EmployeeDirectory();
        this.branchLists = new ArrayList<Branch>();
        this.magazineDirectory = new MagazineDirectory();
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

    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
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

    public BooksDirectory getBookDirectory() {
        return bookDirectory;
    }

    public void setBookDirectory(BooksDirectory bookDirectory) {
        this.bookDirectory = bookDirectory;
    }

    public AuthorDirectory getAuthorDirectory() {
        return authorDirectory;
    }

    public void setAuthorDirectory(AuthorDirectory authorDirectory) {
        this.authorDirectory = authorDirectory;
    }

    public GenreDirectory getGenreDirectory() {
        return genreDirectory;
    }

    public void setGenreDirectory(GenreDirectory genreDirectory) {
        this.genreDirectory = genreDirectory;
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

    public MagazineDirectory getMagazineDirectory() {
        return magazineDirectory;
    }

    public void setMagazineDirectory(MagazineDirectory magazineDirectory) {
        this.magazineDirectory = magazineDirectory;
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
        Branch branch = new Branch(name);
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
     
    public static ApplicationSystem getInstance() {
        return new ApplicationSystem();
    }
}
