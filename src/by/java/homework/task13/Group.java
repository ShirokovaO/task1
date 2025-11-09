package by.java.homework.task13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Group {
//  1. Создать класс студент (Student), группа (Group), факультет (Faculty). У студента поля: имя, фамилия, дата рождения, город рождения, средний бал. У группы: номер группы, коллекция студентов (List<Student> students) У факультета: наименование факультета, список групп (List<Group> groups. ) Реализовать во всех классах методы геттеры и сеттеры.
//1.2. Создать несколько групп. По этим группам распределить студентов. (метод коллекции add)
//1.4. Реализовать метод в классе Group, который должен пройти по всем студентам в группе и удалить тех, у кого средний бал ниже переданной оценки в параметре метода. (метод remove). Сигнатура метода: public void removeStudentsByMark(int mark);
//1.5. Реализовать метод, если в группе меньше 2 человек, перевести этих студентов в другую группу. (методы коллекций size(), addAll()); Сигнатура метода: public void transferToGroup(Group newGroup);
//1.6. Реализовать метод в классе Group, который считает средний бал по группе. Сигнатуру и название придумайте сами.

    private int groupNumber;
    private List <Student> students;

    public Group(int groupNumber, List<Student> students) {
        this.groupNumber = groupNumber;
        this.students = students;
    }


    public void removeStudentsByMark(int mark){
       List<Student> newGroup = new ArrayList<>(students);
        for (Student s:newGroup){
           if(mark>s.getAvgMark()) students.remove(s);
       }
    }

    public void transferToGroup(Group newGroup){
        if (students.size()<2){
            newGroup.getStudents().addAll(students);
        }
        students.clear();
    }

    public int getGroupAvgMark(){
        int avgmark = 0;
        for (Student student: students){
            avgmark = student.getAvgMark() + avgmark;
        }
        avgmark=avgmark/students.size();
        return avgmark;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupNumber=" + groupNumber +
                ", students=" + students.toString() +
                '}';
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
