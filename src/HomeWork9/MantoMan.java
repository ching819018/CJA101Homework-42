package HomeWork9;

public class MantoMan implements Runnable {

	public void run() {
		
		for(int i = 1 ; i <= 10 ; i ++ ) {
			try {
				System.out.println("饅頭人吃第"+i+"碗飯");
				Thread.sleep((int)(Math.random()*2500)+500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("饅頭人吃完了");
	}
}
