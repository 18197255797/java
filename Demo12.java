package string;

public class Demo1 {
	//获取指定位置的字符串
	public static void main (String[]args) {
		System.out.println("hello".isEmpty()); 
		System.out.println("".isEmpty()); 
		System.out.println(new String().isEmpty());
//		String str = " hello%$$%@#$%world 哈哈哈 " ; 
//		System.out.println(str.length()); 
		//String str = " hello world " ; 
//			System.out.println("["+str+"]"); 
//			System.out.println("["+str.trim()+"]"); 
//			
//			String str = "helloworld" ;
//			System.out.println(str.substring(5));
//			System.out.println(str.substring(0, 5));
//			String str = "name=zhangsan&age=18" ; 
//			String[] result = str.split("&") ; 
//				for (int i = 0; i < result.length; i++) { 
//				String[] temp = result[i].split("=") ; 
//				System.out.println(temp[0]+" = "+temp[1]); 
//			}
//		String str = "hello world hello bit" ; 
//		String[] result = str.split(" ",3) ; // 按照空格拆分
//		for(String s: result) { 
//		 System.out.println(s); 
//		}
//		String str = "hello";
//		String str2 = "helloworld" ; 
//		System.out.println(str2.replaceAll("l", "_")); //replaceAll 全都替换
//		System.out.println(str2.replaceFirst("l", "_"));//replaceFirst 替换首个
//		System.out.println(str.contains("world")); // true 
//		该判断形式是从JDK1.5之后开始追加的，在JDK1.5以前要想实现与之类似的功能，就必须借助、indexOf()方法完
//		成。
//			System.out.println(str.charAt(0));//h
//			System.out.println(str.charAt(10)); //异常
//		//字符串与数组的互换
//			String str= "helloworld" ; 
//			char []data = str.toCharArray();
//			for (int i=0;i>data.length;i++) {
//				System.out.print(data[i]+" ");
//			} 
//			
//			// 字符数组转为字符串
//			System.out.println(new String(data)); // 全部转换
//			System.out.println(new String(data,5,5)); // 部分转换
//		
//		}
//		public static void main(String[] args) { 
//			System.out.println("A".compareTo("a")); // -32 
//			System.out.println("a".compareTo("A")); // 32 
//			System.out.println("A".compareTo("A")); // 0 
//			System.out.println("AB".compareTo("AC")); // -1 
//			System.out.println("刘".compareTo("杨"));
//		}
//			 String str = "1a23456" ; 
//			 System.out.println(isNumber(str)? "字符串由数字所组成！" : "字符串中有非数字成员！"); 
//			 } 
//			 public static boolean isNumber(String str) { 
//			 char[] data = str.toCharArray() ; 
//			 for (int i = 0; i < data.length; i++) { 
//				 if (data[i]<'0' || data[i]>'9') { 
//					 return false ; 
//				 	} 
//			 	} 
//			 	return true ; 
//			}
	}}

