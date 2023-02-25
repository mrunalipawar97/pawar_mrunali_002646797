/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Materials;


/**
 *
 * @author mrunalipawar
 */
public class Material {
    
    int serialNumber;
    String name;
    String registeredDate;
    boolean isAvailablityFlag;
    
    public Material() {
        
    }
    public Material(int srNo, String name, String date, boolean isAvailable){
        this.serialNumber = srNo;
        this.name = name;
        this.registeredDate = date;
        this.isAvailablityFlag = isAvailable;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(String registeredDate) {
        this.registeredDate = registeredDate;
    }

    public boolean isIsAvailablityFlag() {
        return isAvailablityFlag;
    }

    public void setIsAvailablityFlag(boolean isAvailablityFlag) {
        this.isAvailablityFlag = isAvailablityFlag;
    }
    
    @Override
    public String toString(){
        return String.valueOf(serialNumber);
    }

}
