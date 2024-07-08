package com.zadachadz.les14.gr_and_st;

import java.util.ArrayList;
import java.util.List;

public class Group {

  private ArrayList<Student> students2;

  public Group(List<Student> students2) { // конструктор, принимающий массив студентов
	    this.students2 = (ArrayList<Student>) students2; // и инициализирующий поле student данного объекта класса Group этим массивом
	  }

  public void printBestMarks() { // метод для выведения лучших оценок
    System.out.println("Наши умницы:");
    for (Student student : students2) {
      int[] bestMarks = student.getMarks();
      boolean best = true;
      for (int i : bestMarks) {
        if (i < 9) {
          best = false;
          break;
        }
      }
      if (best) {
        System.out.println(student.getLastNameAndName() + ", номер группы " + student.getNumberOfGroup());
      }
    }
  }
}
