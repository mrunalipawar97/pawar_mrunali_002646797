/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employees;

import java.util.ArrayList;

/**
 *
 * @author mrunalipawar
 */
public class EmployeeDirectory {
    
     ArrayList<Employee> employeelist;
     
     public EmployeeDirectory() {
         this.employeelist = new ArrayList<Employee>();
     }

    public ArrayList<Employee> getEmployeeist() {
        return employeelist;
    }

    public void setEmployeeist(ArrayList<Employee> employeeist) {
        this.employeelist = employeeist;
    }

    //find Employee by its id
    public Employee findById(int id) {
        for(Employee e :  this.employeelist) {
            if(e.employeeID == id) {
                return e;
            }
        }
        return null;
    }
    
     //find Employee by its company name
    public Employee findByEmployeeName(String name) {
        for(Employee e :  this.employeelist) {
            if(e.getName().equals(name)) {
                return e;
            }
        }
        return null;
    }
    
    public Employee createEmployee(String name,String username, int empId, double experience, String designation) {
        Employee e = new Employee();
        e.setName(name);
        e.setUsername(username);
        e.setEmployeeID(empId);
        e.setExperience(experience);
        e.setDesignation(designation);
        this.employeelist.add(e);
        return e;       
    }
}
