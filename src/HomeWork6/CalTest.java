package HomeWork6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("請輸入 X :");
			int x = sc.nextInt();
			System.out.println("請輸入 Y :");
			int y = sc.nextInt();
			Calculator c = new Calculator();
			System.out.println(x + "的" + y + "次方為 :" + c.powerxy(x, y));
		} catch (InputMismatchException e) {
			System.out.println("輸入格式不正確，請輸入整數");
		} catch (CalException e) {
			e.printStackTrace(); // System.out.println(e.getMessage());
		}
	}
}
