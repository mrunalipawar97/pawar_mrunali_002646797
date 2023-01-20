/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Model;

/**
 *
 * @author mrunalipawar
 */
public class HelloWorld {

    /**
     * initialization of the different primitive data types and array
     * data types – (int, double, float, string, Boolean, char) 
     * integer array of size 7
     */
    
    int mruni = 97970;
    double mrund = 9.70;
    float mrunf = 0.9790f;
    String mruns = "Cyber and Intelligence Solutions";
    boolean mrunb = true;
    char mrunc = 'm';
    int[] mrunarr = new int[7];

    public static void main(String[] args) {
       
        HelloWorld hobj = new HelloWorld();     // creating class object
        System.out.println("--------------Program Execution Output--------------------");
        System.out.println("integer variable value : " + hobj.mruni);
        System.out.println("double variable value : " + hobj.mrund);
        System.out.println("float variable value : " + hobj.mrunf);
        System.out.println("String variable value : " + hobj.mruns);
        System.out.println("boolean variable value : " + hobj.mrunb);
        System.out.println("char variable value : " + hobj.mrunc);
        System.out.println("Integer array values : ");
        for (int p = 0; p < hobj.mrunarr.length; p++) {
            hobj.mrunarr[p] = p + 97;
            System.out.println("p[" + p + "]=" + hobj.mrunarr[p]);
        }
    }

}
