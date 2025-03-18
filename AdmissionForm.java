package JAVA.OPPs.ClassAndObject;
//package JAVA.OPPs.Class&Object;
import java.util.Scanner;
class AdmissionTemplate{
    String name;
    String fname;
    int age;
    public
    void fillTheForm(){
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        name=obj.nextLine();

        System.out.print("Enter Your Father Name: ");
        fname=obj.nextLine();

        System.out.print("Enter Your Age: ");
        age=obj.nextInt();
    }
    void display(){
        System.out.println("Your Name is: "+name);
        System.out.println("Your Father Name is: "+fname);
        System.out.println("Your Age is: "+age);
    }
}
public class AdmissionForm {
    public static void main(String[] args) {
        AdmissionTemplate sofiyan=new AdmissionTemplate();
        sofiyan.fillTheForm();
        sofiyan.display();
        System.out.println();
    }
    
}
