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
import Services.RentalRequestDirectory;

/**
 *
 * @author mrunalipawar
 */
public class ApplicationSystem {
    
     private CustomerDirectory customerDirectory;
     private BooksDirectory bookDirectory;
     private Librarian librarian;
     private UserAccountDirectory userAccountDirectory;
     private RentalRequestDirectory rentalRequestDirectory;
     private AuthorDirectory authorDirectory;
     private GenreDirectory genreDirectory;
     private Branch branchCatelog;
     private EmployeeDirectory employeeDirectory;
    
    public ApplicationSystem () {
         
        this.customerDirectory = new CustomerDirectory();
        this.librarian = new Librarian();
        this.rentalRequestDirectory = new RentalRequestDirectory();
        this.userAccountDirectory = new UserAccountDirectory();
        this.bookDirectory = new BooksDirectory();
        this.authorDirectory = new AuthorDirectory();
        this.genreDirectory = new GenreDirectory();
        this.branchCatelog = new Branch();
        this.employeeDirectory = new EmployeeDirectory();
     // create a restaurant manager here
        UserAccount user = this.userAccountDirectory.createUserAccount("admin", "admin", "SYSAdmin");
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

    public RentalRequestDirectory getRentalRequestDirectory() {
        return rentalRequestDirectory;
    }

    public void setRentalRequestDirectory(RentalRequestDirectory rentalRequestDirectory) {
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

    public Branch getBranchCatelog() {
        return branchCatelog;
    }

    public void setBranchCatelog(Branch branchCatelog) {
        this.branchCatelog = branchCatelog;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }
    
    

}
