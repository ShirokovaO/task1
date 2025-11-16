package by.java.homework.task13;

import java.util.*;

public class MainCollections {
    static void main() {
//2. Создать класс студент (Student), группа (Group), факультет (Faculty). У студента поля: имя, фамилия, дата рождения, город рождения, средний бал. У группы: номер группы, коллекция студентов (List<Student> students) У факультета: наименование факультета, список групп (List<Group> groups. ) Реализовать во всех классах методы геттеры и сеттеры.
//1.1. Создать несколько студентов.
//1.2. Создать несколько групп. По этим группам распределить студентов. (метод коллекции add)
//1.3. Создать Факультет. Распределить туда группы. (метод коллекции add)
//1.4. Реализовать метод в классе Group, который должен пройти по всем студентам в группе и удалить тех, у кого средний бал ниже переданной оценки в параметре метода. (метод remove). Сигнатура метода: public void removeStudentsByMark(int mark);
//1.5. Реализовать метод, если в группе меньше 2 человек, перевести этих студентов в другую группу. (методы коллекций size(), addAll()); Сигнатура метода: public void transferToGroup(Group newGroup);
//1.6. Реализовать метод в классе Group, который считает средний бал по группе. Сигнатуру и название придумайте сами.
//1.7*. Добавить поле для факультета энамовского типа: ACTIVE (Активный) и NOT_ACTIVE (Неактивный факультет). Реализовать геттеры и сеттеры.
//1.8* Реализовать метод по смене статуса факультета: Если общее количество студентов на факультете меньше 20-сделать факультет неактитвным. (Метод size() в коллекции)
//1.9*. Вывести студентов в порядке возрастания среднего бала
//1.10*. Вывести студентов в порядке убывания среднего бала.0

        Student student1 = new Student("Max", "Newton", "01.01.2000", "Minsk", 5);
        Student student2 = new Student("Maxim", "Newbin", "01.01.2001", "Minsk", 8);
        Student student3 = new Student("Tom", "Klinton", "01.05.2003", "Pinsk", 7);
        Student student4 = new Student("Ann", "Petrova", "10.12.1999", "Brest", 9);
        Student student5 = new Student("Lina", "Ivanova", "09.08.2000", "Vitebsk", 8);
        Student student6 = new Student("Ken", "Portman", "25.09.2004", "Minsk", 9);
        Student student7 = new Student("Kate", "Lopes", "17.11.2003", "Polotsk", 6);
        Student student8 = new Student("Ben", "Gunn", "03.11.2002", "Tambov", 4);

        List<Student> studentsGroup1 = new ArrayList<>();
        Group group1 = new Group(1, studentsGroup1);
        studentsGroup1.add(student1);
        studentsGroup1.add(student2);
        studentsGroup1.add(student3);
        studentsGroup1.add(student4);
        System.out.println(group1.toString());
        group1.removeStudentsByMark(6);
        System.out.println(group1.toString());


        List<Student> studentsGroup2 = new ArrayList<>();
        Group group2 = new Group(2, studentsGroup2);
        studentsGroup2.add(student4);
        studentsGroup2.add(student5);
        studentsGroup2.add(student6);

        List<Student> studentsGroup3 = new ArrayList<>();
        Group group3 = new Group(3, studentsGroup3);
        studentsGroup3.add(student7);
        studentsGroup3.add(student8);
        group3.removeStudentsByMark(5);
        System.out.println(group3.toString());
        group3.transferToGroup(group2);
        System.out.println(group3.toString());
        System.out.println(group2.toString());

        System.out.println("средний балл по группе #" + group2.getGroupNumber() + " = " + group2.getGroupAvgMark());


        List<Group> groupsFaculty = new ArrayList<>(List.of(group1, group2));
        Faculty faculty = new Faculty("экономический", groupsFaculty);
        faculty.facultyStatus(faculty);




    }
}
