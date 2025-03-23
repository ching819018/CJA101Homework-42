package HomeWork5;

import java.util.Scanner;

public class Homework5_1 {
//	請設計一個方法為starSquare(int width, int height),
//	當使用者鍵盤
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入寬與高");
		int width = sc.nextInt();
		int height = sc.nextInt();
		starSquare(width, height);
	}

	public static void starSquare(int width, int height) {

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
}
