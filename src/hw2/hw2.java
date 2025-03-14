package hw2;

public class hw2 {
	public static void main(String[] args) {
	// • 請建立一個TestNineNine.java程式，可輸出九九乘法表 
	// 一：使用for迴圈+ while迴圈
		 
		for (int h = 1; h < 10; h++) {
			int z = 1;
			while (z < 10) {
				System.out.print(h + "*" + z + "=" + h * z + "\t");
				z++;
			}
			System.out.println();
		}
		System.out.println("=----------------------------------=");

	// 二：使用for迴圈+ do while迴圈
		
		for (int a3 = 1; a3 < 10; a3++) {
			int a4 = 1;
			do {
				System.out.print(a3 + "*" + a4 + "=" + a3 * a4 + "\t");
				a4++;
			} while (a4 < 10);
			System.out.println();
		}
		System.out.println("=----------------------------------=");

	// 三：使用while迴圈+ do while迴圈

		int a5 = 1;
		while (a5 < 9) {
			int a6 = 1;
			do {
				System.out.print(a5 + "*" + a6 + "=" + a5 * a6 + "\t");
				a6++;
			} while (a6 < 9);
			a5++;
			System.out.println();
		}
		System.out.println("=----------------------------------=");

		// 請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)

		int sum5 = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				sum5 += i;
			}
		}
		System.out.println("偶數總數和為" + sum5);
		System.out.println("=----------------------------------=");

		// 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
		int sum1 = 1;
		for (int a = 1; a <= 10; a++) {
			sum1 *= a;
		}
		System.out.println("1~10乘機為" + sum1);
		System.out.println("=----------------------------------=");

		// 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
		int sum2 = 1;
		int b = 1;
		while (b <= 10) {
			sum2 *= b;
			b++;
		}
		System.out.println("1~10的乘機為" + sum2);
		System.out.println("=----------------------------------=");

		// X+2 1 3 5 7 9 11 13 15 17 19

		int x, y = 1;
		for (x = 1; y < 100; x++) {
			y = (int) Math.pow(x, 2);
			System.out.print(+y + " ");
		}
		System.out.println();
		System.out.println("=----------------------------------=");
		// 阿文很熱衷大樂透(1 ～49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
		// 輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		
		int number = 1, count = 0;
		// 40後面直接不用計算
		for (; number <= 39; number++) {
			if (number % 10 != 4)
				System.out.print(number + " ");
			count += 1;
		}
		System.out.println("\n" + "共有" + count + "個");
		System.out.println("=----------------------------------=");
		/*
		 * 請設計一隻Java程式，輸出結果為以下： 1 2 3 4 5 6 7 8 9 10 
		 * 1 2 3 4 5 6 7 8 9
		 * 1 2 3 4 5 6 7 8
		 * 1 2 3 4 5 6 7 
		 * 1 2 3 4 5 6 
		 * 1 2 3 4 5 
		 * 1 2 3 4 
		 * 1 2 3 
		 * 1 2 
		 * 1
		 */
		int j = 10, k = 1;
		for (j = 10; j >= 1; j--) {
			for (k = 1; k <= j; k++)
				System.out.print(k + " ");
			System.out.println();
		}
		System.out.println("=----------------------------------=");

		
		//請設計一隻Java程式，輸出結果為以下： A BB CCC DDDD EEEEE FFFFFF
		 

		int charnum5 = 65;// chr'A'= 65;
		for (int v = 1; v <= 6; v++) {
			for (int g = 1; g <= v; g++) {
				System.out.print((char) charnum5);
			}
			System.out.println("");
			charnum5++;
		}
		System.out.println("=----------------------------------=");
	}
}