package by.java.homework.task9;

public class Lion extends Animal {
//    Добавить класс Лев. Лев наследуется от животного. Переопределите в нем методы, которые есть в классе Животное (издание звуков, животное играет), с указанием, что это все делает лев (пример Лев играет). Создайте пару львов и выведите их поведение в консоль. Добавить трех львов в зоопарк.
    private String type;

    public Lion (String color,int life, String foodType, String type){
        super(color, life,foodType);
        this.type = type;
    }

    public String info(){
        return " тип зверя: " + type + super.info();
    }

    public void animalPlaying(){
        System.out.println(type + " играет");
    }

    public void soundProduction(){
        System.out.println(type + " рычит");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
