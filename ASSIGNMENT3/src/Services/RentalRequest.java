/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Customer.Customer;
import Librarian.Librarian;
import Materials.Material;

/**
 *
 * @author mrunalipawar
 */
public class RentalRequest {
   
   Customer customer;
   Librarian librarian;
   Material material;
   private static int count = 0;
   double orderTotal;
   double price;
   String status;
   String duration;
   String materialType;
   String requestId;

   public RentalRequest() {
        this.customer = new Customer();
        this.librarian = new Librarian();
        this.material = new Material();
        this.status = "Requested";
        this.count++;
        this.price = 0;
        this.requestId = "ORDERED"+ this.count;
    }
   
    
    public RentalRequest(Customer customer) {
        this.customer = customer;
        this.librarian = new Librarian();
        this.status = "Requested";
        this.material= new Material();
        this.count++;
        this.price= 0;
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

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        RentalRequest.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(double orderTotal) {
        this.orderTotal = orderTotal;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    @Override
    public String toString() {
        return this.requestId;
    }
    
    public void CancelOrder() {
         status = "Cancelled";
    }
   
}
