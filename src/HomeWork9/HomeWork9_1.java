package HomeWork9;

public class HomeWork9_1 {
	public static void main(String[] args) {
		
		System.out.println("==== 大胃王比賽開始 ====");
			MantoMan M = new MantoMan();
			Thread t1 = new Thread(M);
			
			James J = new James();
			Thread t2 = new Thread(J);
			
			t1.start();
			t2.start();
		
		try {
				t1.join();
				t2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}System.out.println("==== 大胃王比結束了 ====");
	}
}
