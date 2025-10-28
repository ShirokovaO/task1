package by.java.homework.task9_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {
//    1.3 Создать класс Зоопарк в котором будут жить наши животные. В качестве поля в новом классе будет массив из животных (private Animal[]animals).
//1.4 Реализовать метод в классе зоопарк по добавлению нового животного. Сигнатура метода будет такая: public void addAnimal(Animal animal); Данный метод должен будет скопировать текущий массив с животными в новый массив с животными. Размерность нового массива должна увеличиться на 1, так как метод добавляет новое животное. Полученный массив нужно перезаписать в поле animals в классе Зоопарк.
//1.5 Реализовать метод getAnimals в классе зоопарк который будет возвращать всех животных в зоопарке.
//1.6 Используя метод по добавлению животного в зоопарк (п.1.4) добавить по три собаки и по три птицы. (Выполнять это в методе Main, создав соответствующие объекты зоопарка, птиц, собак и т.д.)
// 1.7 Получить всех животных из зоопарка. Пройтись по всем животным в зоопарке и вызвать методы (издание звуков, животное играет). У вас должны вывестись соответствующие реализации для 3 собак и для трёх птиц(Выполнять это в методе Main)

    private Animal[] animals = new Animal[1];

    public void addAnimal(Animal animal) {
        if (animals[0] == null) {
            animals[0] = animal;
        } else {
            Animal[] newAnimals = new Animal[animals.length + 1];
            for (int i = 0; i < animals.length; i++) {
                newAnimals[i] = animals[i];
            }
            newAnimals[animals.length] = animal;
            animals = newAnimals;
        }
    }

    public void getAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal.info());
            animal.animalPlaying();
            animal.soundProduction();
        }
    }

    //1.9* Добавить поле в класс животное называемое номер (id). Присвоить уникальный номер каждому животному в зоопарке, увеличивая значение на единицу. Реализуйте метод, который будет выводить все информацию о каждом животном в зоопарке.  Реализовать метод по удалению животного из зоопарка по номеру (id). Вывести информацию о все у животных в зоопарке.
//    Animal[] zoo = new Animal[animals.length];

    public void assignIdToAnimal() {
        int i = 1;
        for (Animal animal : animals) {
            animal.setId(i);
            i++;
            System.out.println("id: " + animal.getId() + animal.info());
        }
    }

    public void excludeAnimal(int id) {
        for (int s=0; s<animals.length; s++){
            List<Animal> newZoo = new ArrayList<>(Arrays.asList(animals));
            if(id==animals[s].getId()){
                newZoo.remove(s);
            }
            animals=newZoo.toArray(new Animal[newZoo.size()]);
        }
        for (Animal animal : animals) {
            System.out.println("id: " + animal.getId() + animal.info());
        }
    }


}
