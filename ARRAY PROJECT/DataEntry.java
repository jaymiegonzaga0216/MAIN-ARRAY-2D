import java.util.Scanner;

public class DataEntry {

    int[][] getElements(Scanner input, int rows, int cols) {

        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                System.out.print("Enter element [" + i + "][" + j + "]: ");
                arr[i][j] = input.nextInt();
            }
        }

        return arr;
    }
}