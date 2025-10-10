package by.java.homework.task7;

public class Student {
    int id;
    String name;
    String surname;
    String faculty;
    int course;
    String group;
    int avgMark;

//    public Student(){
//    }
    public Student(int id, int course, int avgMark, String name, String surname, String faculty,String group){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.faculty=faculty;
        this.course=course;
        this.group=group;
        this.avgMark=avgMark;
    }


//  2. Создать метод, который будет выводить информацию по полям которые есть в классе и назвать его info

    public void info() {
        String info = "Информация по студенту: \n" + "id: " + this.id + " | name: " + this.name + " | surname: " + this.surname +
                " | faculty: " + this.faculty + " | course: " + this.course + " | group: " + this.group + " | avgMark: " + this.avgMark;
        System.out.println(info);
    }

    //  3. Создать метод, который будет изменять текущую группу студента (сам метод в качестве параметра будет принимать новую группу)
// 4. Создать метод, который будет возвращать текущую группу студента.
    public String infoNewGroup(String newGroup) {
        String infoNewGroup = "NewGroup: " + newGroup;
        System.out.println(infoNewGroup);
        return infoNewGroup;
    }

    //        5. Создать метод, который будет изменять оценку студента и группу студента.
    public void NewGroupAndMark(String newGroup1, int newAvgMark) {
        String NewGroupAndMark = "Информация по студенту с новой оценкой и группой: \n" + "id: " + this.id + " | name: " + this.name +
                " | surname: " + this.surname + " | faculty: " + this.faculty + " | course: " + this.course +
                " | group: " + newGroup1 + " | avgMark: " + newAvgMark;
        System.out.println(NewGroupAndMark);
    }

//        6. В классе main создать массив из пяти студентов.
//        7. Создать метод в классе Student, который будет принимать массив студентов и возвращать из этих студентов,
//        массив студентов у которых оценка выше переданной оценке в методе.
//        (Сигнатура метода будет выглядеть так PublicStudent[]getStudents(Students[] students, int mark)

    public Student[] getStudentsByMark (Student [] students, int mark){
        Student[] NewArrayOfStudents = new Student[students.length];
        for (int s = 0; s < students.length; s++) {
            if (students[s].avgMark > mark) {
                NewArrayOfStudents[s] = students[s];
            }
        }
        return NewArrayOfStudents;
    }

//        8. В классе main из полученных студентов из задания 7 пройтись в цикле по массиву и вызвать на каждом
//        студенте метод info, который вы создавали в задании 2

}
