package HomeWork6;

public class Calculator {
	private int x, y;

	public Calculator()throws CalException {
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) throws CalException {

		if (y < 0) {
			throw new CalException("次方為負值，結果回傳不為整數!");
		} else {
			this.y = y;
		}
	}

	public int powerxy(int x, int y) throws CalException {

		if (x == 0 && y == 0) {
			throw new CalException("0的次方沒有意義.");
		} else if (y < 0) {
			throw new CalException("次方為負值，結果回傳不為整數");
		} else {
			return (int) (Math.pow(x, y));
		}
	}
}
