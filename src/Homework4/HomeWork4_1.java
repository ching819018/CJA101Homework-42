package Homework4;

public class HomeWork4_1 {
	public static void main(String[] args) {
//		有個一維陣列如下:
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素:

		int[] Array = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;
		for (int i = 0; i < Array.length; i++) {
			sum += Array[i];
		}
		System.out.println("此陣列數加總 =" + sum);

		double AVG = sum / Array.length;

		System.out.println("此陣列平均為 = " + AVG);

		for (int i = 0; i < Array.length; i++) {
			if (Array[i] > AVG) {
				System.out.println("大於平均的陣列元素有 :" + Array[i]);
			}
		}
	}
}