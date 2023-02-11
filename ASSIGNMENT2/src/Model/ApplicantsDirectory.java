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
    
    public Applicant createApplicant(int appID, String fName, String lName, String date){
        
        Applicant applicant = new Applicant();
        
        //call the unique id method
        
        applicant.setApplicationId(appID);
        applicant.setFirstName(fName);
        applicant.setLastName(lName);
        applicant.setDate(date);
        
        //add the observation object into array list
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

    public void removeApplicant (String name){
        
        for (Applicant ap : this.applicantsDirectory) {
            if (ap.getFirstName().equals(name)) {
                this.applicantsDirectory.remove(ap);
                break;
            }
        }
    }
}
