public class Task8 {
    //Дан двумерный массив.
    //Вывести на экран элемент, расположенный в правом верхнем углу массива
    //Вывести на экран элемент, расположенный в левом нижнем углу массива

    public static void main(String[] args) {
        char[][] array2d = new char[][] {
                {'e', 'r', '3'},
                {'d', 's', 'q'},
        };

        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                System.out.print(array2d[i][j] + " ");
            }
            System.out.println();
        }
        int l = array2d[0].length;
        System.out.println("Правый верхний элемент " + array2d[0][l-1]);
        int lStr = array2d.length;
        System.out.println("Левый нижний элемент " + array2d[lStr-1][0]);
    }
}
