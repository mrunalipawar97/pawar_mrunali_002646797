/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Customer.Customer;
import Librarian.Librarian;

/**
 *
 * @author mrunalipawar
 */
public class RentalRequest {
   
   Customer customer;
   Librarian librarian;

   int ID;
   private static int count;
   Double price;
   String status;
   int duration;
   String requestId;
   
   public RentalRequest() {
        this.customer = new Customer();
        this.librarian = new Librarian();
        this.status = "Requested";
        this.count++;
        this.requestId = "ORDERED"+ this.count;
    }
    
    public RentalRequest (Customer customer, Librarian librarian) {
        this.customer = customer;
        this.librarian = librarian;
        this.status = "Requested";
        this.count++;
        this.requestId = "ORDERED"+ this.count;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        RentalRequest.count = count;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
    
     @Override
    public String toString() {
        return this.requestId;
    }
}
