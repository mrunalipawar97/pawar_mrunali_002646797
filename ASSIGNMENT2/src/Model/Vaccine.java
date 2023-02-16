/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author mrunalipawar
 */
public class Vaccine {
    
    String vaccineName;
    String vaccineCompleted;
    
    public Vaccine(){
       
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public String getVaccineCompleted() {
        return vaccineCompleted;
    }

    public void setVaccineCompleted(String vaccineCompleted) {
        this.vaccineCompleted = vaccineCompleted;
    }
    
    @Override
    public String toString(){
        return vaccineName;
    }
}
