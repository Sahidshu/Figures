
package espoch.edu.ec.geometricfigures.classes;


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
