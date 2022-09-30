//This program is run by Dhruv Vekariya(21CE152)
public class Practical3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Output : ");
				for (int i = 0; i < 6; i++) {
					System.out.println(i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		t.start();
		System.out.println("This program is run by Dhruv vekariya(21CE152)");
	}
}