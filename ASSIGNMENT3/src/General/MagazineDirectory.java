/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package General;

import java.util.ArrayList;

/**
 *
 * @author mrunalipawar
 */
public class MagazineDirectory {
    
    ArrayList<Magazine> magazinelist;
    
    public MagazineDirectory () {
        this.magazinelist = new ArrayList<Magazine>();
    }

    public ArrayList<Magazine> getMagazinelist() {
        return magazinelist;
    }

    public void setMagazinelist(ArrayList<Magazine> magazinelist) {
        this.magazinelist = magazinelist;
    }
   
    //find magazine by its id
    public Magazine findById(int id) {
        for(Magazine m :  this.magazinelist) {
            if(m.getSerialNumber() == id) {
                return m;
            }
        }
        return null;
    }
    
     //find magazine by its company name
    public Magazine findByComapnyName(String name) {
        for(Magazine m :  this.magazinelist) {
            if(m.getCompanyName().equals(name)) {
                return m;
            }
        }
        return null;
    }
    
    public Magazine createMagazine(int serialNo, String name, String date, String isAvaialable, String CompanyName, String issueType) {
        Magazine m = new Magazine();
        m.setSerialNumber(serialNo);
        m.setName(name);
        m.setRegisteredDate(date);
        m.setIsAvailablityFlag(isAvaialable);
        m.setCompanyName(CompanyName);
        m.setIssueType(issueType);
                
        this.magazinelist.add(m);
        return m;       
    }
  
}
