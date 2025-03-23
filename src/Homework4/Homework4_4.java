package Homework4;

import java.util.Scanner;

public class Homework4_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//	• 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//	表如下:
		System.out.println("請輸入想借多少錢");
		int borrow = sc.nextInt();

		int[][] partner = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };

		int x = 0;
		for (int i = 0; i < partner.length; i++) {
			if (partner[i][1] >= borrow) {
				System.out.println("員工編號" + partner[i][0]);
				x++;
			}
		}
		System.out.println("可借錢的共"+x+"人");
	}
}
