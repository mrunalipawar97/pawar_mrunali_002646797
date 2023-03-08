/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BookGenre;

/**
 *
 * @author mrunalipawar
 */
public class Genre {
    
    String genreName;
    
    public Genre() {
        
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    @Override
    public String toString(){
        return genreName;
    }
}
