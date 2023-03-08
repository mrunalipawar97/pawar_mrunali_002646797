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
    String materialId;
    String name;
    String registeredDate;
    String isAvailablityFlag;
    private static int count = 0;
    
    
    public Material() {
        count++;
        this.serialNumber = this.count;
        this.materialId = "Material"+this.count; 
    }
    public Material(int srNo, String name, String date, String isAvailable){
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

    public String isIsAvailablityFlag() {
        return isAvailablityFlag;
    }

    public void setIsAvailablityFlag(String isAvailablityFlag) {
        this.isAvailablityFlag = isAvailablityFlag;
    }

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Material.count = count;
    }
    
    

   
    @Override
    public String toString(){
        return String.valueOf(serialNumber);
    }

}
