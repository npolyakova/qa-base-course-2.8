import java.util.Random;

public class Task4 {

    //Дан массив. Все его элементы:
    //увеличить в 2 раза
    //уменьшить на число А
    //разделить на первый элемент.
    public static void main(String[] args) {
        Random r = new Random();
        int size = r.nextInt(3,10);
        int[] array = new int[size];
        int a = r.nextInt(10);
        System.out.println("А = " + a);

        for (int i = 0; i < size; i++) {
            array[i] = r.nextInt(1, 20);
            System.out.print(array[i] + " ");
        }

        System.out.println();

        int firstNumber = array[0];

        for (int i = 0; i < size; i++) {
            array[i] *= 2;
            array[i] -= a;
            array[i] /= firstNumber;
            System.out.print(array[i] + " ");
        }
    }
}
