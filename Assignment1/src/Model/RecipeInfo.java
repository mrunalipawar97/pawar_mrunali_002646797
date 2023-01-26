/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.File;

/**
 *
 * @author mrunalipawar
 */
public class RecipeInfo {
   
    String recipeTitle;
    int noOfServings;
    boolean glutenFreeChoice;
    double difficultyLevel;
    int noOfIngredients;
    String category;
    String description;
    File recipePicture;
    String filePath;
    
    public RecipeInfo() {
        this.recipeTitle = "";
        this.noOfServings = 0;
        this.glutenFreeChoice = false;
        this.difficultyLevel = 0.0;
        this.noOfIngredients = 0;
        this.category = "";
        this.description = "";
        this.recipePicture = new File(filePath); 
    }
    
    
    
}
