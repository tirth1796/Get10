import java.util.Random;

public class Matrix {
    private int row, column;
    private int[][] grid;
    private int maxInt;
    private Random r = new Random();
    int value=0;
    private boolean onPlay = false;

    public Matrix(int row, int column, int maxInt) {
        this.row = row;
        this.column = column;
        this.maxInt = maxInt;
        grid = new int[row][column];
        initializeBoard();
    }


    public int[][] getGrid() {
        return grid;
    }

    boolean play(int row, int column) {
        if (onPlay) {
        	System.out.println("on play");
            if (grid[row][column] == 0) {
            	System.out.println("playing");
                onPlay = false;
                grid[row][column] = this.value + 1;
                generateRandom();
                if (this.value == maxInt) {
                    maxInt = this.value + 1;
                }
                return true;
            } else {
                for (int i = 0; i < this.row; i++) {
                    for (int j = 0; j < this.column; j++) {
                        if (grid[i][j] == 0) {
                            grid[i][j] = this.value;
                        }
                    }

                }
            }
        }
        System.out.println("not on play");
        boolean decide = false;
        int value = grid[row][column];
        this.value=value;
        decide = decide || playTile(row - 1, column, value);
        decide = decide || playTile(row + 1, column, value);
        decide = decide || playTile(row, column - 1, value);
        decide = decide || playTile(row, column + 1, value);
        System.out.println(decide);
        onPlay=decide;
        if (decide) {
            grid[row][column] = 0;
            return true;
        }
        return false;
    }

    boolean playTile(int row, int column, int value) {
        if (row >= this.row || column >= this.column || row < 0 || column < 0) {
            return false;
        } else if (grid[row][column] != value) {
            return false;
        } else {
            if (grid[row][column] <= 0) {
                grid[0][0]--;
            } else {
                grid[row][column] = 0;
            }
            playTile(row - 1, column, value);
            playTile(row + 1, column, value);
            playTile(row, column - 1, value);
            playTile(row, column + 1, value);
        }
        return true;
    }

    void generateRandom() {


        // nullify 0s
        for (int j = grid.length - 1; j >= 0; j--) {
            for (int i = 0; i < grid.length; i++) {
                if (grid[j][i] == 0) {
                    boolean temp = false;
                    for (int j2 = j - 1; j2 >= 0; j2--) {
                        if (grid[j2][i] != 0) {
                            temp = true;
                            grid[j][i] = grid[j2][i];
                            grid[j2][i] = 0;
                            break;
                        }
                    }
                    if (!temp) {
                        grid[0][i] = r.nextInt(maxInt) + 1;
                        for (int j2 = j - 1; j2 >= 0; j2--) {
                            if (grid[j2][i] != 0) {
                                temp = true;
                                grid[j][i] = grid[j2][i];
                                grid[j2][i] = 0;
                                break;
                            }
                        }
                    }
                }
            }
        }


    }

    public void initializeBoard() {
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                grid[i][j] = r.nextInt(maxInt) + 1;
            }
        }
    }

    public void displayBoard() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

}
