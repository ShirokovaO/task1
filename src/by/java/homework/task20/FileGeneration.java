package by.java.homework.task20;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class FileGeneration implements Callable<List<String>> {

    private String name;

    public FileGeneration(String name) {
        this.name = name;
    }

    @Override
    public List<String> call() throws Exception {
        System.out.println(name + " start");
        List<String> generatedFileNames = new ArrayList<>();
        Random randomText = new Random();
        String fileName;

        for (int i = 0; i < 10; i++) {
            fileName = "File_" + name + (i + 1) + ".text";
            List<String> lines = new ArrayList<>();
            for (int l = 0; l < 10; l++) {
                lines.add("\n random text" + randomText.nextInt(1000));
            }
            File file = new File(fileName);
            try (FileWriter fileWriter = new FileWriter(file)) {
                fileWriter.write(String.valueOf(lines));
            }
            generatedFileNames.add(fileName);
        }
        Thread.sleep(10000);
        System.out.println(name + " " + generatedFileNames);
        return generatedFileNames;
    }

}
