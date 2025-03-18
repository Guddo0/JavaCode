package JAVA.OPPs.ClassAndObject;
class person{
    //public
    int age=22;
    int weight=56;
    String colour="Light";
    void  eat(){
        System.out.println("I am Eating..");
    }
    void sleep(){
        System.out.println("I an sleeping");
    }
    void run(){
        System.out.println("I can Run 100km");
    }
}
public class example1 {
    public static void main(String[] args) {
        person sofiyan=new person();
        System.out.println(sofiyan.age);
        System.out.println(sofiyan.colour);

        sofiyan.eat();
        sofiyan.run();
        
    }
    
}
