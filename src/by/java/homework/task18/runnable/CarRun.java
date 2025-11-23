package by.java.homework.task18.runnable;


public class CarRun implements Runnable {
    //    1.Создать класс авто. Поля в классе будут: имя машины, гос. номер, время остановки. Определить в нём метод, при котором авто будет просто ехать (выводить в консоль сообщение в цикле).
    private String model;
    private String registrationPlate;
    private long timeOfStop;

    public CarRun(String model, String registrationPlate, long timeOfStop) {
        this.model = model;
        this.registrationPlate = registrationPlate;
        this.timeOfStop = timeOfStop;
    }

    public CarRun(String model, String registrationPlate) {
        this.model = model;
        this.registrationPlate = registrationPlate;
    }

    public void autoMoving() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.println("The car " + model + " is moving");
            Thread.sleep(1000);
            Thread.yield();
        }
    }

    public void autoMoving2() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.println("The car " + model + " is moving");
            Thread.sleep(getTimeOfStop());
            carStopInTime(getModel());
            Thread.yield();
        }
    }

    public void carStart(String model) {
        System.out.println("car " + model + " started moving");
    }

    public void carStopInTime(String model) {
        System.out.println("car " + model + " stopped in " + getTimeOfStop() + " miliseconds");
    }

    public void carStop(String model) {
        System.out.println("car " + model + " stopped");
    }

    @Override
    public void run() {
        try {
            carStart(getModel());
            if (getTimeOfStop() == 0) {
                autoMoving();
                carStop(getModel());
            } else autoMoving2();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistrationPlate() {
        return registrationPlate;
    }

    public void setRegistrationPlate(String registrationPlate) {
        this.registrationPlate = registrationPlate;
    }

    public long getTimeOfStop() {
        return timeOfStop;
    }

    public void setTimeOfStop(long timeOfStop) {
        this.timeOfStop = timeOfStop;
    }
}
