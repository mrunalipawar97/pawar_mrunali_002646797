/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author mrunalipawar
 */
public class VaccineDetails {
    
    String vaccineName;
    boolean vaccineCompleted;
    
    public VaccineDetails(){
        
    }

    public String getVaccinename() {
        return vaccineName;
    }

    public void setVaccinename(String vaccinename) {
        this.vaccineName = vaccinename;
    }

    public boolean isVaccineCompleted() {
        return vaccineCompleted;
    }

    public void setVaccineCompleted(boolean vaccineCompleted) {
        this.vaccineCompleted = vaccineCompleted;
    }

}
