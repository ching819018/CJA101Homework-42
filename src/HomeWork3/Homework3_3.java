package HomeWork3;

import java.util.Scanner;

public class Homework3_3 {

	public static void main(String[] args) {

//		三.阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//		厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//		的號碼與總數,如圖:

		Scanner sc = new Scanner(System.in);
		System.out.println("這次不想選哪個數字 1~9 ");
		int number = sc.nextInt();

		while (number > 9 || number < 1) {
			System.out.println("請輸入 1~9 ");
		}
		int count = 0;
		for (int i = 1; i <= 49; i++) {
			if (i / 10 == number || i % 10 == number) {
				continue;
			}
			count++;
			System.out.println(i);
		}
		System.out.println("總共有" + count + "可以選");
	}
}
