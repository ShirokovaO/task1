package by.java.homework.task19;

public enum Continent {

    EURASIA("Евразия"),
    SOUTH_AMERICA("Южная Америка"),
    NORTH_AMERICA("Северная Америка"),
    AFRICA("Африка"),
    AUSTRALIA("Австралия"),
    ANTARCTICA("Антарктида");

    private String nameOfContinent;

    Continent(String nameOfContinent) {
        this.nameOfContinent = nameOfContinent;
    }

    @Override
    public String toString() {
        return nameOfContinent;
    }

    public String getNameOfContinent() {
        return nameOfContinent;
    }
}
