package by.java.homework.task12;

public class Garage<V extends Vehicle> {
    //1.3 Создать generic класс Garage<T extends Vehicle >, который может хранить только объекты типа наследуемого от Vehicle.
//1.4 Реализовать метод в классе Garage, который будет разрешать или запрещать въезд в гараж в зависимости от количество выбросов транспортного средства. (Boolean isEntryPermitted()); Реализовать этот метод: если количество выбросов больше 100, тогда въезд запрещён, если меньше 100 – въезд разрешён.

    private V vehicle;

    public Garage(V v) {
        this.vehicle = v;
    }

    Boolean isEntryPermitted(V v) {
        if (v.getEmissionsAmount() >= 100) {
            return false;
        } else
            return true;
    }

}
