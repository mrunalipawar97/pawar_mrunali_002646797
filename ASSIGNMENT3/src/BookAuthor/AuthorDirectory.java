/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookAuthor;


import java.util.ArrayList;

/**
 *
 * @author mrunalipawar
 */
public class AuthorDirectory {
    
    ArrayList<Author> authorsList;
   
    
    public AuthorDirectory() {
        this.authorsList = new ArrayList<Author> ();
       
    }

    public ArrayList<Author> getAuthorsList() {
        return authorsList;
    }

    public void setAuthorsList(ArrayList<Author> authorsList) {
        this.authorsList = authorsList;
    }

    public Author createAuthor(String authorName, String authorBio) {
        Author a = new Author();
        a.setAuthorName(authorName);
        a.setAuthorBio(authorBio);
        this.authorsList.add(a);
        return a;
    }
}