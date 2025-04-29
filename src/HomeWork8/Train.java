package HomeWork8;

public class Train implements Comparable<Train> {

	private int number;
	private String type, start, dest;
	private double price;

	public Train() {
	}

	public Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		return getTrain();
	}

	public String getTrain() {
		return number + "," + type + start + dest + price;
	}

	public int compareTo(Train train) {
		if (this.number > train.number) {
			return 1;
		} else if (this.number == train.number) {
			return 0;
		} else {
			return -1;
		}
	}

	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj != null && this.getClass() == obj.getClass()) {
			Train train = (Train) obj;
			if (this.number == train.number && this.type.equals(train.type)) {
				return true;
			}
		}
		return false;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = result * prime + number;
		result = result * prime + (type == null ? 0 : type.hashCode());
		return result;
	}
}
