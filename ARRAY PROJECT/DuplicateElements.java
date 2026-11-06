public class DuplicateElements {

    void detect(int[][] arr) {

        System.out.println("\n--- DUPLICATE ELEMENTS ---");

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                for (int k = 0; k < arr.length; k++) {
                    for (int l = 0; l < arr[k].length; l++) {

                        if (arr[i][j] == arr[k][l] &&
                            (i < k || (i == k && j < l))) {

                            System.out.println("Duplicate: " + arr[i][j]);
                            System.out.println("First Coordinate: [" + i + "][" + j + "]");
                            System.out.println("Second Coordinate: [" + k + "][" + l + "]");
                            System.out.println();

                            found = true;
                        }
                    }
                }
            }
        }

        if (found == false) {
            System.out.println("No duplicates found.");
        }
    }
}