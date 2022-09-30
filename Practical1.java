//This program is run by Dhruv Vekariya(21CE152)
class ThreadA extends Thread
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello World , ThreadA");
	}
}
class ThreadB implements Runnable
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello World , ThreadB");
	}	
}
public class Practical1 {
	public static void main(String[] args) {
		ThreadA a = new ThreadA();
		Thread t = new Thread(new ThreadB());
		a.start();
		t.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		System.out.println("Hello World , MainThread");
		System.out.println("This program is run by Dhruv Vekariya(21CE152)");
	}
}