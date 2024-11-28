
package espoch.edu.ec.geometricfigures;

import espoch.edu.ec.geometricfigures.classes.Circle;
import espoch.edu.ec.geometricfigures.classes.Rectangle;
import espoch.edu.ec.geometricfigures.classes.Square;
import espoch.edu.ec.geometricfigures.classes.Triangle;
import espoch.edu.ec.geometricfigures.classes.TriangleType;



public class GeometricFigures {
    
    public static void main(String[] args) {
        
//CALCULO DE EL AREA Y EL PERIMETRO DE UN RECTANGULO
        
       Rectangle objRectangle = new Rectangle();
       objRectangle.baseR=18;
       objRectangle.heightR=12; 
       
       double calArearec=objRectangle.rectangleArea();
        System.out.println("El area del rectangulo es: "+calArearec+" cm cuadrados");
       
       double recPerimeter=objRectangle.rectanglePerimeter();
        System.out.println("El perimetro del rectangulo es: "+recPerimeter+" cm");
        
        System.out.println("");

//CALCULO DE LA HIPOTENUS DE UN TRIANGULO

       Triangle objTriangle=new Triangle();
       objTriangle.baseT=10;
       objTriangle.heightT=20;
                
        double calcHypo=objTriangle.hypotenuse();
        System.out.println("La hipotenusa del triangulo es: "+calcHypo+" cm");
        
        double triArea=objTriangle.triangleArea();
        System.out.println("El area del triangulo es: "+triArea);
        
        double triPer=objTriangle.trianglePerimeter();
        System.out.println("El perimetro del triangulo es: "+triPer);
        
        TriangleType type = objTriangle.identifyTriangle();
        System.out.println("El tipo de triangulo es: " + type);
        
        System.out.println("IMPORTANTE: DEBIDO A QUE EL TERCER LADO ES LA HIPOTENUSA, ESTAMOS TRABAJANDO CON TRIANGULOS RECTANGULOS");
        System.out.println("POR LO QUE NO PUEDEN EXISTIR TRIANGULOS EQUILATEROS");
        
        System.out.println("");
        
//AREA Y PERIMETRO DE UN CUADRADO
        
       Square objSquare=new Square();
       objSquare.sideLength=10;
       
       double areaSq=objSquare.squareArea();
        System.out.println("El area del cuadrado es: "+areaSq);
        
       double perSq=objSquare.squarePerimeter();
        System.out.println("El perimetro del cuadrado es: "+perSq);
        
        System.out.println("");
        
//AREA Y PERIMETRO DE UN CIRCULO

       Circle objCircle=new Circle();
       objCircle.radius=7;
        
       double circArea=objCircle.circleArea();
        System.out.println("El area del circulo es: "+circArea);
         
       double circPer=objCircle.circlePerimeter();
         System.out.println("El perimetro del circulo es: "+circPer);
         
      
        
        
        
    }
    

    
  
    

       
      
        
       
     
    
   
        
    
}
