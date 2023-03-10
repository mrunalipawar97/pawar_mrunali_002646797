/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookGenre;


import Librarian.Librarian;
import java.util.ArrayList;

/**
 *
 * @author mrunalipawar
 */
public class GenreDirectory {
    
    ArrayList<Genre> GenreLists;
    
    
    public GenreDirectory() {
        this.GenreLists = new ArrayList<Genre> ();
    }

    public ArrayList<Genre> getGenreLists() {
        return GenreLists;
    }

    public void setGenreLists(ArrayList<Genre> GenreLists) {
        this.GenreLists = GenreLists;
    }

    public Genre createGenre(String name) {
        Genre a = new Genre();
        a.setGenreName(name);
        this.GenreLists.add(a);
        return a;
    }
}