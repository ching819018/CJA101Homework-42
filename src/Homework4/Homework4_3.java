package Homework4;

public class Homework4_3 {

	public static void main(String[] args) {
//	• 有個字串陣列如下 (八大行星)
//	{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//	請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//	(提示:字元比對,String方法)

		String[] eight = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int m = 0;
		for (int i = 0; i < eight.length; i++) {
			for (int k = 0; k < eight[i].length(); k++) {
				char world = eight[i].charAt(k);
				if (world == 'a' || world == 'e' || world == 'i' || world == 'o' || world == 'u') {
					m++;
				}
			}
		}
		System.out.println("陣列裡共有" + m + "個母音");
	}
}