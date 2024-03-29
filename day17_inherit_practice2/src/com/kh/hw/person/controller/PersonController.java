package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {

	// 필드
	private Student[] s = new Student[3]; // =>Student 객체를 참조하는 참조변수가 3개 생긴것
	private Employee[] e = new Employee[10];

	// 메소드
	public int[] personCount() {
		int[] count = new int[2];
		// 학생 객체 수 구하기
		for (int i = 0; i < s.length; i++) {
			if (s[i] != null) {
				count[0]++;
			}
		}
		// 사원 객체 수 구하기
		for (int i = 0; i < e.length; i++) {
			if (e[i] != null) {
				count[1]++;
			}
		}
		return count;
	}

	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		// s => [null, null, null]
		for(int i=0; i<s.length; i++) {
			if(s[i]==null) {
				s[i] = new Student(name, age, height, weight, grade, major);
				return;
			} 
		}
	}

	public Student[] printStudent() {
		return s;
	}
	
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		for(int i=0; i<e.length; i++) {
			if(e[i]==null) {
				e[i] = new Employee(name, age, height, weight, salary, dept);
				return;
			} 
		}
	}

	public Employee[] printEmployee() {
		return e;
	}

}
