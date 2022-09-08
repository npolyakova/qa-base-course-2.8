import java.util.Random;

public class Task6 {

    //Дан массив. Определить:
    //максимальный элемент
    //минимальный элемент
    //на сколько максимальный элемент больше минимального
    //индекс максимального элемента
    //индекс минимального элемента

    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(0, 100);
            System.out.print(array[i] + " ");
        }

        int max = array[0];
        int maxIndex = 0;
        int minIndex = 0;
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }

        System.out.println("\nMax = " + max + " Index = " + maxIndex);
        System.out.println("Min = " + min + " Index = " + minIndex);
        System.out.println("Max > min на " + (max - min));
    }
}
