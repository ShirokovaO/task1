package by.java.homework.task11;

public class RobotSapper implements Robot, RobotEngineer {
    //РоботСапёр. Поля: модель, потребляемая мощность, средство для разминирования (шасси номер), материал, включение робота (boolean isOn)
    //В классе РоботСапёр переопределите дефолтный метод (отремонтировать робота)

    String model;
    int power;
    String material;
    String sapperUnit;
    boolean isOn;

    public RobotSapper(String model, int power, String material, String sapperUnit, boolean isOn) {
        this.model = model;
        this.power = power;
        this.material = material;
        this.sapperUnit = sapperUnit;
        this.isOn = isOn;
    }

    @Override
    public void fixRobot() {
        System.out.println("RobotSapper is fixed");
        ;
    }

    @Override
    public void robotOnOff(boolean isOn) {
        if (isOn == true) {
            System.out.println("Робот сапер вкл");
        } else
            System.out.println("Робот сапер выкл");
    }

    @Override
    public void robotStart() {
        isOn = true;
        System.out.println("робот сапер начал работу " + "isOn " + isOn);
    }

    @Override
    public void uniquePossibility() {
        System.out.println("робот сапер разминирует");
    }

    @Override
    public void createItem() {
        System.out.println("робот сапер производит безопасный путь");
    }
}
