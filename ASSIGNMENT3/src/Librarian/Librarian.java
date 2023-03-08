/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Librarian;


import BookAuthor.AuthorDirectory;
import BookGenre.GenreDirectory;
import Books.BooksDirectory;
import Employees.EmployeeDirectory;
import General.MagazineDirectory;
import Personnel.Profile;
import Services.RentalRequest;
import java.util.ArrayList;

/**
 *
 * @author mrunalipawar
 */
public class Librarian {
    
    private int orderCount;
     
    EmployeeDirectory employeeDirectory;
    AuthorDirectory authorDirectory;
    GenreDirectory genreDirectory;
    BooksDirectory booksDirectory;
    MagazineDirectory magazineDirectory;
    String libraryId;
    String libraryName;
    String location; 
    int buildingNo;
    private static int count = 0;
    private ArrayList<RentalRequest> customerOrderlist;
     
    ArrayList<Librarian> librarianlist;

    public Librarian() {
        super();
        this.librarianlist = new ArrayList<Librarian>();
        this.customerOrderlist = new ArrayList<RentalRequest>();
        this.employeeDirectory = new EmployeeDirectory();
        this.authorDirectory = new AuthorDirectory();
        this.genreDirectory = new GenreDirectory();
        this.booksDirectory = new BooksDirectory();
        this.magazineDirectory = new MagazineDirectory();
        this.count++;
        this.libraryId = "Library"+this.count;
     }

    public int getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }

    public ArrayList<RentalRequest> getCustomerOrderlist() {
        return customerOrderlist;
    }

    public void setCustomerOrderlist(ArrayList<RentalRequest> customerOrderlist) {
        this.customerOrderlist = customerOrderlist;
    }

    public ArrayList<Librarian> getLibrarianlist() {
        return librarianlist;
    }

    public void setLibrarianlist(ArrayList<Librarian> librarianlist) {
        this.librarianlist = librarianlist;
    }

    public int getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(int buildingNo) {
        this.buildingNo = buildingNo;
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

    public BooksDirectory getBooksDirectory() {
        return booksDirectory;
    }

    public void setBooksDirectory(BooksDirectory booksDirectory) {
        this.booksDirectory = booksDirectory;
    }

    public MagazineDirectory getMagazineDirectory() {
        return magazineDirectory;
    }

    public void setMagazineDirectory(MagazineDirectory magazineDirectory) {
        this.magazineDirectory = magazineDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public String getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(String libraryId) {
        this.libraryId = libraryId;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Librarian.count = count;
    }

    /*public Librarian createLibrarian(String name,int buildingNo) {
        Librarian l = new Librarian();
        //l.setName(name);
        l.setBuildingNo(buildingNo);
        this.librarianlist.add(l);
        return l;       
    }*/
    

}
