package by.java.homework.task15;

public class Employee {
    //    1.1.Создать класс. Сотрудник.
//1.2.Поля у сотрудника. Идентификационный номер, Имя, фамилия, возраст, зарплата.
    private int id;
    private String name;
    private String surname;
    private int age;
    private int salary;

    public Employee(int id, String name, String surname, int age, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\n Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                "}";
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
