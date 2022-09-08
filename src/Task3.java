import java.util.Random;
import java.util.Scanner;

public class Task3 {

    //Дан массив. Составить программу:
//    - расчета квадратного корня из любого элемента массива;
//    - расчета среднего арифметического двух любых элементов массива
//
//    Предусмотреть возможность ошибочных обращений вне границ массива.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Введите размер массива");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = r.nextInt(20);
        }

        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        //расчет квадратного корня из любого элемента массива;

        System.out.println("Введите порядковый номер массива для подсчета корня");
        int index = sc.nextInt();
        if (index < 0 || index >= size) {
            System.out.println("Введен некорректный номер");
        }
        System.out.println(Math.sqrt(numbers[index]));

        //расчет среднего арифметического двух любых элементов массива
        System.out.println("Порядковые номера массива для подсчета ср. арифметического");
        int a = r.nextInt(size);
        int b = r.nextInt(size);
        System.out.println(a + "," + b);
        System.out.println((numbers[a] + numbers[b]) / 2.0);
    }
}
