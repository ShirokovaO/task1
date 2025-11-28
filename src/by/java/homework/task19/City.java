package by.java.homework.task19;

public class City {
    //2. Создать класс Город. Поля id, имя города, население, континент (Enum)
    private int id;
    private String name;
    private int population;
    private Enum CONTINENT;


    public City(int id, String name, int population, Enum CONTINENT) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.CONTINENT = CONTINENT;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", population=" + population +
                ", CONTINENT=" + CONTINENT.toString() +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Enum getCONTINENT() {
        return CONTINENT;
    }

    public void setCONTINENT(Enum CONTINENT) {
        this.CONTINENT = CONTINENT;
    }
}
