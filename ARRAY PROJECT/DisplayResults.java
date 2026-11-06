public class DisplayResults {

    void show(int[][] arr, int[] rowSums, int[] colSums) {

        System.out.println("\n--- ARRAY ELEMENTS ---");

        System.out.printf("%-10s", " ");

        for (int j = 0; j < arr[0].length; j++) {
            System.out.printf("%8s", "Col " + j);
        }

        System.out.printf("%10s%n", "Row Sum");

        for (int i = 0; i < arr.length; i++) {

            System.out.printf("%-10s", "Row " + i);

            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%8d", arr[i][j]);
            }

            System.out.printf("%10d%n", rowSums[i]);
        }

        System.out.printf("%-10s", "Col Sum");

        for (int j = 0; j < colSums.length; j++) {
            System.out.printf("%8d", colSums[j]);
        }

        System.out.println();
    }
}
