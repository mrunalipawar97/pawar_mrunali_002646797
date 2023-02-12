/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


/**
 *
 * @author mrunalipawar
 */
public class PlanDetails {
    
    int planId;
    String planName;
    double costperMonth;
    double costPerAnnum;
    
    PetDetails petDetails;
    
    public PlanDetails() {
        this.petDetails = new PetDetails();
    }

    public int getPlanId() {
        return planId;
    }

    public void setPlanId(int planId) {
        this.planId = planId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public double getCostperMonth() {
        return costperMonth;
    }

    public void setCostperMonth(double costperMonth) {
        this.costperMonth = costperMonth;
    }

    public double getCostPerAnnum() {
        return costPerAnnum;
    }

    public void setCostPerAnnum(double costPerAnnum) {
        this.costPerAnnum = costPerAnnum;
    }

    public PetDetails getPetDetails() {
        return petDetails;
    }

    public void setPetDetails(PetDetails petDetails) {
        this.petDetails = petDetails;
    }
    
    @Override
    public String toString(){
        return String.valueOf(this.planId);
    }
}
