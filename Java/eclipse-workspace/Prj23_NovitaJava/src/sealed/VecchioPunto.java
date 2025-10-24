package sealed;

import java.util.Objects;

public class VecchioPunto implements Comparable<Point> {

	private final int x;
	private final int y;

	public VecchioPunto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VecchioPunto other = (VecchioPunto) obj;
		return x == other.x && y == other.y;
	}

	@Override
	public String toString() {
		return "VecchioPunto [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int compareTo(Point o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
