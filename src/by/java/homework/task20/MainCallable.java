package by.java.homework.task20;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainCallable {
    //    1. Создать задачу Callable, которая генерирует 10 файлов с 10 произвольными строками -> засыпает произвольно на 1-3 секунды, результат выполнения –коллекция имен файлов. Запустить 10 задач параллельно в пуле из 3 потоков. Вывести ход программы на экран с указанием имени потока, который выполняет работу.
    static void main() {


        FileGeneration fileGeneration = new FileGeneration("first");
        FileGeneration fileGeneration1 = new FileGeneration("second");
        FileGeneration fileGeneration2 = new FileGeneration("third");


        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Future<List<String>> future1 = executorService.submit(fileGeneration1);
        Future<List<String>> future2 = executorService.submit(fileGeneration2);
        Future<List<String>> future3 = executorService.submit(fileGeneration);

        executorService.shutdown();


    }
}
