
package espoch.edu.ec.geometricfigures.classes;
/**
 *
 * @author sahid
 */
public class Triangle {

    
    public double baseT;
    public double heightT;
   
    
    
    public double hypotenuse(){
        double calcHypo = Math.sqrt((baseT*baseT)+(heightT*heightT));
        return calcHypo;   
    }
    
    public TriangleType identifyTriangle(){
        double calcHypo=hypotenuse();
        
        if (heightT == baseT && baseT == calcHypo) {
            return TriangleType.EQUILATERAL;
        } else if (heightT == baseT || heightT == calcHypo || baseT == calcHypo) {
            return TriangleType.ISOCELES;
        } else {
            return TriangleType.SCALENE;
        }
    }
}

