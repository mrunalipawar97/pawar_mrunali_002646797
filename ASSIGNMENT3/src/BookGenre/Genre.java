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
    
    String name;
    
    public Genre() {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
      @Override
    public String toString(){
        return name;
    }
}
