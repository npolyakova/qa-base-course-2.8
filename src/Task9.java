import java.util.Random;
import java.util.Scanner;

public class Task9 {

    //Дан двумерный массив из m строк и n столбцов.
    //Заполнить его значениями, вводимыми с консоли.
    //Заполнение проводить по строкам, начиная с первой (а в ней — начиная с первого элемента).

    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int m = r.nextInt(2,5);
        int n = r.nextInt(2,5);
        int[][] array2d = new int[m][n];

        System.out.printf("Заполните массив из %d строк и %d столбцов\n", m, n);

        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                array2d[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                System.out.print(array2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}
