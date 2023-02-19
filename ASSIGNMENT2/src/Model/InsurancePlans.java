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
public class InsurancePlans {
    
    ArrayList<PlanDetails> insurancePlanList;
    
    public InsurancePlans() {
       this.insurancePlanList = new ArrayList<PlanDetails>();
       
    }

    public ArrayList<PlanDetails> getInsurancePlanList() {
        return insurancePlanList;
    }

    public void setInsurancePlanList(ArrayList<PlanDetails> insurancePlanList) {
        this.insurancePlanList = insurancePlanList;
    }

   //create insurance plans
    public PlanDetails createInsurancePlan(int planId, String name, double costPerMonth, double costPerAnnum){
        PlanDetails insurancePlanDetails = new PlanDetails();
        insurancePlanDetails.setPlanId(planId);
        insurancePlanDetails.setPlanName(name);
        insurancePlanDetails.setCostperMonth(costPerMonth);
        
        insurancePlanDetails.setCostPerAnnum(costPerAnnum);
        
        this.insurancePlanList.add(insurancePlanDetails);
        return insurancePlanDetails;
        
    }
    
    //Check if insurance plan already exists
    public boolean checkIfInsurancePlanUnique(int planID){
        
        for(PlanDetails ip: this.insurancePlanList) {
            if(ip.getPlanId() == planID){
                return false;
            }
        }
        return true;
    }
    
    //remove Insurance plan records
    public void removeInsurancePlan(int planId){
        
        for(PlanDetails plan: this.insurancePlanList){
            if(plan.getPlanId() ==  planId){
                this.insurancePlanList.remove(plan);
                break;
            }
        }
    }
    
    //check if the Insurance plan already exists
    public Boolean insurancePlanExists(int planID, String planName) {
        
        for (PlanDetails p : this.insurancePlanList) {
            if(p.getPlanId() == planID && p.getPlanName().equals(planName)){
                return true;
            }
        }
        return false;
    }
}
