package string;

public class Demo1 {
	//��ȡָ��λ�õ��ַ���
	public static void main (String[]args) {
		System.out.println("hello".isEmpty()); 
		System.out.println("".isEmpty()); 
		System.out.println(new String().isEmpty());
//		String str = " hello%$$%@#$%world ������ " ; 
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
//		String[] result = str.split(" ",3) ; // ���տո���
//		for(String s: result) { 
//		 System.out.println(s); 
//		}
//		String str = "hello";
//		String str2 = "helloworld" ; 
//		System.out.println(str2.replaceAll("l", "_")); //replaceAll ȫ���滻
//		System.out.println(str2.replaceFirst("l", "_"));//replaceFirst �滻�׸�
//		System.out.println(str.contains("world")); // true 
//		���ж���ʽ�Ǵ�JDK1.5֮��ʼ׷�ӵģ���JDK1.5��ǰҪ��ʵ����֮���ƵĹ��ܣ��ͱ��������indexOf()������
//		�ɡ�
//			System.out.println(str.charAt(0));//h
//			System.out.println(str.charAt(10)); //�쳣
//		//�ַ���������Ļ���
//			String str= "helloworld" ; 
//			char []data = str.toCharArray();
//			for (int i=0;i>data.length;i++) {
//				System.out.print(data[i]+" ");
//			} 
//			
//			// �ַ�����תΪ�ַ���
//			System.out.println(new String(data)); // ȫ��ת��
//			System.out.println(new String(data,5,5)); // ����ת��
//		
//		}
//		public static void main(String[] args) { 
//			System.out.println("A".compareTo("a")); // -32 
//			System.out.println("a".compareTo("A")); // 32 
//			System.out.println("A".compareTo("A")); // 0 
//			System.out.println("AB".compareTo("AC")); // -1 
//			System.out.println("��".compareTo("��"));
//		}
//			 String str = "1a23456" ; 
//			 System.out.println(isNumber(str)? "�ַ�������������ɣ�" : "�ַ������з����ֳ�Ա��"); 
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

