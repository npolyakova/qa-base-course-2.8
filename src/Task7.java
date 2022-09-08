import java.util.Random;

public class Task7 {

    //Дан массив. Поменять местами:
    //второй и пятый элементы;
    //третий и максимальный элементы. Если элементов с максимальным значением несколько, то в обмене должен участвовать первый из них.

    public static void main(String[] args) {
        Random r = new Random();
        int size = r.nextInt(5,10);
        int[] array = new int[size];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt( 100);
            if (array[i] > max) {
                max = array[i];
            }
            System.out.print(array[i] + " ");
        }

        int secondElement = array[1];
        array[1] = array[4];
        array[4] = secondElement;

        int thirdElement = array[2];

        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                array[2] = array[i];
                array[i] = thirdElement;
                break;
            }
        }

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
