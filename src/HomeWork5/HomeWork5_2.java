package HomeWork5;

public class HomeWork5_2 {
//	請設計一個方法為randAvg(),從10個 0~100(含100)
//	的整數亂數中取平均值並印出這10個亂數與平均值,如圖:
	public static void main(String[] arge) {
		randAvg();
	}

	public static void randAvg() {
		System.out.println("本次亂數結果 : ");
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			int random = (int) (Math.random() * 101);
			sum += random;
			System.out.print(random + " ");
		}
		int avg = sum / 10;
		System.out.println("\n" + "亂數平均值 = " + avg);
	}
}
