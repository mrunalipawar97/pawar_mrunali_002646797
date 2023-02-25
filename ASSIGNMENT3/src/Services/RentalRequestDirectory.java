/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Customer.Customer;
import Librarian.Librarian;
import java.util.ArrayList;

/**
 *
 * @author mrunalipawar
 */
public class RentalRequestDirectory {
    
     ArrayList<RentalRequest> orderlist;
    
    public RentalRequestDirectory (){
        this.orderlist = new ArrayList<RentalRequest> ();
        
    }

    public ArrayList<RentalRequest> getOrderlist() {
        return orderlist;
    }

    public void setOrderlist(ArrayList<RentalRequest> orderlist) {
        this.orderlist = orderlist;
    }
    
    public RentalRequest createOrder(Customer customer, Librarian RentalRequest) {
        RentalRequest r = new RentalRequest(customer, RentalRequest);
        this.orderlist.add(r);
        return r;
    }
    
    public RentalRequest requestOrder(Customer customer) {
        RentalRequest o = new RentalRequest();
        o.setCustomer(customer);
        this.orderlist.add(o);
        return o;
    }
    
    public RentalRequest assignOrder(RentalRequest o, Librarian lib) {
        o.setLibrarian(lib);
        return o;
    }
}
