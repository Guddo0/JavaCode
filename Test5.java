package JAVA.OPPs.MultiThreading;

class Process1 implements Runnable

{
public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println("Process1:"+i);
}

}

}
class Process2 implements Runnable
{
public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println("Process2:"+i);
}

}

}
class Test5
{
public static void main(String[] sofiyan)
{
Process1 p1=new Process1();
Process2 p2=new Process2();
Thread t1=new Thread(p1);
Thread t2=new Thread(p2);
t1.start();
t2.start();

}
}
