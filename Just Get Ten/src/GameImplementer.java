import java.util.Scanner;


public class GameImplementer {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Matrix m=new Matrix(5, 5, 3);
		for(;;){
			m.displayBoard();
			int row,column;
			row=s.nextInt();
			column=s.nextInt();
			s.nextLine();
			m.play(row, column);
		}
	}

}
/*

	public void displayBoard() {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
	}*/
