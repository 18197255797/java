package string;

public class MyString {
	
		 public static void main(String[] args) { 
			 
			 StringBuffer sb = new StringBuffer(); 
			 sb.append("Hello").append("World"); 
			 System.out.println(sb); 
			 StringBuffer sb1 = new StringBuffer("helloworld"); 
			 StringBuffer s2 = new StringBuffer("bit");
			 s2.append("hehe");
			 System.out.println(sb1.reverse()); 
			 System.out.println("s2="+s2); 
			 System.out.println(s2.reverse()); 
			 String str = new String("lala");
			 str = "haha";
			 System.out.println(str); 
		 } 
	
}


