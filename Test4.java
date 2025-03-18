package JAVA.OPPs.MultiThreading;

class A implements Runnable
{
public void run()
{
for(int i=0;i<=5;i++)
{
System.out.println("My Child Thread");
}

}

}

class Test4
{
public static void main(String[] sofiyan)
{
A thread1=new A();

Thread t1=new Thread(thread1);
t1.start();
}
}
