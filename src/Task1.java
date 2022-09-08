import java.util.Scanner;

public class Task1 {

    //Заполнить массив из десяти элементов значениями, вводимыми с клавиатуры в ходе выполнения программы.

    public static void main(String[] args) {
        String[] array = new String[10]; //0, 1, 2, 3, 4, 5, 6, 7, 8, 9

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            array[i] = sc.next();
        }

        sc.close();

        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }

        //array = {2, 3, 4, 1, 2, 7, 8, 4, 5, 6}
    }
}
