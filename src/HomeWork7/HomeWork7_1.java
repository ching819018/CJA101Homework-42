package HomeWork7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HomeWork7_1 {
	public static void main(String[] args) {
		File myFile = new File("C:\\CJA101_Workspace\\Homework-42\\src\\HomeWork7\\Sample.txt");
		int Char = 0;
		int Linecount = 0;
		try {
			FileReader fr = new FileReader(myFile);
			BufferedReader br = new BufferedReader(fr);

			String str;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
				Linecount++;
				Char += str.length();
			}
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 System.out.println(
	  "Sample.txt有 :" + myFile.length() + "Bytes" 
	+ "\n" + "有"+Char + "個字元"
	+ "\n" +"有"+Linecount + "列資料");
	}
}
