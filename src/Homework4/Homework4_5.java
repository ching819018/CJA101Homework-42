package Homework4;

import java.util.Scanner;

public class Homework4_5 {
	public static void main(String[] arge) {
		Scanner sc = new Scanner(System.in);
//		• 請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//
//				例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//				(提示1:Scanner陣列)
//				(提示2:需將閏年條件加入)
//				(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
		System.out.print("請輸入年份 (yyyy): ");
		int year = sc.nextInt();
		System.out.print("請輸入月份 (mm): ");
		int month = sc.nextInt();
		System.out.print("請輸入日期 (dd): ");
		int day = sc.nextInt();

		int monthday = 0;
		int monthday1 = 0;

		int[] x = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 2月有29天

		int[] y = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 2月有28天

		if ((year % 4 == 0 && year % 100 == 0 && year % 400 == 0) || year % 4 == 0 && year % 100 != 0) {
			if (x[month] > day) {
				for (int i = month - 1; i > 0; i--) {
					monthday += x[month];
				}
			} else {
				System.out.print("月份不能大於" + x[month] + "day");
			}
		} else {
			if (y[month] > day) {
				for (int i = month - 1; i > 0; i--) {
					monthday += y[month];
				}
			} else {
				System.out.print("月份不能大於" + y[month] + "day");
			}
		}
		monthday1 = monthday + day;
		if (x[month] < day || y[month] < day) {
		} else {
			System.out.print("是該年的第" + monthday1 + "day");
		}
	}
}