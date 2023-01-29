/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

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

    public RecipeInfo() {
        this.recipeTitle = "";
        this.noOfServings = 0;
        this.glutenFreeChoice = false;
        this.difficultyLevel = 0.0;
        this.noOfIngredients = 0;
        this.category = "";
        this.description = "";
    }

    public String getRecipeTitle() {
        return recipeTitle;
    }

    public void setRecipeTitle(String recipeTitle) {
        this.recipeTitle = recipeTitle;
    }

    public int getNoOfServings() {
        return noOfServings;
    }

    public void setNoOfServings(int noOfServings) {
        this.noOfServings = noOfServings;
    }

    public boolean isGlutenFreeChoice() {
        return glutenFreeChoice;
    }

    public void setGlutenFreeChoice(boolean glutenFreeChoice) {
        this.glutenFreeChoice = glutenFreeChoice;
    }

    public double getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(double difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public int getNoOfIngredients() {
        return noOfIngredients;
    }

    public void setNoOfIngredients(int noOfIngredients) {
        this.noOfIngredients = noOfIngredients;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
