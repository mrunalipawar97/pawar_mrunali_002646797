/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

import Personnel.Person;
import Services.RentalRequest;
import java.util.ArrayList;

/**
 *
 * @author mrunalipawar
 */
public class Customer extends Person {
    
    private int ordersTotal;
    
    private ArrayList<RentalRequest> customerRequestlist;
    
    public Customer() {
        super();
        this.customerRequestlist = new ArrayList<RentalRequest> ();
    }

    public int getOrdersTotal() {
        return ordersTotal;
    }

    public void setOrdersTotal(int ordersTotal) {
        this.ordersTotal = ordersTotal;
    }

    public ArrayList<RentalRequest> getCustomerOrderlist() {
        return customerRequestlist;
    }

    public void setCustomerOrderlist(ArrayList<RentalRequest> customerOrderlist) {
        this.customerRequestlist = customerOrderlist;
    }

    public void addCustomerRequest (RentalRequest order) {
        this.customerRequestlist.add(order);
    }
}
