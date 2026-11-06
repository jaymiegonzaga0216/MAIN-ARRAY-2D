import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArraySize size = new ArraySize();
        size.input(input);

        DataEntry entry = new DataEntry();
        int[][] arr = entry.getElements(input, size.rows, size.cols);

        RowSum row = new RowSum();
        int[] rowSums = row.compute(arr);

        ColumnSum column = new ColumnSum();
        int[] colSums = column.compute(arr);

        DisplayResults display = new DisplayResults();
        display.show(arr, rowSums, colSums);

        DuplicateElements duplicates = new DuplicateElements();
        duplicates.detect(arr);

        input.close();
    }
}