import java.util.Random;

public class Task2 {
    //Используя датчик случайных чисел, заполнить массив из двадцати элементов неповторяющимися числами.

    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10);
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]){
                    while (array[i] == array[j]) {
                        array[i] = r.nextInt( 10);
                    }
                    j = 0;
                    i = 0;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
