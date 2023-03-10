/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Books;

import BookAuthor.Author;
import BookGenre.Genre;
import Materials.Material;

/**
 *
 * @author mrunalipawar
 */
public class Book extends Material {
    
    int noOfPages;
    String language;
    String typeOfBinding;
    private Author author;
    private Genre genre;

    public Book() {
        super();
        author = new Author();
        genre = new Genre();
    }

    /*public Book(int noOfPages, String language, String typeOfBind, Author author, Genre genre) {
       this.noOfPages = noOfPages;
       this.language = language;
       this.typeOfBinding = typeOfBind;
       this.author = author;
       this.genre = genre;
    }*/
    
    
    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTypeOfBinding() {
        return typeOfBinding;
    }

    public void setTypeOfBinding(String typeOfBinding) {
        this.typeOfBinding = typeOfBinding;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString(){
        return String.valueOf(noOfPages);
    }
}
