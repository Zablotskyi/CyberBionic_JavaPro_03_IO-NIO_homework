import java.io.BufferedReader;

//Завдання 3
//Необхідно створити рядок із текстом (текст взяти будь-який з інтернету). Розбити цей рядок на 2 підрядки рівної
//довжині та вивести на екран кожну речення з нового рядка.
public class Main {
    private static final String line = "Будь який текст – це подорож";

    public static void main(String[] args) {
//        if (line.length() % 2 == 0) {
//            System.out.println("Ділимо рядок на два однакових підрядки: ");
//            String firstPart = line.substring(0, line.length() / 2);
//            System.out.println("Перший підрядок дорівнює " + firstPart.length() + " символів: ");
//            System.out.println(firstPart);
//            String secondPart = line.substring(line.length() / 2, line.length());
//            System.out.println("Другий підрядок дорівнює " + secondPart.length() + " символів: ");
//            System.out.println(secondPart);
//        } else {
//            System.out.println("Ділимо рядок на два підрядки: ");
//            String firstPart = line.substring(0, line.length() / 2 + 1);
//            System.out.println("Перший підрядок дорівнює " + firstPart.length() + " символів: ");
//            System.out.println(firstPart);
//            String secondPart = line.substring(line.length() / 2 + 1, line.length());
//            System.out.println("Другий підрядок дорівнює " + secondPart.length() + " символів: ");
//            System.out.println(secondPart);
//        }
        lineSplit(line);
    }
    public static void lineSplit(String line) {
        System.out.println("Ділимо рядок на два підрядки: ");
        boolean even = line.length() % 2 == 0;
        int cut = even ? (line.length() / 2) : (line.length() / 2 + 1);
        String firstPart = line.substring(0, cut);
        System.out.println("Перший підрядок дорівнює " + firstPart.length() + " символів: ");
        System.out.println(firstPart);
        String secondPart = line.substring(cut, line.length());
        System.out.println("Другий підрядок дорівнює " + secondPart.length() + " символів: ");
        System.out.println(secondPart);
    }
}
