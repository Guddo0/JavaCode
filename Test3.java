package JAVA.OPPs.MultiThreading;

class A extends Thread
{
public void run()
{
try
{
for(int i=0;i<=5;i++)
{
System.out.println("Sofiyan");
Thread.sleep(1000);
}
}
catch(InterruptedException e1)
{

}

}

}

class Test3
{
public static void main(String[] sofiyan) throws  InterruptedException
{
A thread1=new A();
thread1.start();

for(int i=0;i<=5;i++)
{
System.out.println("Suhana");
Thread.sleep(1000);
}
}
}
