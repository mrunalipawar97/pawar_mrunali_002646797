/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author mrunalipawar
 */
public class PetDetails {
    
    String petName;
    int age;
    String gender;
    String petType;
    String breed;
    
    Vaccine vaccineDet;
    
    public PetDetails() {
        this.vaccineDet = new Vaccine();
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Vaccine getVaccineDet() {
        return vaccineDet;
    }

    public void setVaccineDet(Vaccine vaccineDet) {
        this.vaccineDet = vaccineDet;
    }
    
}
