package by.java.homework.task12;

public class Vehicle {
    //1.1 Создать поле name и количество выбросов(Integer) в классе Vehicle и проинициализировать его через конструктора.
//1.2 Реализовать методы геттеры и сеттеры для соответствующих полей класса Vehicle

    private String name;
    private int emissionsAmount;

    public Vehicle(String name, int emissionsAmount) {
        this.name = name;
        this.emissionsAmount = emissionsAmount;
    }

    public Vehicle (){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmissionsAmount() {
        return emissionsAmount;
    }

    public void setEmissionsAmount(int emissionsAmount) {
        this.emissionsAmount = emissionsAmount;
    }
}
