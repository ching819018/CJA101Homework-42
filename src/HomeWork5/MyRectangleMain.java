package HomeWork5;

public class MyRectangleMain {
	public static void main(String[] args) {

		MyRectangle MyRectangleMain = new MyRectangle();
		MyRectangleMain.setwidth(10);
		MyRectangleMain.setdepth(20);
		System.out.println(MyRectangleMain.getArea());
		
		
		MyRectangle MyRectangleMain2 = new MyRectangle(10,20);
		System.out.println(MyRectangleMain2.getArea());
	}
}
