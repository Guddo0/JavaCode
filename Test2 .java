package JAVA.OPPs.MultiThreading;

class A extends Thread
{
public void run()
{
System.out.println("Task 1");
}

}
class B extends Thread
{
public void run()
{
System.out.println("Task 2");
}

}
class C extends Thread
{
public void run()
{
System.out.println("Task 3");
}

}
class Test2 
{
public static void main(String [] sofiyan)
{
A t1=new A();
t1.start();

B t2=new B();
t2.start();

C t3=new C();
t3.start();
}
}