package com.awebone.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {
	public List<Course> coursesToSelect;
	private Scanner console;
	public Student student;
	public SetTest(){
		this.coursesToSelect=new ArrayList<Course>();
		console=new Scanner(System.in);
	}
	
	//������coursesToSelect����ӱ�ѡ�γ�
	public void testAdd() {
		//����һ���γ̶��󣬲�ͨ������add��������ӵ���ѡ�γ�List��
		Course cr1=new Course("1","���ݽṹ");
		coursesToSelect.add(cr1);
		//Course temp=(Course)coursesToSelect.get(0);
		//System.out.println("����˿γ�:"+temp.id+":"+temp.name);
		
		Course cr2=new Course("2","C����");
		coursesToSelect.add(0,cr2);
		//Course temp2=(Course)coursesToSelect.get(0);
		//System.out.println("����˿γ�:"+temp2.id+":"+temp2.name);
		
//		coursesToSelect.add(cr1);
//		Course temp0=(Course)coursesToSelect.get(2);
//		System.out.println("����˿γ�:"+temp0.id+":"+temp0.name);
		
		Course[] course= {new Course("3","��ɢ��ѧ"),new Course("4","���")};
		coursesToSelect.addAll(Arrays.asList(course));
//		Course temp3=(Course)coursesToSelect.get(3);
//		Course temp4=(Course)coursesToSelect.get(4);
		//System.out.println("��������ſγ�:"+temp3.id+":"+temp3.name+";"+temp4.id+":"+temp4.name);
		
		Course[] course2= {new Course("5","�ߵ���ѧ"),new Course("6","��Ӣ")};
		coursesToSelect.addAll(2,Arrays.asList(course2));
//		Course temp5=(Course)coursesToSelect.get(2);
//		Course temp6=(Course)coursesToSelect.get(3);
		//System.out.println("��������ſγ�:"+temp5.id+":"+temp5.name+";"+temp6.id+":"+temp6.name);
	}
	
	private void testForEach() { 
		System.out.println("�����¿γ̴�ѡ(ͨ��for each)��");
		for(Object obj:coursesToSelect) {
			Course cr=(Course)obj;
			System.out.println("�γ̣�"+cr.id+":"+cr.name);
		}
	}
	
	//����List��contains����
	private void testListContains() {
		Course course=coursesToSelect.get(0);
		System.out.println("ȡ�ÿγ̣�"+course.name);
		System.out.println("��ѡ�γ����Ƿ�����γ̣�"+course.name+","+coursesToSelect.contains(course));

		System.out.println("������γ����ƣ�");
		String name=console.next();
		Course course2=new Course();
		course2.name=name;
		System.out.println("�´����γ̣�"+course2.name);
		System.out.println("��ѡ�γ����Ƿ�����γ̣�"+course2.name+","+coursesToSelect.contains(course2));
		
		//ͨ��indexOf����ȡ��ĳ��Ԫ�ص�����λ��
		if(coursesToSelect.contains(course2)) {
			System.out.println("�γ̣�"+course2.name+"������λ��Ϊ��"+coursesToSelect.indexOf(course2));
		}
	}
	
	private void testForEachForSet(Student student) {
		System.out.println("��ѡ���ˣ�"+student.courses.size()+"�ſγ�");
		for(Course cr:student.courses) {
			System.out.println("ѡ���˿γ�"+cr.id+":"+cr.name);
		}
	}
	
	private void createStudentAndSelectCourse() {
		student=new Student("1","С��");
		System.out.println("��ӭѧ����"+student.name+"ѡ��");
		for(int i=0;i<3;i++) {
			System.out.println("������γ�ID");
			String courseId=console.next();
			for(Course cr:coursesToSelect) {
				if(cr.id.equals(courseId)) {
					/**
					 * Set�У����ĳ������������Ӷ��ٴ�,
					 * ����ֻ�ᱣ��һ���ö������ã���
					 * ���ұ������ǵ�һ����ӵ���һ��
					 */
					student.courses.add(cr);
				}
			}
		}
	}
	
	//����Set��contains����
		private void testSetContains() {
			System.out.println("������γ����ƣ�");
			String name=console.next();
			Course course2=new Course();
			course2.name=name;
			System.out.println("�´����γ̣�"+course2.name);
			System.out.println("��ѡ�γ����Ƿ�����γ̣�"+course2.name+","+student.courses.contains(course2));
		}

	public static void main(String[] args) {
		SetTest st=new SetTest();
		st.testAdd();
		st.testForEach();
//		st.testForEachForSet(student);
		
		st.testListContains();
//		st.createStudentAndSelectCourse();
//		st.testSetContains();
	}

}
