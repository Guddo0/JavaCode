package JAVA.OPPs.Threading;
class Process1 implements Runnable{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("process 1: "+i);
        }
    }
}
class Process2 implements Runnable{
   public  void run(){
        for(int i=0;i<=10;i++){
            System.out.println("process 2: "+i);
        }
    }
}
public class MultiThre {
    public static void main(String[] args) {
        Process1 obj=new Process1();
        Process2 obj2=new Process2();
        Thread t1= new Thread(obj);
        Thread t2= new Thread(obj2);
        t1.start();
        t2.start();

    }
    
}
