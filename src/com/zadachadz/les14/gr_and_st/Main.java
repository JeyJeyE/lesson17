package com.zadachadz.les14.gr_and_st;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Student> students = new ArrayList<>(); //rонструктор класса Student принимает имя, номер группы и ДИНАМИЧЕСКИЙ массив оценок
    students = masStudents(new ArrayList<>());//метод инициализирует массив студентов. cоздает объектs типа Student с именами, номерами групп и оценками.

    Group group = new Group(students);
    group.printBestMarks();
  }

  public static ArrayList<Student> masStudents(ArrayList<Student> students) {
    students.add(new Student("Незнающий В.В.", 10705219, new int[] { 8, 7, 7, 8, 8 }));
    students.add(new Student("Потеряшкин П.П.", 10705219, new int[] { 5, 9, 10, 9, 8 }));
    students.add(new Student("Пушкин А.С.", 10705219, new int[] { 9, 9, 9, 9, 9 }));
    students.add(new Student("Иванов И.И.", 10705219, new int[] { 3, 9, 9, 9, 9 }));
    students.add(new Student("Краснов Г.И.", 10705219, new int[] { 5, 8, 7, 8, 7 }));
    students.add(new Student("Александровский Ф.Х.", 10705119, new int[] { 10, 10, 10, 10, 10 }));
    students.add(new Student("Джаванов А. Л.", 10705119, new int[] { 2, 5, 8, 4, 8 }));
    students.add(new Student("Харитонов З.И.", 10705119, new int[] { 9, 9, 9, 8, 9 }));
    students.add(new Student("Потемкин З.У.", 10705119, new int[] { 9, 8, 0, 7, 9 }));
    students.add(new Student("Эрнст К.Г.", 10705119, new int[] { 5, 6, 7, 6, 7 }));

    return students;
  }
}