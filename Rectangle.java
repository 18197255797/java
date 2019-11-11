package Shape;

public class Rectangle implements Shape2D {
	double l;
	double w;
	Rectangle(double l,double w){
		this.l = l;
		this.w = w;
	}
	public double area() {
		return l*w;
	}
}
