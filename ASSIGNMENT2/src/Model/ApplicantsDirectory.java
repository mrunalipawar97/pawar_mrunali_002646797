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
public class ApplicantsDirectory {
    
    
    ArrayList<Applicant> applicantsDirectory;
    
    public ApplicantsDirectory() {
        this.applicantsDirectory = new ArrayList<Applicant> ();
    }

    public ArrayList<Applicant> getApplicantsDirectory() {
        return applicantsDirectory;
    }

    public void setApplicantsDirectory(ArrayList<Applicant> applicantsDirectory) {
        this.applicantsDirectory = applicantsDirectory;
    }
    
    public Applicant createApplicant(int appID, String fName, String lName, String date, String petName, int petAge, String gender, String petType, String breed){
        
        Applicant applicant = new Applicant();
        
        //call the unique id method
        applicant.setApplicationId(appID);
        applicant.setFirstName(fName);
        applicant.setLastName(lName);
        applicant.setDate(date);
        applicant.petDetails.setPetName(petName);
        applicant.petDetails.setAge(petAge);
        applicant.petDetails.setGender(gender);
        applicant.petDetails.setPetType(petType);
        applicant.petDetails.setBreed(breed);
        
        //add the applicant object into array list
        this.applicantsDirectory.add(applicant);
        
        return applicant;
    }
    
    public boolean checkApplicationIdUnique(int id){
        
        for(Applicant a: this.applicantsDirectory) {
            if(a.getApplicationId() == id){
                return false;
            }
        }
        return true;
    }

    public void removeApplicant(int appId){
        
        for (Applicant ap : this.applicantsDirectory) {
            if (ap.getApplicationId() == appId) {
                this.applicantsDirectory.remove(ap);
                break;
            }
        }
    }
    
    //find applicant by ID
    public Applicant findApplicantbyId(int id) {
        for(Applicant a: this.applicantsDirectory) {
            if(a.getApplicationId() == id ) {
                return a;
            }
        }
        return null;
    }
    
    //find applicant by First name
    public Applicant findApplicantbyName(String name) {
        for(Applicant a: this.applicantsDirectory) {
            if(a.getFirstName().equals(name) ) {
                return a;
            }
        }
        return null;
    }
    
    
    //check if the applicant already exists
    public Boolean applicantExists(int appId, String firstName, String lastName) {
        
        for (Applicant a : this.applicantsDirectory) {
            if(a.getApplicationId() == appId && a.getFirstName().equals(firstName) && a.getLastName().equals(lastName)){
                return true;
            }
        }
        return false;
    }

}
