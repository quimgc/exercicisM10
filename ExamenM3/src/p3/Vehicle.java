/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

/**
 *
 * @author quim
 */
public class Vehicle {
    private String colorVehicle;
    private int numRodes;
    private String combustible;

    public String getColorVehicle() {
        return colorVehicle;
    }

    public int getNumRodes() {
        return numRodes;
    }

    public String getCombustible() {
        return combustible;
    }
    
    
    public Vehicle(String color, int numRodes, String c){
        this.colorVehicle = color;
        this.numRodes = numRodes;
        this.combustible = c;
    }
    
    public String toString(){
        return "colorVehicle: " + this.colorVehicle + " numRodes: "+ this.numRodes + " combustible: " + this.combustible;
    }
}
