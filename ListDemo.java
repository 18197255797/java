package ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) { 
		 List<String> courses = new ArrayList<>(); 
		 courses.add("C ����"); 
		 courses.add("Java SE");
		 courses.add("Java Web"); 
		 courses.add("Java EE"); 
		 // ������һ������������ظ�Ԫ��
		 courses.add("C ����");
		// 1.�������˳���ӡ
		 System.out.println(courses); 
		 // 2.���������±�ķ�ʽ����
		 System.out.println(courses.get(0)); 
		 //3.�޸�����Ԫ�ص�ֵ
		 System.out.println(courses); 
		 courses.set(0, "���������"); 
		 System.out.println(courses); 
		 // ��ȡ���� [1, 3)  subList ��ȡ
		 List<String> a = courses.subList(0,3);
		 System.out.println(a);//ԭ�������鱻�޸���
		 //���¹���
		 List<String> courses2 = new ArrayList<>(courses); 
		 System.out.println(courses2); 
		 List<String> courses3 = new LinkedList<>(courses); 
		 System.out.println(courses3); 
		 // ���õ�ת��
		ArrayList<String> courses4 = (ArrayList<String>)courses2; //ǿ��ת��
		 System.out.println(courses4); 
		// LinkedList<String> c = (LinkedList<String>)course2; ���������
		LinkedList<String> courses5 = (LinkedList<String>)courses3; 
		System.out.println(courses5); 
		// ArrayList<String> c = (ArrayList<String>)course3; ���������
	
	}
}
