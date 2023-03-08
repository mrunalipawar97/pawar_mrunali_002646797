/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Customer.Customer;
import Librarian.Librarian;
import Materials.Material;
import java.util.ArrayList;

/**
 *
 * @author mrunalipawar
 */
public class MasterRentalRequestDirectory {
    
     ArrayList<RentalRequest> orderlist;
    
    public MasterRentalRequestDirectory (){
        this.orderlist = new ArrayList<RentalRequest> ();
        
    }

    public ArrayList<RentalRequest> getOrderlist() {
        return orderlist;
    }

    public void setOrderlist(ArrayList<RentalRequest> orderlist) {
        this.orderlist = orderlist;
    }
    
    //Create Customer book/magazine order
    public RentalRequest createOrder(Customer customer, Material m,String status, String duration, String materialType, Librarian librarian) {
        RentalRequest r = new RentalRequest(customer);
        r.setMaterial(m);
        r.setStatus(status);
        r.setDuration(duration);
        r.setMaterialType(materialType);
        r.setLibrarian(librarian);
        this.orderlist.add(r);
        return r;
    }
    
    public RentalRequest requestOrder(Customer customer) {
        RentalRequest r = new RentalRequest();
        r.setCustomer(customer);
        this.orderlist.add(r);
        return r;
    }
    
    public RentalRequest assignOrder(RentalRequest o, Librarian lib) {
        o.setLibrarian(lib);
        return o;
    
    }
    
    public int getSalesVolume() {
        int sum = 0;
        for(RentalRequest order: orderlist){
           // sum = sum + order.get();
        }
        return sum;
    }
}
