/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Magazines;

import Materials.Material;

/**
 *
 * @author mrunalipawar
 */
public class Magazine extends Material{
    
    String companyName;
    String issueType;
    
    public Magazine() {
         super();
    }
    
    public Magazine(String companyName, String issueType) {
        this.companyName = companyName;
        this.issueType = issueType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }
   
}
