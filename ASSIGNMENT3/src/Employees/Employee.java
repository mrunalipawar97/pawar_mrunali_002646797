/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employees;

import Personnel.Profile;

/**
 *
 * @author mrunalipawar
 */
public class Employee extends Profile {
    
    int employeeID;
    double experience;
    String designation;
    String username;
    
    public Employee() {
        super();
    }
    
    public Employee(int empId, double experience,String designation) {
        this.employeeID = empId;
        this.experience = experience;
        this.designation = designation;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    @Override
    public String toString() {
        return String.valueOf(employeeID);
    }
    
}
