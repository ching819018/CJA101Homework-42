package HomeWork7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class HomeWork7_4 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Animal[] animals = new Animal[4];

		animals[0] = new Dog("Bibi");
		animals[1] = new Cat("Gigi");
		animals[2] = new Dog("Didi");
		animals[3] = new Cat("Jiji");
		String filepath = "C:\\data";
		File f = new File(filepath);

		if (!f.exists()) {
			f.mkdir(); // 沒資料夾檔案 就生成一個
		}
		
		filepath = "C:\\data\\Object.ser";
		File obj = new File(filepath);

		FileOutputStream fos = new FileOutputStream(obj);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		for (int i = 0; i < animals.length; i++) 
			oos.writeObject(animals[i]);
			oos.close();
			fos.close();

			FileInputStream fis = new FileInputStream(obj);
			ObjectInputStream ois = new ObjectInputStream(fis);
			System.out.println(obj.getName() + "內容如下");

			try {
				while (true) {
					((Animal) ois.readObject()).speak();
				}
			} catch (EOFException e) {
				System.out.println("讀取完畢");
			}
		ois.close();
		fis.close();
	}
}
