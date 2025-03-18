package JAVA.OPPs.ClassAndObject;

public class Circle {
    double radiusInMm;
    Circle(double radiusInMm){
        this.radiusInMm=radiusInMm;
    
    }
    double cicleCumFerence(){
        return 2*radiusInMm*Math.PI;
    }
    double area(){
        return 2*radiusInMm*Math.pow(radiusInMm, 2);
    }
    public static void main(String[] args) {
        
    }
    
}
