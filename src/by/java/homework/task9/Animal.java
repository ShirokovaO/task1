package by.java.homework.task9;

public abstract class Animal {
//    Поля в классе животное: окрас, максимальная продолжительность жизни, тип еды которой питаются (мясо, насекомые, растения).Определить методы в классе животное: (издание звуков, животное играет)
//    Использовать наследование, где суперкласс-Животное. Переопределить методы, которые есть в родительском классе животное (издание звуков, животное играет)  в классах Собака и Птица.

    private String color;
    private int life;
    private String foodType;
    private int id;

    public Animal(String color,int life, String foodType){
        this.color=color;
        this.life=life;
        this.foodType=foodType;
    }

    public abstract void soundProduction();
    public abstract void animalPlaying();

//    @Override
//    public String toString() {
//        return " Animal{" +
//                "color='" + color + '\'' +
//                ", life=" + life +
//                ", foodType='" + foodType + '\'' +
//                '}';
//    }

    public String  info(){
        return " окрас: " + color + " продолжительность жизни: " + life + " чем питается: " + foodType;
    }

    public String getColor () {
        return color;
    }
    public void setColor (String color){
        this.color=color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
