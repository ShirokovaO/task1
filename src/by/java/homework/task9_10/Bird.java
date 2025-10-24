package by.java.homework.task9_10;

public class Bird extends Animal {
    //    Определить поля в классе Птица: семейство, максимальная высота полёта. В классе птица методы-петь, клевать, высиживать птенцов.
//При этом, в консоли должны выводиться поля семейства птиц с соответствующим поведением (пример: Воробей поёт).
    private String family;
    private int hightOfFlight;

    public Bird(String color, int life, String foodType, String family, int hightOfFlight) {
        super(color, life, foodType);
        this.family = family;
        this.hightOfFlight = hightOfFlight;
    }

    public String info() {
        return " семейство: " + family + " высота полета: " + hightOfFlight + super.info();
    }

    public void soundProduction() {
        System.out.println(family + " поет");
    }

    public void animalPlaying() {
        System.out.println(family + " играет");
    }

    public void peck(String family) {
        System.out.println(family + " клюет");
    }

    public void hatchEggs(String family) {
        System.out.println(family + " высиживает яйца");
    }


    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getHightOfFlight() {
        return hightOfFlight;
    }

    public void setHightOfFlight(int hightOfFlight) {
        this.hightOfFlight = hightOfFlight;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Bird)) {
            return false;
        }
        Bird bird = (Bird) obj;
        if (hightOfFlight == bird.getHightOfFlight()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int result = hightOfFlight + family.hashCode() + super.getColor().hashCode() + super.getLife();
        return result;
    }
}
