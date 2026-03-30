import org.w3c.dom.ls.LSOutput;

import java.io.*;

//Завдання 2
//Створіть файл, запишіть у нього довільні дані та закрийте файл. Потім знову відкрийте цей файл, прочитайте дані і
//виведіть їх на консоль.
public class Main {
    private static final String fileName = "C:\\Users\\VasylZablotskyi\\OneDrive - Norwegian Refugee Council\\Documents\\Courses\\Java\\Java courses from CyberBionic\\JavaWithCyberBionicHomework\\JavaPro\\CyberBionic_JavaPro_03_IO_NIO_homework\\data.txt";

    public static void main(String[] args) {
        fileWriter(fileName);
        fileReader(fileName);
    }

    public static void fileWriter(String fileName){
        try (FileWriter writer = new FileWriter(fileName)) {
            for (int i = 0; i < 10; i++) {
                writer.write("Рядок " + i + "\n");
            }
            System.out.println("Дані у файл записані успішно!");
        } catch (IOException e) {
            System.out.println("Помилка запису у файл: " + e.getMessage());
        }
    }

    public static void fileReader(String fileName) {
        System.out.println("Читаємо файл!");
        System.out.println("Вміст файлу " + fileName + ":");

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Помилка читання з файлу: " + e.getMessage());
        }
    }
}
