package JAVA.OPPs.ClassAndObject;
class Student{
    int age;
    String name;
    String rollNo;
    String house;
    Student(int age,String name,String rollNo,String house){
        this.age=age;
        this.name=name;
        this.rollNo=rollNo;
        this.house=house;
    }
    public String toString(){
        
    }
}
public class toStringMe {
    public static void main(String[] args) {
        Student input=new Student(22, "Sofiyan", "73", "sitama");
        
    }
    
}
