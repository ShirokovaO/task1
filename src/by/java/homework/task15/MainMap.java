package by.java.homework.task15;

import java.util.*;

public class MainMap {
    //    1.1.Создать класс. Сотрудник.
//1.2.Поля у сотрудника. Идентификационный номер, Имя, фамилия, возраст, зарплата.
//1.3.Создать сотрудников (создайте штук восемь)
//1.4.Создать мапку и записать туда созданных сотрудников в качестве ключа., а в качестве значения им присвоить им профессию.
//1.5 Реализуйте статический метод в классе Main, который повысит зарплату сотрудникам одной профессии. Сигнатура метода к примеру такая.
//private static void raiseSalaryForProfession(Map<Employee, String> employees, int amountOfIncrease). Например: Необходимо повысить зарплату плотникам на 200 рублей. (Обратите внимание на метод entrySet).
//1.6*. Необходимо написать метод, который будет из мапки описанной в п.1.4 создаст мапку типа HashMap<String, Collection<Сотрудник>>. Т.е, поменять местами Квалифакацию и сотрудника( в качестве ключа будет выступать квалификация, в качестве значения-коллекция сотрудников).
    static void main() {
        Employee employee1 = new Employee(1, "name", "surname", 25, 500);
        Employee employee2 = new Employee(2, "name1", "surname1", 28, 550);
        Employee employee3 = new Employee(3, "name2", "surname2", 43, 1500);
        Employee employee4 = new Employee(4, "name3", "surname3", 34, 1200);
        Employee employee5 = new Employee(5, "name4", "surname4", 55, 2500);
        Employee employee6 = new Employee(6, "name5", "surname5", 29, 1400);
        Employee employee7 = new Employee(7, "name6", "surname6", 26, 700);
        Employee employee8 = new Employee(8, "name7", "surname7", 35, 980);
        Map<Employee, String> employees = new HashMap<>();
        employees.put(employee1, "ITshnik");
        employees.put(employee2, "teacher");
        employees.put(employee3, "teacher");
        employees.put(employee4, "ITshnik");
        employees.put(employee5, "doctor");
        employees.put(employee6, "teacher");
        employees.put(employee7, "trackDriver");
        employees.put(employee8, "president");

        System.out.println(employees);

        System.out.println("***********************************raise salary*****************");

        raiseSalaryForProfession(employees, 200);
        System.out.println(employees);

        System.out.println("***********************************New HashMap*****************");
        System.out.println(employeesGroupByProfession(employees));


    }

    private static void raiseSalaryForProfession(Map<Employee, String> employees, int amountOfIncrease) {
        Set<Map.Entry<Employee, String>> entries = employees.entrySet();
        for (Map.Entry<Employee, String> node : entries) {
            Employee employee = node.getKey();
            if (node.getValue().equals("teacher")) {
                employee.setSalary(employee.getSalary() + amountOfIncrease);
            }
        }
    }

    private static Map<String, List<Employee>> employeesGroupByProfession(Map<Employee, String> employees) {
        Map<String, List<Employee>> employeesGroupByProfession = new HashMap<>();
        Set<Map.Entry<Employee, String>> entries1 = employees.entrySet();
        for (Map.Entry<Employee, String> node : entries1) {
            Employee employee = node.getKey();
            String profession = node.getValue();
            if (!employeesGroupByProfession.containsKey(profession)) {
                employeesGroupByProfession.put(profession, new ArrayList<>());
            }
            employeesGroupByProfession.get(profession).add(employee);
        }
        return employeesGroupByProfession;
    }
}
