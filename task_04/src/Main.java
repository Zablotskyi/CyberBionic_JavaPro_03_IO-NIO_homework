import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Завдання 4
//Створіть у пакеті текстовий файл і клас, внесіть у файл якийсь текст.
//Виведіть на екран вміст файлу.
public class Main {
    public static void main(String[] args) {
        String fileName = "text.txt";

        fileWriter(fileName);
        fileReader(fileName);
    }

    private static void fileWriter(String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write("Взимку сонечко не гріє, \n");
            fileWriter.write("Гріти взимку не уміє, \n");
            fileWriter.write("Сили в сонечка нема, \n");
            fileWriter.write("Бо замучила зима.");
            System.out.println("Файл успішно записаний! \n");
        } catch (IOException e) {
            System.out.println("Помилка запису у файл: " + e.getMessage());
        }
    }

    private static void fileReader(String fileName) {
        System.out.println("У файл було записано такий такий вірш: ");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Помилка читання з файлу: " + e.getMessage());
        }
    }
}
