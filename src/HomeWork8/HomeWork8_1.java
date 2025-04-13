package HomeWork8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeWork8_1 {
	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short("100"));
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Integer(100));
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));

		System.out.println("toString() = " + list);

		Iterator objs = list.iterator();
			while (objs.hasNext())
			System.out.print(objs.next()+" ");
			System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");}
			System.out.println();
			
		for (Object obj : list) {
			System.out.print(obj+" ");}
			System.out.println();
		
		//移除不是lang.Number的物件
		int i = 0;
		while(i < list.size()) {
			if(!(list.get(i) instanceof Number))
				list.remove(i);
			else
				i++;
			}
		//再次印出所有元素,觀察是否已移除Number相關物件
		for(Object obj : list) {
			System.out.print(obj+" ");
			}
		}
	}