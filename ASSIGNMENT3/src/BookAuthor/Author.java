/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookAuthor;

/**
 *
 * @author mrunalipawar
 */
public class Author {
    
    String authorName;
    String authorBio;
    
    /*public Author() {
        
    }*/

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorBio() {
        return authorBio;
    }

    public void setAuthorBio(String authorBio) {
        this.authorBio = authorBio;
    }

    @Override
    public String toString(){
        return authorName;
    }
}
