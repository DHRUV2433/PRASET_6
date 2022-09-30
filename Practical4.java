//This program is run by Dhruv Vekariya(21CE152)
public class Practical4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread first = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Hello I am FIRST");
			}
		}, "FIRST");
		Thread second = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Hello I am SECOND");
			}
		}, "SECOND");
		Thread third = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Hello I am THIRD");
			}
		}, "THIRD");
		second.setPriority(Thread.NORM_PRIORITY);
		first.setPriority(second.getPriority()-2);	
		third.setPriority(second.getPriority()+2);
		
		first.start();
		second.start();
		third.start();
		System.out.println("This program is run by Dhruv Vekariya(21CE152)");
	}
}