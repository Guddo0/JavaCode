package JAVA.OPPs.ClassAndObject;

public class Car {
    int noOfWheels;

    int noOfDoors;

    int maxSpeed;

    String carName;

    String modelName;

    String comapny;
    public Car(int noOfWheels,int noOfDoors,int maxSpeed,String carName,String modelName,String comapny){
        this.noOfWheels=noOfWheels;
        this.noOfDoors=noOfDoors;
        this.maxSpeed=maxSpeed;
        this.carName=carName;
        this.modelName=modelName;
        this.comapny=comapny;
    }
    public static void main(String[] args) {
        Car swift=new Car(4, 5, 120, "swift", "sw896", "Maruti");
        swift.toString();
        System.out.println(swift.toString());
    }

    
}
