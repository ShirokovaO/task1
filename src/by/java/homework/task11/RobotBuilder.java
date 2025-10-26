package by.java.homework.task11;

public class RobotBuilder implements Robot, RobotEngineer {
    //  РоботСроитель. Поля: модель, потребляемая мощность, страна производитель, агрегат для строительства, материал, включение робота (boolean isOn.)
    String model;
    int power;
    String countryOfOrigin;
    String buildingUnit;
    String material;
    boolean isOn;

    public RobotBuilder(String model, int power, String countryOfOrigin, String buildingUnit, String material, boolean isOn) {
        this.model = model;
        this.power = power;
        this.countryOfOrigin = countryOfOrigin;
        this.buildingUnit = buildingUnit;
        this.material = material;
        this.isOn = isOn;
    }

    @Override
    public void robotOnOff(boolean isOn) {
        if (isOn == true) {
            System.out.println("Робот строитель вкл");
        } else
            System.out.println("Робот строитель выкл");
    }

    @Override
    public void robotStart() {
        isOn = true;
        System.out.println("робот строитель начал работу " + "isOn " + isOn);
    }

    @Override
    public void uniquePossibility() {
        System.out.println("робот строитель строит");
    }

    @Override
    public void createItem() {
        System.out.println("робот строитель производит стены");
    }
}
