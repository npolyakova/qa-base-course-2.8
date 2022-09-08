public class Task11 {

    //Дан двумерный массив.
    //поменять местами первую и третью строки
    //поменять местами второй и последний столбцы

    public static void main(String[] args) {
        String[][] things = new String[][]{
                {"table" ,"hat", "pancake", "apple"}, //0,0 0,1 0,2 0,3
                {"pear", "pencil", "stick", "pen"},   //1,0 1,1 1,2 1,3
                {"a", "b", "c", "d"}                  //2,0 2,1 2,2 2,3
        };

        int raws = things.length;
        int cols = things[0].length;

        String[][] thingsCopy = new String[raws][cols];

        for (int i = 0; i<raws; i++){
            for (int j = 0; j<cols; j++){
                if(i == 0){
                    thingsCopy[i][j] = things[raws-1][j];
                }
                else if(i == (raws-1)){
                    thingsCopy[i][j] = things[0][j];
                }
                else {
                    thingsCopy[i][j] = things[i][j];
                }
            }
        }

        for (int i = 0; i<raws; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(thingsCopy[i][j] + " ");
            }
            System.out.println();
        }
    }
}
