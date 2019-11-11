package person;

public class Person {
	
	   private String name;
	   private int age;
	   private double high;
	   public Person(){
	   }
	   public Person(String n,int a ,double h){
		   name = n;
		   age = a;
		   high = h;
	   }
	   public void setname(String name ) {
		   this.name = name;
	   }
	   public String getname() {
		   return name;
	   }
	   public void setage(int age ) {
		   this.age = age;
	   }
	   public int  getage() {
		   return age;
	   }
	   public void sethigh(double high ) {
		   this.high = high;
	   }
	   public double   gethigh() {
		   return high;
	   } 
}

	
	

