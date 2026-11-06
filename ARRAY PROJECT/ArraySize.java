import java.util.Scanner;

public class ArraySize {
    int rows;
    int cols;

    void input(Scanner input) {
        System.out.print("Enter number of rows: ");
        rows = input.nextInt();

        System.out.print("Enter number of columns: ");
        cols = input.nextInt();
    }
}