package JAVA.OPPs.Threading;

class Process1 extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("process 1: "+i);
        }
    }
}
class Process2 extends Thread{
   public  void run(){
        for(int i=0;i<=10;i++){
            System.out.println("process 2: "+i);
        }
    }
}
public class exampl2 {
    public static void main(String[] args) {
        Process1 obj=new Process1();
        Process2 obj2=new Process2();
        
        obj.start();
        obj2.start();
    }
    
}
