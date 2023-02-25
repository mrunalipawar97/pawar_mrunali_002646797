/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employees;

import Personnel.Person;

/**
 *
 * @author mrunalipawar
 */
public class Employee extends Person {
    
    int employeeID;
    double experience;
    String designation;
    
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
    
    @Override
    public String toString() {
        return String.valueOf(employeeID);
    }
    
}
