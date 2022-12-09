//public class Field{
class Field {

    private int[][] arr;

    public Field(int sizeX, int sizeY) {
        arr = new int[sizeX][sizeY];
    }

    public int[][] getArr() {
        return arr;
    }


    public int changeCount(int a, int b) {
        return arr[a][b] += 1;
    }

    public void setArrIndex(int a, int b, int count) {
        arr[a][b] = count;
    }

    private int[][] putWalls(int[][] field) {
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

    public void fillField() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = -1;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (i > 0 && i < arr.length - 1) {
                    if (j == 1 || j < arr.length - 1) {
                        arr[i][j] = 0;
                    }
                }
            }
        }

        arr = putWalls(arr);
    }
}
