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
public class Moto extends Vehicle{
    
    private String colorCasc;

    public Moto(String color, int numRodes, String c, String colorCasc) {
        super(color, numRodes, c);
        this.colorCasc = colorCasc;
    }
    
   @Override
     public String toString(){
        return "colorVehicle: " + this.getColorVehicle() + " numRodes: "+ this.getNumRodes() + " combustible: " + this.getCombustible() + " colorCasc: " + this.colorCasc;
    }
    
}
