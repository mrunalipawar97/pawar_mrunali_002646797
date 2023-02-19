/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author mrunalipawar
 */
public class Applicant {
    
    int applicationId;
    String firstName;
    String lastName;
    String date;
    
    PetDetails petDetails;
    PlanDetails planDetails;
    Vaccine vaccine;
    
    public Applicant() {
        this.petDetails = new PetDetails();
        this.planDetails = new PlanDetails();
        this.vaccine = new Vaccine();
    }

    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public PetDetails getPetDetails() {
        return petDetails;
    }

    public void setPetDetails(PetDetails petDetails) {
        this.petDetails = petDetails;
    }

    public PlanDetails getPlanDetails() {
        return planDetails;
    }

    public void setPlanDetails(PlanDetails planDetails) {
        this.planDetails = planDetails;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }
    
    @Override
    public String toString(){
        return String.valueOf(this.applicationId);
    }
}
