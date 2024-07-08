package com.zadachadz.les14.gr_and_st;

public class Student {

	private String lastNameAndName; // поля(переменные) класса
	private int numberOfGroup;
	private int[] marks;

	public Student(String lastNameAndName, int numberOfGroup, int[] marks) {// конструктор класса с заданными значениями
		this.lastNameAndName = lastNameAndName; // конструктор инициализирует объект класса
		this.numberOfGroup = numberOfGroup; // с заданными значениями
		this.marks = marks;
	}

	public String getLastNameAndName() { // данные методы предоставляют доступ к приватным полям класса
		return lastNameAndName; // get для получения значений полей
	}

	public int getNumberOfGroup() {
		return numberOfGroup;
	}

	public int[] getMarks() {
		return marks;// (помни, что set нужен для установки новых значений)
	}
}