package by.java.homework.task13;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    //    1. Создать класс студент (Student), группа (Group), факультет (Faculty). У студента поля: имя, фамилия, дата рождения, город рождения, средний бал. У группы: номер группы, коллекция студентов (List<Student> students) У факультета: наименование факультета, список групп (List<Group> groups. ) Реализовать во всех классах методы геттеры и сеттеры.
    private String name;
    private String surname;
    private String dateOfBirth;
    private String city;
    private int avgMark;

    public Student(String name, String surname, String dateOfBirth, String city, int avgMark) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.city = city;
        this.avgMark = avgMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", city='" + city + '\'' +
                ", avgMark=" + avgMark +
                "}\n";
    }


    public int compare(Student o) {
        if (avgMark > o.getAvgMark()) {
            return 1;
        } else if (avgMark == o.getAvgMark()) {
            return 0;
        }
        return -1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(int avgMark) {
        this.avgMark = avgMark;
    }

    @Override
    public int compareTo(Student student) {
        return name.compareTo(student.getName());
    }
}
