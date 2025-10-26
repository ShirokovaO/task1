package by.java.homework.task11;

public class RobotCook implements Robot {
    //РоботПовар поля: модель, потребляемая мощность, страна производитель, агрегат для приготовления, включение робота (boolean isOn).
    String model;
    int power;
    String countryOfOrigin;
    String cookingUnit;
    boolean isOn;

    public RobotCook(String model, int power, String countryOfOrigin, String cookingUnit, boolean isOn) {
        this.model = model;
        this.power = power;
        this.countryOfOrigin = countryOfOrigin;
        this.cookingUnit = cookingUnit;
        this.isOn = isOn;
    }

    @Override
    public void robotOnOff(boolean isOn) {
        if (isOn == true) {
            System.out.println("Робот повар вкл");
        } else
            System.out.println("Робот повар выкл");
    }

    @Override
    public void robotStart() {
        isOn = true;
        System.out.println("робот повар начал работу " + "isOn " + isOn);
    }

    @Override
    public void uniquePossibility() {
        System.out.println("робот повар готовит");
    }
}
