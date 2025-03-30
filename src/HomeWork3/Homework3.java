package HomeWork3;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
//	一.請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//	三角形、其它三角形或不是三角形,如圖示結果:

		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個整數 : ");

		int L[] = new int[3];

		if (sc.hasNextInt()) {
			L[0] = sc.nextInt();
			L[1] = sc.nextInt();
			L[2] = sc.nextInt();
			
		}
		if (L[0] * L[1] * L[2] != 0) { // 三邊長任一邊不得為0
			if (L[0] == L[1] && L[1] == L[2]) { // 三邊長都相等=正三角型
				System.out.println("正三角形");
			} else if (L[0] == L[2] || L[1] == L[2]) { // 有兩邊等長=等腰三角形
				System.out.println("等腰三角形");
			} else if (L[0] + L[1] > L[2] && L[1] + L[2] > L[0] && L[2] + L[0] > L[1]) {
				System.out.println("其他三角形"); // 三邊不等長=其他三角形
			} else {
				System.out.println("不是三角形");
			} // 三邊長不符合三角形的不等式
		} else {
			System.out.println("不是三角形"); // 三邊長任一邊為0則不是三角形
		}
		System.out.println("==========================");
	}
}