/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espoch.edu.ec.figuressahidmunoz.classes;

/**
 *
 * @author sahid
 */
public class Triangle {
    public double baseT;
    public double heightT;
    
    public double hypotenuse(){
        double calcHypo = (baseT*baseT)+(heightT*heightT);
        return calcHypo;   
    }
}

