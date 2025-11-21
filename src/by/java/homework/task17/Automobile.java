package by.java.homework.task17;

import java.io.InputStream;
import java.io.Serializable;
import java.util.Objects;

public class Automobile implements Serializable {
    //2.1 Создать объект Автомобиль с полями (Марка автомобиля, максимальная скорость, страна производства). Переопределите метод toString(), equals(), hashcode(), гетеры и сетеры (генерируйте с помощью идеи).
    private String model;
    private int maxSpeed;
    private String country;

    public Automobile(String model, int maxSpeed, String country) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Automobile that = (Automobile) o;
        return getMaxSpeed() == that.getMaxSpeed() && Objects.equals(getModel(), that.getModel()) && Objects.equals(getCountry(), that.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getMaxSpeed(), getCountry());
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
