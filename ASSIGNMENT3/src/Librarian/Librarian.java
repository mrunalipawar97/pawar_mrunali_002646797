/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Librarian;

import Personnel.Person;
import Services.RentalRequest;
import java.util.ArrayList;

/**
 *
 * @author mrunalipawar
 */
public class Librarian extends Person{
    
     private int orderCount;
     
     int buildingNo;
     
     private ArrayList<RentalRequest> customerOrderlist;
     
     ArrayList<Librarian> librarianlist;
     
     
     public Librarian() {
        super();
        this.librarianlist = new ArrayList<Librarian>();
        this.customerOrderlist = new ArrayList<RentalRequest>();
     }

    public int getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(int orderCount) {
        this.orderCount = orderCount;
    }

    public ArrayList<RentalRequest> getCustomerOrderlist() {
        return customerOrderlist;
    }

    public void setCustomerOrderlist(ArrayList<RentalRequest> customerOrderlist) {
        this.customerOrderlist = customerOrderlist;
    }

    public ArrayList<Librarian> getLibrarianlist() {
        return librarianlist;
    }

    public void setLibrarianlist(ArrayList<Librarian> librarianlist) {
        this.librarianlist = librarianlist;
    }

    public int getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(int buildingNo) {
        this.buildingNo = buildingNo;
    }

    public Librarian createLibrarian(String id, String name, String age, int buildingNo) {
        Librarian c = new Librarian();
        c.setPersonId(id);
        c.setName(name);
        c.setAge(age);
        c.setBuildingNo(buildingNo);
        
        this.librarianlist.add(c);
        return c;       
    }

}
