package Shape;

public class Test {
	public static void main (String[] args) {
		Cricle A = new Cricle(3);
		   Rectangle B = new Rectangle(2.00, 3.00);
		   Caulate C = new Caulate( );
		  System.out.println(A.area());
		  System.out.println(B.area());
		  System.out.println(C.cal(A));
		  System.out.println(C.cal(B));
		 
	}
}
