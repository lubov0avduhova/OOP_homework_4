//public class Field{
class Field {
    private int[][] walls;
    private int[][] arr;

    public Field(int sizeX, int sizeY) {
        walls = new int[][]{};
        arr = new int[sizeX][sizeY];
    }

    private int[][] putWallsNExits(int[][] field) {
        //exit
        field[1][4] = 0;
        field[4][4] = 0;
        field[4][1] = 0;

        //walls
        field[2][4] = -1;
        field[3][1] = -1;
        field[3][2] = -1;

        return field;
    }

    public void printField() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%3s  ", arr[i][j]);
            }
            System.out.println();
        }
    }

    public int[][] fillField() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = -1;
            }
        }

        int maxIdx = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (i > 0 && i < arr.length - 1) {
                    if (j == 1 || j < arr.length - 1) {
                        arr[i][j] = 1;
                    }
                }
            }
        }

        arr = putWallsNExits(arr);
        return arr;
    }
}
