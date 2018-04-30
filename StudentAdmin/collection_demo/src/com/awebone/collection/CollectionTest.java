package com.awebone.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 1.ͨ��Collection.sort()������Integer���͵�List��������
 * 2.��String���͵�List��������
 * 3.���Զ������ͷ��͵�List��������
 * @author Awebone
 *
 */

public class CollectionTest {
	/**
	 * 1.ͨ��Collection.sort()������Integer���͵�List��������,
	 * ����Integer���͵�List������10��100���ڵĲ��ظ����������
	 * Collection.sort()������������
	 */
	private void testSort1() {
		List<Integer> integerList=new ArrayList<Integer>();
		Random random=new Random();
		Integer k;
		for(int i=0;i<10;i++) {
			do {
				k=random.nextInt(100);
			} while (integerList.contains(k));
			integerList.add(k);
			System.out.println("�ɹ����������"+k);
		}
		System.out.println("-------����ǰ-------");
		for (Integer integer : integerList) {
			System.out.println("Ԫ�أ�"+integer);
		}
		Collections.sort(integerList);
		System.out.println("-------�����-------");
		for (Integer integer : integerList) {
			System.out.println("Ԫ�أ�"+integer);
		}
	}
	
	private void testSort2() {
		List<String> stringList=new ArrayList<String>();
		stringList.add("microsoft");
		stringList.add("google");
		stringList.add("lenovo");
		System.out.println("-------����ǰ-------");
		for (String string : stringList) {
			System.out.println("Ԫ�أ�"+string);
		}
		Collections.sort(stringList);
		System.out.println("-------�����-------");
		for (String string : stringList) {
			System.out.println("Ԫ�أ�"+string);
		}
	}
	
	private void testSort3() {
		List<Student> studentList=new ArrayList<Student>();
		Random random=new Random();
		studentList.add(new Student(random.nextInt(1000)+"","microsoft"));
		studentList.add(new Student(random.nextInt(1000)+"","google"));
		studentList.add(new Student(random.nextInt(1000)+"","lenovo"));
		System.out.println("-------����ǰ-------");
		for (Student student : studentList) {
			System.out.println("ѧ����"+student.id+":"+student.name);
		}
		Collections.sort(studentList);
		System.out.println("-------�����-------");
		for (Student student : studentList) {
			System.out.println("ѧ����"+student.id+":"+student.name);
		}
		Collections.sort(studentList,new StudentComparator());
		System.out.println("-------�������������-------");
		for (Student student : studentList) {
			System.out.println("ѧ����"+student.id+":"+student.name);
		}
	}

	public static void main(String[] args) {
		CollectionTest ct=new CollectionTest();
		ct.testSort1();
		ct.testSort2();
		ct.testSort3(); 
	}

}
