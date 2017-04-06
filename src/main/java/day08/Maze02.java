package day08;

import java.util.Scanner;

/**
 * Created by HWOLF on 2017/3/24.
 */
public class Maze02 {
    public static void main(String[] args) {
        System.out.println("Please enter maze row:");
        Scanner scannerRow = new Scanner(System.in);
        int row = scannerRow.nextInt();
        System.out.println("Please enter maze column:");
        Scanner scannerCol = new Scanner(System.in);
        int column = scannerCol.nextInt();
        CreateMaze(row, column);
    }

    public static void CreateMaze(int row, int col) {
        int[][] maze = new int[row][col];
        System.out.println("Please enter point.");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                Scanner scannerPoint = new Scanner(System.in);
                int point = scannerPoint.nextInt();
                maze[i][j] = point;
            }
        }

        int[][] copyMaze = new int[row+2][col+2];
        for (int i = 0; i < row + 2; i++) {
            for (int j = 0; j < col + 2; j++) {
                copyMaze[i][j] = 1;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                copyMaze[i+1][j+1] = maze[i][j];
            }
        }

    }
}
