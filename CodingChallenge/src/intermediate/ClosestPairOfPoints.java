package intermediate;
import java.util.Arrays;
import java.util.Comparator;

class P {
	int x;
	int y;

	public P(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "<x=" + x + ", y=" + y + ">";
	}

}

public class ClosestPairOfPoints {
	public static void main(String[] args) {
		/*
		 * TreeMap<Integer, Integer> points = new TreeMap<>(); points.put(1, 3);
		 * points.put(6, 3); points.put(1, 1); points.put(3, 3); points.put(-6,
		 * 3); points.put(-3, 3); points.put(-1, 3); points.put(-3, -3);
		 * points.put(3, -3);
		 * 
		 * int midpoint =
		 * (Math.abs(points.firstKey())-Math.abs(points.lastKey()))/2;
		 * System.out.println(midpoint);
		 */

		P[] points = { new P(2, 7), new P(4, 13), new P(5, 7), new P(10, 5), new P(13, 9), new P(15, 5), new P(17, 7),
				new P(19, 10), new P(22, 7), new P(25, 10), new P(29, 14), new P(30, 2) };
		Arrays.sort(points, xComparator);
		System.out.println(Arrays.toString(points));
	}

	static final Comparator<P> xComparator = new Comparator<P>() {
		@Override
		public int compare(P a, P b) {
			if (a.x < b.x) {
				return -1;
			}
			if (a.x > b.x) {
				return 1;
			}
			// if equal, sort by y
			if (a.y < b.y) {
				return -1;
			}
			if (a.y > b.y) {
				return 1;
			}
			return 0;
		}
	};
}
