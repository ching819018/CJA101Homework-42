package HomeWork7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class HomeWork7_2 {
	public static void main(String[] args) throws IOException {

		File data = new File("C:\\CJA101_Workspace\\Homework-42\\src\\HomeWork7\\Data.txt");
		FileWriter br = new FileWriter(data, true);
		BufferedWriter bw = new BufferedWriter(br);
		PrintWriter pw = new PrintWriter(bw);

		for (int i = 1; i <= 10; i++) {
			int a = (int) (Math.random() * 1000) + 1;
			pw.println(a);
		}
		pw.close();
		bw.close();
		br.close();
	}
}
//