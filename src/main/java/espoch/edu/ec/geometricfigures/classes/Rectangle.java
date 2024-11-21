/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espoch.edu.ec.geometricfigures.classes;

/**
 *
 * @author sahid
 */
public class Rectangle {
    public double baseR;
    public double heightR;
    
    public double rectanglePerimeter(){
        double recPerimeter=(baseR*2)+(heightR*2);
        return recPerimeter;
    }
    
    public double rectangleArea(){
        double calArearec = baseR*heightR;
        return calArearec;   
    }
    
    
}
