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
    
     ArrayList<Author> authorDirectory;
    
    public AuthorDirectory() {
        this.authorDirectory = new ArrayList<Author> ();
    }

    public ArrayList<Author> getAuthorDirectory() {
        return authorDirectory;
    }

    public void setAuthorDirectory(ArrayList<Author> authorDirectory) {
        this.authorDirectory = authorDirectory;
    }
    
    public Author createAuthor(String name) {
        Author a = new Author();
        a.setName(name);
        this.authorDirectory.add(a);
        return a;
    }
}
