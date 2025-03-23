package HomeWork5;

public class MyRectangle {
	private double width;
	private double depth;

	public MyRectangle() {
	}

	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}

	void setwidth(double width) {
		this.width = width;
	}

	void setdepth(double depth) {
		this.depth = depth;
	}

	double getArea() {
		return width * depth;
	}
}
