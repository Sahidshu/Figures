
package espoch.edu.ec.geometricfigures.classes;


public class Square{
    public double sideLength;
    
    public double squareArea(){
        double areaSq=(sideLength*sideLength);
        return areaSq;
}
    public double squarePerimeter(){
        double perSq=(sideLength*4);
        return perSq;
    }
    
}
