package day5;

public class ThreadLearning extends Thread{

//	Thread t1;
//	public ThreadLearning()
//	{
//		t1 = new Thread(this);
//		t1.start();
//		System.out.println("Hello from "+Thread.currentThread().getName());
//	}
	@Override
	public void run() {
//		for(int i=0;i<5;i++)
//		{
//			System.out.println(i+" K Samarth N Kamath is in "+Thread.currentThread().getName());
//		}
		System.out.println(" Printing Thread "+Thread.currentThread().getName());
	}
	public static void main(String[] args) throws InterruptedException {
//		ThreadLearning TL = new ThreadLearning();
//		System.out.println("Main called by "+Thread.currentThread().getName());
		
		ThreadLearning first = new ThreadLearning();
		first.setName("FIRST");
		ThreadLearning second = new ThreadLearning();
		second.setName("SECOND");
		ThreadLearning third = new ThreadLearning();
		third.setName("THIRD");
		ThreadLearning fourth = new ThreadLearning();
		fourth.setName("FOURTH");
		
		fourth.setPriority(MAX_PRIORITY);
		third.setPriority(MIN_PRIORITY);
		
		System.out.println("Printing Thread 1:");
		first.start();
		
		System.out.println("Printing Thread 2:");
		second.start();
		
		System.out.println("Printing Thread 3:");
		third.start();
		Thread.currentThread().sleep(1000);
		System.out.println("Printing Thread 4:");
		fourth.start();
		
	}
	
}
