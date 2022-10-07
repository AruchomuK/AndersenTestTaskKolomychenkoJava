import java.util.Scanner;

// 3. Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите числа через пробел: ");

        String enteredNumbersArray = in.nextLine();

        String[] stringNumbers = enteredNumbersArray.split(" ");

        System.out.print("Числа, кратные 3: ");

        for (int i = 0; i < stringNumbers.length; i++) {
            int currentNumber = Integer.parseInt(stringNumbers[i]);

            if (currentNumber % 3 == 0) {
                System.out.print(currentNumber + " ");
            }
        }
    }
}
