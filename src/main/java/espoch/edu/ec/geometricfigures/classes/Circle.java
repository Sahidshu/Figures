/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espoch.edu.ec.geometricfigures.classes;

/**
 *
 * @author sahid
 */
public class Circle {
    public double radius;
    
    public double circleArea(){
        double circArea=radius*3.14159;
        return circArea;
    }
    
    public double circlePerimeter(){
        double circPer=(3.14159*2)*radius;
        return circPer;
    }
}
