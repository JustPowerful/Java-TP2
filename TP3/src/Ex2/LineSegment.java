package Ex2;

public class LineSegment {
	Point endPoint1;
	Point endPoint2;
	public LineSegment(Point endPoint1, Point endPoint2) {
		// TODO Auto-generated constructor stub
		this.endPoint1 = endPoint1;
		this.endPoint2 = endPoint2;
	}
	
	double length() {
		return this.endPoint1.distanceTo(this.endPoint2);
	}
}
