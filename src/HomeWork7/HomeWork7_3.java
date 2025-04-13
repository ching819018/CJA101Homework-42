package HomeWork7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HomeWork7_3 {
	public void copyfile(File inputFile, File outputFile) throws IOException {

		FileReader fr = new FileReader(inputFile);
		FileWriter fw = new FileWriter(outputFile);
		int i;

		while ((i = fr.read()) != -1) {
			fw.write(i);
			System.out.print((char) i);
			System.out.flush();
		}
		fw.close();
		fr.close();
	}

	public static void main(String[] args) throws IOException {

		File inputFile = new File("C:\\CJA101_Workspace\\Homework-42\\src\\HomeWork7\\copyin.txt");
		File outputFile = new File("C:\\CJA101_Workspace\\Homework-42\\src\\HomeWork7\\copyout.txt");

		HomeWork7_3 hw = new HomeWork7_3();
		hw.copyfile(inputFile, outputFile);
	}
}
