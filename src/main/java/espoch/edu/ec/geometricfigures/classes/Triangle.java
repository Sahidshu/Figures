
package espoch.edu.ec.geometricfigures.classes;
/**
 *
 * @author sahid
 */
public class Triangle {

    
    public double baseT;
    public double heightT;
   
    
    public double triangleArea(){
        double triArea=(baseT*heightT)/2;
        return triArea;
    }
    
    
    public double hypotenuse(){
        double calcHypo = Math.sqrt((baseT*baseT)+(heightT*heightT));
        return calcHypo;   
    }
    
    public double trianglePerimeter(){
        double triPer=baseT+heightT+hypotenuse();
        return triPer;
    }
    
    public TriangleType identifyTriangle(){
        double calcHypo=hypotenuse();
        
     
        if (baseT == heightT && baseT == calcHypo) {
            return TriangleType.EQUILATERAL;
        } else if (baseT == heightT || baseT == calcHypo || heightT == calcHypo) {
            return TriangleType.ISOSCELES;
        } else {
            return TriangleType.SCALENE;
        }
    }
}

