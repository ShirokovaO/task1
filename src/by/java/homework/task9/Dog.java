package by.java.homework.task9;

public class Dog extends Animal {
//    В классе собака определить имя, порода, средний вес. В классе Собака реализовать методы: лаять, кусать, бегать, играть, прыгать. При этом, в консоли должны выводится имя собаки вместе с описанием действия (пример. Рекс прыгает).
    private String name;
    private String breed;
    private int weight;

    public Dog(String color,int life, String foodType, String name, String breed, int weight){
        super(color, life, foodType);
        this.name=name;
        this.breed=breed;
        this.weight=weight;
    }
    public void soundProduction(){
        System.out.println(name + " лает");
    }

    public void dogBites(String name){
        System.out.println( name + " кусается");
    }

    public void dogJump (String name){
        System.out.println(name + " прыгает");
    }

    public void dogPlay (){
        System.out.println(name + " играет");
    }

    public void animalPlaying(){
        System.out.println("Собака играет");
    }

    public String info(){
        return " имя: " + name + " порода: " + breed + " средний вес: " + weight + super.info();
    }

//    @Override
//    public String toString() {
//        return " Dog{" +
//                "name='" + name + '\'' +
//                ", breed='" + breed + '\'' +
//                ", weight=" + weight + super.toString() +
//                '}';
//    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}
