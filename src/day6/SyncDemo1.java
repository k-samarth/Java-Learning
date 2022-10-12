package day6;

class TwoStrings
{
	static synchronized void print(String str1, String str2)
	{
		System.out.print(str1+" "+Thread.currentThread().getName());
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException ie)
		{
		}
		System.out.println(str2+" "+Thread.currentThread().getName());
	}
	
	static synchronized void print1(String str1, String str2)
	{
		System.out.print(str2+" "+Thread.currentThread().getName());
		try
		{
			Thread.sleep(1000);
		}
		catch (InterruptedException ie)
		{
		}
		System.out.println(str1+" "+Thread.currentThread().getName());
	}
}
class PrintStringsThread implements Runnable
{
	Thread thread;
	String str1, str2;
	PrintStringsThread(String str1, String str2)
	{
		this.str1 = str1;
		this.str2 = str2;
		thread = new Thread(this);
		thread.start();
	}
	public void run()
	{
		TwoStrings.print(str1, str2);
		TwoStrings.print1(str1, str2);
	}
}

 public class SyncDemo1
{
	public static void main(String args[])
	{
		new PrintStringsThread("Hi", "Tufail");
		new PrintStringsThread("Hi", "Prashant");
		new PrintStringsThread("Hi","Neha");
	}
}