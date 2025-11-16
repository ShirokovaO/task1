package by.java.homework.task13;

import java.util.List;

public class Faculty {
    //    /2. Создать класс студент (Student), группа (Group), факультет (Faculty). У студента поля: имя, фамилия, дата рождения, город рождения, средний бал. У группы: номер группы, коллекция студентов (List<Student> students) У факультета: наименование факультета, список групп (List<Group> groups. ) Реализовать во всех классах методы геттеры и сеттеры.
    //1.3. Создать Факультет. Распределить туда группы. (метод коллекции add)
    //1.7*. Добавить поле для факультета энамовского типа: ACTIVE (Активный) и NOT_ACTIVE (Неактивный факультет). Реализовать геттеры и сеттеры.
    //1.8* Реализовать метод по смене статуса факультета: Если общее количество студентов на факультете меньше 20-сделать факультет неактитвным. (Метод size() в коллекции)

    private String nameFaculty;
    private List<Group> groups;
    String ACTIVE = "Активный";
    String NOT_ACTIVE = "НЕ Активный";

    public Faculty(String nameFaculty, List<Group> groups) {
        this.nameFaculty = nameFaculty;
        this.groups = groups;
    }

    public void facultyStatus (Faculty faculty){
        if (faculty.getGroups().size()<20) {
            System.out.println("выбранный факультет " +  faculty.getNameFaculty() + " " + NOT_ACTIVE);
        } else System.out.println("выбранный факультет " + faculty.getNameFaculty() + " " + ACTIVE);
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "nameFaculty='" + nameFaculty + '\'' +
                ", groups=" + groups.toString() +
                '}';
    }

    public String getNameFaculty() {
        return nameFaculty;
    }

    public void setNameFaculty(String nameFaculty) {
        this.nameFaculty = nameFaculty;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

}
