package com.awebone.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
	public Map<String,Student> students;
	public MapTest() {
		this.students=new HashMap<String,Student>();
	}
	
	private void testPut() {
		//����Scanner����������ȡ�����ѧ��ID������
		Scanner console=new Scanner(System.in);
		int i=0;
		while(i<3) {
			System.out.println("������ѧ��ID��");
			String ID=console.next();
			Student st=students.get(ID);
			//�ж�ID�Ƿ�ռ��
			if(st==null) {
				System.out.println("������ѧ��������");
				String name=console.next();
				Student newStudent=new Student(ID,name);
				students.put(ID, newStudent);
				System.out.println("�ɹ����ѧ����"+students.get(ID).name);
				i++;
			}else {
				System.out.println("��ѧ��ID�ѱ�ռ��");
				continue;
			}
		}
	}
	
	private void testKeySet() {
		//ͨ��KeySet����������Map�����м��ļ���
		Set<String> keySet=students.keySet();
		//ȡ��students������
		System.out.println("�ܹ��У�"+students.size()+"��ѧ��");
		//����kaySet��ȡ��ÿһ�������ٵ���get����ȡ��ÿ������Ӧ��value
		for (String stuId : keySet) {
			Student st=students.get(stuId);
			if(st!=null) {
				System.out.println("ѧ����"+st.name);
			}
		}
	}
	
	private void testRemove() {
		//��ȡ�Ӽ�������Ĵ�ɾ����ѧ��ID�ַ���
		Scanner console=new Scanner(System.in);
		while(true) {
			//��ʾ����ɾ����ѧ��ID
			System.out.println("������Ҫɾ����ѧ��ID��");
			String ID=console.next();
			Student st=students.get(ID);
			if(st==null) {
				System.out.println("��ID������");
				continue;
			}
			students.remove(ID);
			System.out.println("�ɹ�ɾ��ѧ����"+st.name);
			break;
		}
	}
	
	//ͨ��entrySet����������Map
	private void testEntrySet() {
		//ͨ��entrySet����,����Map�е����м�ֵ��
		Set<Entry<String, Student>> entrySet=students.entrySet();
		for (Entry<String, Student> entry : entrySet) {
			System.out.println("ȡ�ü���"+entry.getKey());
			System.out.println("��Ӧ��ֵΪ��"+entry.getValue().name);
		}
	}
	
	//����put�����޸�Map�����е�ӳ��
	private void testModify() {
		System.out.println("������Ҫ�޸ĵ�ѧ��ID��");
		Scanner console=new Scanner(System.in);
		while(true) {
			String ID=console.next();
			Student st=students.get(ID);
			if(st==null) {
				System.out.println("��ID������");
				continue;
			}
			System.out.println("��ǰѧ��ID������Ӧ��ѧ��Ϊ��"+st.name);
			System.out.println("�������µ�ѧ����������");
			String name=console.next();
			Student newStudent=new Student(ID,name);
			students.put(ID, newStudent);
			System.out.println("�޸ĳɹ�");
			break;
		}
	}
	
	/**
	 * ����Map���Ƿ����ĳ��Keyֵ��Valueֵ
	 */
	private void testContainsKeyOrValue() {
		// ��ʾ����ѧ��ID
		System.out.println("������Ҫ��ѯ��ѧ��id");
		Scanner console=new Scanner(System.in);
		String id=console.next();
		//��Map�У���containsKey()���������ж��Ƿ����ĳ��Keyֵ����containsValue()���������ж��Ƿ����ĳ��Valueֵ
		System.out.println("�������ѧ��IDΪ��"+id+"����ѧ��ӳ������Ƿ���ڣ�"+students.containsKey(id));
		if(students.containsKey(id)) {
			System.out.println("��Ӧ��ѧ��Ϊ��"+students.get(id).name);
		}
		
		System.out.println("������Ҫ��ѯ��ѧ��name");
		String name=console.next();
		//��Map�У���containsKey()���������ж��Ƿ����ĳ��Keyֵ����containsValue()���������ж��Ƿ����ĳ��Valueֵ
		if(students.containsValue(new Student(null,name))) {
			System.out.println("ȷʵ����ѧ��Ϊ��"+name);
		}else {
			System.out.println("ѧ��ӳ����в����ڸ�ѧ��");
		}
	}

	public static void main(String[] args) {
		MapTest mt=new MapTest();
		mt.testPut();
		mt.testKeySet();
//		mt.testRemove();
//		mt.testEntrySet();
//		mt.testModify();
//		mt.testEntrySet();
		
		mt.testContainsKeyOrValue();
	}

}
