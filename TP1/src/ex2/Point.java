package ex2;

public class Point {
	float x;
	float y;
		
	Point(float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	Point() {}
	
	void afficher () {
		System.out.println("X: " + x +" Y: " + y);
	}
	
	void deplacer (float x, float y) {
		this.x = x;
		this.y = y;
	}
	
	float getAbscisse() {
		return this.x;
	}
	
	float getOrdonnee() {
		return this.y;
	}
	
	@Override
	public String toString() {
		return "X: " + this.x + " Y: " + this.y;
	}
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Point)) {
			return false;
		} else {
			// casting the type of the object so we can compare the point's coordinates to the current coordinates
			Point point = (Point) o;
			if(point.x == this.x && point.y == this.y) {
				return true;
			} else {
				return false;
			}
		}
		
	}
}
