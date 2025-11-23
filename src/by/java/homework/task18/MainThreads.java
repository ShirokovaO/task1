package by.java.homework.task18;

import by.java.homework.task18.runnable.CarRun;

public class MainThreads {
    //    1.Создать класс авто. Поля в классе будут: имя машины, гос. номер, время остановки. Определить в нём метод, при котором авто будет просто ехать (выводить в консоль сообщение в цикле).
//1.1 Создать два потока (две машины которые будут ехать параллельно). Потоки запускайте в классе Main. Выносите методы в private static void согласно заданиям.
//1.2 Дать возможность каждой машине останавливаться на определённое время. (метод sleep). Передавать в конструктор параметр по остановке, которое будет записываться в поле (время остановки). В последствии поток будет спать переданное время.
//1.3 Запустить три потока с машинами. При этом 2 машины начнут двигаться только после того, как 1 машина прекратит езду (прекратит выполнение потока) (метод join)
//1.4 Сделать задачу 1.1 и 1.2 через интерфейс Runnable. Для этого создайте в пакете с домашнем заданием, пакет с названием runnable.  В этом пакете реализуйте (скопируйте) класс Авто с последующем изменением.
    static void main() throws InterruptedException {
        parallelMovement();
        sleep();
        treeThreads();
        runnableParallelMovement();
        runnableSleep();
    }

    static void parallelMovement() {
        Car car1 = new Car("BMW", "2134_am");
        Car car2 = new Car("Audi", "0987_pm");
        car1.start();
        car2.start();
    }

    static void sleep() {
        Car car1 = new Car("BMW", "2134_am", 2000);
        Car car2 = new Car("Audi", "0987_pm", 1000);
        car1.start();
        car2.start();
    }

    static void treeThreads() throws InterruptedException {
        Car car1 = new Car("BMW", "2134_am");
        Car car2 = new Car("Audi", "0987_pm");
        Car car3 = new Car("Ford", "4321_ps");
        car1.start();
        car1.join();
        car2.start();
        car3.start();
    }

    static void runnableParallelMovement() {
        CarRun car1 = new CarRun("BMW", "2134_am");
        CarRun car2 = new CarRun("Audi", "0987_pm");
        Thread car1Thread = new Thread(car1);
        Thread car2Thread = new Thread(car2);
        car1Thread.start();
        car2Thread.start();

    }
    static void runnableSleep() {
        CarRun car1 = new CarRun("BMW", "2134_am", 2500);
        CarRun car2 = new CarRun("Audi", "0987_pm", 1000);
        Thread car1Thread = new Thread(car1);
        Thread car2Thread = new Thread(car2);
        car1Thread.start();
        car2Thread.start();

    }

}
