package by.java.homework.task19;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MainStream {
    //    1 Создать интерфейс, который будет обрабатывать входящий параметр типа String.
//1.1 На основании этого интерфейса создать лямбда выражение, которое будет возвращать строку с большими буквами.
//2. Создать класс Город. Поля id, имя города, население, континент (Enum)
//1.1. Создать города
    static void main() {
        String resultModifyText = modifyText((str) -> str.toUpperCase(), "text we should modify to uppercase");
        System.out.println(resultModifyText);


        City newYork = new City(11, "New York", 9000000, Continent.NORTH_AMERICA);
        City chicago = new City(12, "Chicago", 3000000, Continent.NORTH_AMERICA);
        City minsk = new City(22, "Minsk", 1800000, Continent.EURASIA);
        City sanPaulo = new City(31, "San Paolo", 11000000, Continent.SOUTH_AMERICA);
        City shanghai = new City(21, "Shanghai", 34000000, Continent.EURASIA);
        City sidney = new City(23, "Vitebsk", 300000, Continent.EURASIA);
        City rioDeJaneiro = new City(32, "Rio De Janeiro", 6700000, Continent.SOUTH_AMERICA);

        List<City> cities = List.of(newYork, chicago, shanghai, sanPaulo, sidney, minsk, rioDeJaneiro);

        //1.2. Найти самый густонаселённый город на континенте (filter по континенту+ max)
        System.out.println("********************Город, с максимальным населением на континенте***************");
        Optional<City> cities1 = cities.stream().filter(city -> city.getCONTINENT().equals(Continent.NORTH_AMERICA)).max(Comparator.comparing(City::getPopulation));
        if (cities1.isPresent()) {
            System.out.println(cities1.get());
        }

        //1.3. Найти город, с минимальным населением на континенте. (filter по континенту+ min)
        System.out.println("********************Город, с минимальным населением на континенте***************");
        Optional<City> cities2 = cities.stream().filter(city -> city.getCONTINENT().equals(Continent.EURASIA)).min(Comparator.comparing(City::getPopulation));
        if (cities2.isPresent()) {
            System.out.println(cities2.get());
        }

        //1.4. Найти самый густонаселённый город (max)
        System.out.println("********************Самый густонаселённый город***************");
        Optional<City> cities3 = cities.stream().max(Comparator.comparing(City::getPopulation));
        cities3.ifPresent(System.out::println);

        //1.5. Найти город с самым маленьким населением. (min)
        System.out.println("********************Город с самым маленьким населением***************");
        Optional<City> cities4 = cities.stream().min(Comparator.comparing(City::getPopulation));
        cities4.ifPresent(System.out::println);

        //1.6. Найти первый попавшийся город, у которого население больше 10млн. (filter + findFirst).
        System.out.println("********************Первый попавшийся город, у которого население больше 10млн.***************");
        City firstMaxCity = cities.stream().filter(city -> city.getPopulation() > 10000000).findFirst().orElseThrow();
        System.out.println(firstMaxCity);

        //1.7. Отобрать города с населением больше 5 млн. (filter)
        System.out.println("********************Города с населением больше 5 млн***************");
        List<City> cities6 = cities.stream().filter(city -> city.getPopulation() > 5000000).toList();
        System.out.println(cities6);

        //1.8. Создать коллекцию из названий городов, на основании объектов (map)
        System.out.println("********************Названия городов***************");
        List<String> cities7 = cities.stream().map(City::getName).distinct().toList();
        System.out.println(cities7);

    }

    public static String modifyText(ModifyString modifyString, String value) {
        return modifyString.modifyText(value);
    }
}

