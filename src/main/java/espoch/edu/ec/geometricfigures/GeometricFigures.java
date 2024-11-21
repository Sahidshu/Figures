/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package espoch.edu.ec.geometricfigures;

import espoch.edu.ec.geometricfigures.classes.Rectangle;


/**
 *
 * @author sahid
 */
public class GeometricFigures {

    public static void main(String[] args) {
       Rectangle objRectangle = new Rectangle();
       objRectangle.baseR=18;
       objRectangle.heightR=12; 
       
       double calArearec=objRectangle.rectangleArea();
        System.out.println(" "+"El area del rectangulo es: "+calArearec+" cm cuadrados");
       
       double recPerimeter=objRectangle.rectanglePerimeter();
        System.out.println("El perimetro del rectangulo es: "+recPerimeter+" cm");
        
       //double calcHypo=
    }
    
    
   
        
    
}
