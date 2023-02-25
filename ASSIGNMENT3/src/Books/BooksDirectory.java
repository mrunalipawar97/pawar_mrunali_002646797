/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Books;

import BookAuthor.Author;
import BookGenre.Genre;
import java.util.ArrayList;

/**
 *
 * @author mrunalipawar
 */
public class BooksDirectory {
    
    ArrayList<Book> booklists;
    
    
    public BooksDirectory() {
        this.booklists = new ArrayList<Book> ();
    }

    public ArrayList<Book> getBooklists() {
        return booklists;
    }

    public void setBooklists(ArrayList<Book> booklists) {
        this.booklists = booklists;
    }

    
    //find Book by its id
    public Book findById(int id) {
        for(Book b :  this.booklists) {
            if(b.getSerialNumber() == id) {
                return b;
            }
        }
        return null;
    }
    
     //find Book by its company name
    public Book findByBookName(String name) {
        for(Book m :  this.booklists) {
            if(m.getName().equals(name)) {
                return m;
            }
        }
        return null;
    }
    
    public Book createBook(int serialNo, String name, String date, boolean isAvaialable, int noOfPages, String language, String typeOfBind, Author author, Genre genre) {
        Book b = new Book();
        b.setSerialNumber(serialNo);
        b.setName(name);
        b.setRegisteredDate(date);
        b.setIsAvailablityFlag(isAvaialable);
        b.setNoOfPages(noOfPages);
        b.setLanguage(language);
        b.setTypeOfBinding(typeOfBind);
        b.setAuthor(author);
        b.setGenre(genre);
                
        this.booklists.add(b);
        return b;       
    }
   
}
