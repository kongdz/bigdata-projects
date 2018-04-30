package com.awebone.collection;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {
	
	public List<Course> courses;
	
	public TestGeneric() {
		this.courses=new ArrayList<Course>();
	}
	
	public void testadd() {
		Course cr1=new Course("1","��ѧ����");
		courses.add(cr1);
		//���ͼ����У�������ӷ��͹涨�����ͼ�������������Ķ��󣬷���ᱨ��
		Course cr2=new Course("2","Java");
		courses.add(cr2);
	}
	
	public void testForEach() {
		for(Course cr:courses) {
			System.out.println(cr.id+":"+cr.name);
		}
	}
	
	/**
	 * ���ͼ��Ͽ�����ӷ��͵������͵Ķ���ʵ��
	 * @param args
	 */
	private void testChild() {
		Course ccr=new Course();
		ccr.id="3";
		ccr.name="�����Ϳγ̶���";
		courses.add(ccr);
	}

	public static void main(String[] args) {
		TestGeneric tg=new TestGeneric();
		tg.testadd();
		tg.testForEach();
		tg.testChild();
		tg.testForEach();
	}

}
