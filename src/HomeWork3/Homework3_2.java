package HomeWork3;

import java.util.Scanner;

public class Homework3_2 {
//	二.請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//	對則顯示正確訊息,如圖示結果:

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = (int) (Math.random() * 10);

		int i = 0;

		boolean x = true;

		while (x) {
			System.out.println("請輸入0~9任意數字");
			i = sc.nextInt();
			if (i > a) {
				System.out.println("太大了拉");
			} else if (i < a) {
				System.out.println("也太小了吧");
			} else if (i == a) {
				System.out.println("我也是" + a + "答對囉");
				break;
			}
		}
	}
}
