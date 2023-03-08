/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

import Personnel.Profile;
import Services.MasterRentalRequestDirectory;
import Services.RentalRequest;
import java.util.ArrayList;

/**
 *
 * @author mrunalipawar
 */
public class Customer extends Profile {
    
    private int orderRequestsTotal;;
    
    MasterRentalRequestDirectory masterRentalRequestDirectory;
    
    public Customer() {
        super();
        this.masterRentalRequestDirectory = new MasterRentalRequestDirectory ();
    }

    public int getOrderRequestsTotal() {
        return orderRequestsTotal;
    }

    public void setOrderRequestsTotal(int orderRequestsTotal) {
        this.orderRequestsTotal = orderRequestsTotal;
    }

    public MasterRentalRequestDirectory getMasterRentalRequestDirectory() {
        return masterRentalRequestDirectory;
    }

    public void setMasterRentalRequestDirectory(MasterRentalRequestDirectory masterRentalRequestDirectory) {
        this.masterRentalRequestDirectory = masterRentalRequestDirectory;
    }

    public void addMaterialRequestForCustomer(RentalRequest order) {
        this.masterRentalRequestDirectory.createOrder(this,order.getMaterial(),order.getStatus(),order.getDuration(),order.getMaterialType(),order.getLibrarian());
    }
   
}
