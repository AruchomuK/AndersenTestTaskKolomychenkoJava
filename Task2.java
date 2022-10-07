import java.util.Scanner;

// 2. Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”,
// если нет, то вывести "Нет такого имени"

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите имя: ");

        String enteredName = in.nextLine();
        String desirableName = "Вячеслав";

        if (enteredName.equals(desirableName)) {
            System.out.println("Привет, " + desirableName);
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
