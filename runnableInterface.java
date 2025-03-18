package JAVA.OPPs.MultiThreading;

class runnableInterface implements Runnable
{
public void run()
{
System.out.println("Thread Task 2");
}

public static void main(String[] sofiyan)
{
runnableInterface r1=new runnableInterface();
Thread th=new Thread(r1);
th.start();
}
}
