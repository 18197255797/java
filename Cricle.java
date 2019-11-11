package Shape;

public class Cricle implements Shape2D {
	double r;
	Cricle (double r){
		this.r = r;
	}
	public double area() {
		return PI*r*r;
	}
}
