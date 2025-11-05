package by.java.homework.task12;

public class MainGeneric {
    static void main() {
        //1.5 Класс Main. Создать 2 объекта класса Garage. Вывести на экран имя хранимого транспортного средства и проверить разрешён ли въезд транспортного средства в гараж.
        Vehicle car = new Car();
        car.setName("BMW");
        car.setEmissionsAmount(99);

        Vehicle motorcycle = new Motorcycle("HARLEY", 101);
        Garage <Vehicle> carGarage = new Garage<>(car);
        System.out.println(car.getName() + " въезд разрешен: " + carGarage.isEntryPermitted(car));

        Garage <Vehicle> motoGarage = new Garage<>(motorcycle);
        System.out.println(motorcycle.getName() + " въезд разрешен: " + motoGarage.isEntryPermitted(motorcycle));


    }
}
