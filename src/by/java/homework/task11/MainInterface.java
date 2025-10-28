package by.java.homework.task11;

public class MainInterface {
    static void main() {
//1.2 В классе Main создайте по экземпляру объекта (РоботСапёр, роботСтроитель, РоботПовар) и вызовите метод отремoнтировать робота (результаты выполнения методы выведите в консоль)
        RobotCook robotCook = new RobotCook("Кухонный комбайн", 100, "Тайвань", "измельчитель", false);
        RobotSapper robotSapper = new RobotSapper("вездеход", 200, "металл", "щуп", false);
        RobotBuilder robotBuilder = new RobotBuilder("башенный", 2000, "Германия", "подъемный кран", "сталь", false);
        robotCook.fixRobot();
        robotSapper.fixRobot();
        robotBuilder.fixRobot();

        robotBuilder.robotOnOff(false);
        robotCook.robotStart();
//1.6 Создать 3 выставки (массива) роботов в классе Main. Одна выставка будет включать в себя все виды роботов (робот-повар, робот сапёр, робот строитель). Вторая выставка- только для инженерных роботов. Третья выставка- для роботов сапёров. Продемонстрировать способности всех роботов, которые представлены на выставках (вызвать метод uniquePossibility)
//Продемонстрировать способности всех роботов-инженеров на выставке Роботов-инженеров, вызвав метод createItem на каждом Роботе, который есть на выставке.

        System.out.println("***********************ВЫСТАВКИ**********************");
        System.out.println("\n************все виды*******************");

        Robot[] exhibition = {robotBuilder, robotCook, robotSapper};
        for (Robot e : exhibition) {
            e.uniquePossibility();
        }

        System.out.println("\n************инженерные роботы*******************");

        RobotEngineer[] exhibitionEngineers = {robotBuilder, robotSapper};
        for (RobotEngineer r : exhibitionEngineers) {
            r.createItem();
            r.uniquePossibility();
        }

        System.out.println("\n************роботы саперы*******************");
        RobotSapper[] exhibitionSappers = {robotSapper};
        for (RobotSapper s : exhibitionSappers) {
            s.fixRobot();
            s.robotOnOff(true);
            s.uniquePossibility();
        }


    }
}
