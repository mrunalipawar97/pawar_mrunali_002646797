/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author mrunalipawar
 */
public class Business {
    
    ApplicantsDirectory appDirectory;
    InsurancePlans insurancePlans;
    
    public Business() {
        this.appDirectory = new ApplicantsDirectory();
        this.insurancePlans = new InsurancePlans();
    }

    public ApplicantsDirectory getAppDirectory() {
        return appDirectory;
    }

    public void setAppDirectory(ApplicantsDirectory appDirectory) {
        this.appDirectory = appDirectory;
    }

    public InsurancePlans getInsurancePlans() {
        return insurancePlans;
    }

    public void setInsurancePlans(InsurancePlans insurancePlans) {
        this.insurancePlans = insurancePlans;
    }
   
}
