package JAVA.OPPs.ClassAndObject;

public class Ceil {
    static int roll(){
        double random=Math.random()*6;
        return (int)Math.ceil(random);
    }
    public static void main(String[] args) {
       roll() ;
       for(int i=0;i<=10;i++){
        System.out.println(roll());
       }
    }
    
}
