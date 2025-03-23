package HomeWork5;

public class HomeWork5_3 {

//	利用Overloading,設計兩個方法
//	int maxElement(int x[][])與double maxElement(double x[][]),
//	可以找出二維陣列的最大值並回傳,如圖:
	public static void main(String[] args) {
		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };

		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };

		HomeWork5_3 ans = new HomeWork5_3();

		System.out.println(ans.maxElement(intArray));
		System.out.println(ans.maxElement(doubleArray));

	}

	public int maxElement(int x[][]) {

		int max = 0;
		for (int i = 0; i < x.length; i++) {
			max = 0;
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		return max;
	}

	public double maxElement(double x[][]) {
		double maxx = 0;
		for (int k = 0; k < x.length; k++) {
			maxx = 0;
			for (int p = 0; p < x[k].length; p++) {
				if (x[k][p] > maxx) {
					maxx = x[k][p];
				}
			}

		}
		return maxx;
	}
}
