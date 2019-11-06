package ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) { 
		 List<String> courses = new ArrayList<>(); 
		 courses.add("C 语言"); 
		 courses.add("Java SE");
		 courses.add("Java Web"); 
		 courses.add("Java EE"); 
		 // 和数组一样，允许添加重复元素
		 courses.add("C 语言");
		// 1.按照添加顺序打印
		 System.out.println(courses); 
		 // 2.类似数组下标的方式访问
		 System.out.println(courses.get(0)); 
		 //3.修改数组元素的值
		 System.out.println(courses); 
		 courses.set(0, "计算机基础"); 
		 System.out.println(courses); 
		 // 截取部分 [1, 3)  subList 截取
		 List<String> a = courses.subList(0,3);
		 System.out.println(a);//原来的数组被修改了
		 //重新构造
		 List<String> courses2 = new ArrayList<>(courses); 
		 System.out.println(courses2); 
		 List<String> courses3 = new LinkedList<>(courses); 
		 System.out.println(courses3); 
		 // 引用的转换
		ArrayList<String> courses4 = (ArrayList<String>)courses2; //强制转换
		 System.out.println(courses4); 
		// LinkedList<String> c = (LinkedList<String>)course2; 错误的类型
		LinkedList<String> courses5 = (LinkedList<String>)courses3; 
		System.out.println(courses5); 
		// ArrayList<String> c = (ArrayList<String>)course3; 错误的类型
	
	}
}
