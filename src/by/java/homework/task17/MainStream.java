package by.java.homework.task17;

import java.io.*;

public class MainStream {
    //    Дан текст: The Rostóvs knew everybody in Moscow. The old count had money enough that year, as all his estates had been remortgaged, and so Nicholas, acquiring a trotter of his own, very stylish riding breeches of the latest cut, such as no one else yet had in Moscow, and boots of the latest fashion, with extremely pointed toes and small silver spurs, passed his time very gaily. After a short period of adapting himself to the old conditions of life, Nicholas found it very pleasant to be at home again. He felt that he had grown up and matured very much. His despair at failing in a Scripture examination, his borrowing money from Gavríl to pay a sleigh driver, his kissing Sónya on the sly—he now recalled all this as childishness he had left immeasurably behind. Now he was a lieutenant of hussars, in a jacket laced with silver, and wearing the Cross of St. George, awarded to soldiers for bravery in action, and in the company of well-known, elderly, and respected racing men was training a trotter of his own for a race. He knew a lady on one of the boulevards whom he visited of an evening. He led the mazurka at the Arkhárovs’ ball, talked about the war with Field Marshal Kámenski, visited the English Club, and was on intimate terms with a colonel of forty to whom Denísov had introduced him.
    //1.1 Записать его в файл,  прописав относительный путь. Реализуйте соответствующий метод в классе Main.
//1.2 Записать его в файл прописав абсолютный путь. Реализуйте соответствующий метод в классе Main
//1.3 Вычитать текст из первого файла. Реализуйте соответствующий метод в классе Main
//1.4 Вычитать текст из второго файла Реализуйте соответствующий метод в классе Main
//2.1 Создать объект Автомобиль с полями (Марка автомобиля, максимальная скорость, страна производства). Переопределите метод toString(), equals(), hashcode(), гетеры и сетеры (генерируйте с помощью идеи). В классе Main создать объект автомобиль. Выполнить сериализацию объекта. Реализуйте соответствующий метод в классе Main
//2.2 Выполнить десериализацию автомобиля и вывести его в консоли. Реализуйте соответствующий метод в классе Main
    static void main() {
        writeRelative();
        readRelative();
        writeAbs();
        readAbs();
        Automobile auto = new Automobile("BMW", 300, "Germany");
        String pathAuto = "fileAuto.txt";
        serialize(auto, pathAuto);
        deserialize(pathAuto);


    }

    static void writeRelative() {
        File file1 = new File("TextRelative.txt");
        try (FileWriter fileWriter = new FileWriter(file1)) {
            fileWriter.write("The Rostóvs knew everybody in Moscow. The old count had money enough that year, as all his estates had been remortgaged, and so Nicholas, acquiring a trotter of his own, very stylish riding breeches of the latest cut, such as no one else yet had in Moscow, and boots of the latest fashion, with extremely pointed toes and small silver spurs, passed his time very gaily. After a short period of adapting himself to the old conditions of life, Nicholas found it very pleasant to be at home again. He felt that he had grown up and matured very much. His despair at failing in a Scripture examination, his borrowing money from Gavríl to pay a sleigh driver, his kissing Sónya on the sly—he now recalled all this as childishness he had left immeasurably behind. Now he was a lieutenant of hussars, in a jacket laced with silver, and wearing the Cross of St. George, awarded to soldiers for bravery in action, and in the company of well-known, elderly, and respected racing men was training a trotter of his own for a race. He knew a lady on one of the boulevards whom he visited of an evening. He led the mazurka at the Arkhárovs’ ball, talked about the war with Field Marshal Kámenski, visited the English Club, and was on intimate terms with a colonel of forty to whom Denísov had introduced him.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    static void readRelative() {
        try (FileReader fileReader = new FileReader("TextRelative.txt")) {
            System.out.println(fileReader.readAllLines());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void writeAbs() {
        File file2 = new File("/Users/olya_sh/Documents/homework_files/", "TextAbs.txt");
        try (FileWriter fileWriter = new FileWriter(file2)) {
            fileWriter.write("The Rostóvs knew everybody in Moscow. The old count had money enough that year, as all his estates had been remortgaged, and so Nicholas, acquiring a trotter of his own, very stylish riding breeches of the latest cut, such as no one else yet had in Moscow, and boots of the latest fashion, with extremely pointed toes and small silver spurs, passed his time very gaily. After a short period of adapting himself to the old conditions of life, Nicholas found it very pleasant to be at home again. He felt that he had grown up and matured very much. His despair at failing in a Scripture examination, his borrowing money from Gavríl to pay a sleigh driver, his kissing Sónya on the sly—he now recalled all this as childishness he had left immeasurably behind. Now he was a lieutenant of hussars, in a jacket laced with silver, and wearing the Cross of St. George, awarded to soldiers for bravery in action, and in the company of well-known, elderly, and respected racing men was training a trotter of his own for a race. He knew a lady on one of the boulevards whom he visited of an evening. He led the mazurka at the Arkhárovs’ ball, talked about the war with Field Marshal Kámenski, visited the English Club, and was on intimate terms with a colonel of forty to whom Denísov had introduced him.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    static void readAbs() {
        try (FileReader fileReader = new FileReader("/Users/olya_sh/Documents/homework_files/TextAbs.txt")) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println(bufferedReader.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void serialize(Automobile auto, String fileAuto) {

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("fileAuto.txt"))) {
            objectOutputStream.writeObject(auto);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static Automobile deserialize(String fileAuto) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("fileAuto.txt"))) {
            Automobile autoGetFromFile = (Automobile) objectInputStream.readObject();
            System.out.println(autoGetFromFile);
            return autoGetFromFile;
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
