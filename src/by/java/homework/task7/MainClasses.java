package by.java.homework.task7;

public class MainClasses {
    static void main(String[] args) {

//        1.  Создать класс Student c полями id (тип int), name (тип String), surname (тип String),
//        faculty (факультет, тип String ), course(тип int) , Группа(тип String),
//        средняя оценка (тип int).Инициализацию студента в классе main выполнять через конструктор с параметрами.
//        Также определите конструктор без параметров.

        Student student = new Student(1234567, 3, 8, "Olya", "Shirokova", "economics", "Kd-7");
//        2. Создать метод, который будет выводить информацию по полям которые есть в классе и назвать его info
        student.info();
//        3. Создать метод, который будет изменять текущую группу студента (сам метод в качестве параметра будет принимать новую группу)
//        4. Создать метод, который будет возвращать текущую группу студента.
        String newGroup = "Mk-38";
        student.infoNewGroup(newGroup);
//        5. Создать метод, который будет изменять оценку студента и группу студента.
        String newGroup1 = "Mn-12";
        int newAvgMark = 6;
        student.NewGroupAndMark(newGroup1, newAvgMark);

        System.out.println("**********************************next task***************************");

//        6. В классе main создать массив из пяти студентов.
        Student student1 = new Student(122222, 2, 3, "Nick", "Petrov", "economics", "Mn-12");
        Student student2 = new Student(122223, 1, 5, "Nike", "Basket", "economics", "Mn-13");
        Student student3 = new Student(122224, 3, 6, "Mike", "Tupak", "Art", "Ar-2");
        Student student4 = new Student(122225, 4, 8, "Tom", "Ivanov", "economics", "Mn-10");
        Student student5 = new Student(122226, 5, 2, "Kate", "Petrova", "economics", "Mn-9");
        Student[] students = {student1, student2, student3, student4, student5};


//        7. Создать метод в классе Student, который будет принимать массив студентов и возвращать из этих студентов,
//        массив студентов у которых оценка выше переданной оценке в методе.
//        (Сигнатура метода будет выглядеть так PublicStudent[]getStudents(Students[] students, int mark)

//        8. В классе main из полученных студентов из задания 7 пройтись в цикле по массиву и вызвать на каждом
//        студенте метод info, который вы создавали в задании 2

        for (Student NewArrayOfStudents : student1.getStudentsByMark(students, 5)) {
            if (NewArrayOfStudents == null) {
                continue;
            }
            NewArrayOfStudents.info();
        }

    }
}
