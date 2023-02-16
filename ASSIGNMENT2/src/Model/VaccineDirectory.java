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
public class VaccineDirectory {
    
     ArrayList<Vaccine> vaccinelists;
     
     public VaccineDirectory() {
        vaccinelists = new ArrayList<Vaccine> ();
     }

    public ArrayList<Vaccine> getVaccinelists() {
        return vaccinelists;
    }

    public void setVaccinelists(ArrayList<Vaccine> vaccinelists) {
        this.vaccinelists = vaccinelists;
    }
     
     //create vaccine
    public Vaccine createVaccine(String vaccineName, String courseCompleted) {
        Vaccine vaccineDetails = new Vaccine();
        vaccineDetails.setVaccineName(vaccineName);
        vaccineDetails.setVaccineCompleted(courseCompleted);
        
        this.vaccinelists.add(vaccineDetails);
        return vaccineDetails;
        
    }
    
     //Check if vaccine already exists
    public boolean checkIfVaccineUnique(String vaccineName){
        
        for(Vaccine vd: this.vaccinelists) {
            if(vd.getVaccineName().equals(vaccineName)){
                return false;
            }
        }
        return true;
    }
}
