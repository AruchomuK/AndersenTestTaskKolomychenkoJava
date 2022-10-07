import java.util.Scanner;

// 1. Составить алгоритм: если введенное число больше 7, то вывести “Привет”

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");

        int enteredNumber = in.nextInt();

        if (enteredNumber > 7) {
            System.out.println("Привет");
        }
    }
}
