/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookGenre;


import java.util.ArrayList;

/**
 *
 * @author mrunalipawar
 */
public class GenreDirectory {
    
    ArrayList<Genre> GenreDirectory;
    
    public GenreDirectory() {
        this.GenreDirectory = new ArrayList<Genre> ();
    }

    public ArrayList<Genre> getGenreDirectory() {
        return GenreDirectory;
    }

    public void setGenreDirectory(ArrayList<Genre> GenreDirectory) {
        this.GenreDirectory = GenreDirectory;
    }

    public Genre createGenre(String name) {
        Genre a = new Genre();
        a.setName(name);
        this.GenreDirectory.add(a);
        return a;
    }
}
