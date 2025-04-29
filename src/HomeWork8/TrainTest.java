package HomeWork8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TrainTest {
	public static void main(String[] args) {

		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);

		System.out.println("一. 請寫一隻程式,能印出不重複的Train物件");
		Set<Train> set = new HashSet<Train>();

		set.add(t1);
		set.add(t2);
		set.add(t3);
		set.add(t4);
		set.add(t5);
		set.add(t6);
		set.add(t7);

		System.out.println("========for each======");
		for (Train train : set) {
			System.out.println(train);
		}

		System.out.println("========Iterator======");
		Iterator<Train> train1 = set.iterator();
		while (train1.hasNext()) 
			System.out.println(train1.next());

		System.out.println("========for迴圈========");
		Object[] train3 = set.toArray();
		for (int i = 0; i < train3.length; i++) {
			System.out.println(train3[i]);
		}
		System.out.println("====================");
		System.out.println("二. 請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出");
		
		List<Train> list = new ArrayList<Train>();
		
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		list.add(t5);
		list.add(t6);
		list.add(t7);	
		Collections.sort(list);
		
		System.out.println("========for each======");
		for (Train train4 : list) {
			System.out.println(train4);
		}

		System.out.println("========Iterator======");
		Iterator<Train> train5 = list.iterator();
		while (train5.hasNext()) 
			System.out.println(train5.next());

		System.out.println("========for迴圈========");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("====================");
		System.out.println("三. 承上,不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件");
		
		Set<Train> set1 = new TreeSet<Train>();
		
		set1.add(t1);
		set1.add(t2);
		set1.add(t3);
		set1.add(t4);
		set1.add(t5);
		set1.add(t6);
		set1.add(t7);
		
		System.out.println("========for each======");
		for (Train train6 : list) {
			System.out.println(train6);
		}

		System.out.println("========Iterator======");
		Iterator<Train> train7 = set1.iterator();
		while(train7.hasNext())
			System.out.println(train7.next());
		
		System.out.println("========for迴圈========");
		Object[] train8 = set1.toArray();
		for (int i = 0; i < train8.length; i++) {
			System.out.println(train8[i]);
		}
	}
}
