import java.util.Random;

public class Task5 {

    //Дан массив. Напечатать:
    //все неотрицательные элементы
    //все элементы, не превышающие число 100

    public static void main(String[] args) {

        Random r = new Random();
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(-1000, 1000);
            System.out.print(array[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0 && array[i] < 100) {
                System.out.print(array[i] + " ");
            }
        }

    }
}
