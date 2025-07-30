public class SpiralPrinting {

    public static void printSpiralPattern(int n) {
        int[][] spiral = new int[n][n];

        int value = 1;
        int minRow = 0;
        int maxRow = n - 1;
        int minCol = 0;
        int maxCol = n - 1;

        while (value <= n * n) {
            for (int i = minCol; i <= maxCol; i++) {
                spiral[minRow][i] = value++;
            }
            minRow++;

            for (int i = minRow; i <= maxRow; i++) {
                spiral[i][maxCol] = value++;
            }
            maxCol--;

            for (int i = maxCol; i >= minCol; i--) {
                spiral[maxRow][i] = value++;
            }
            maxRow--;

            for (int i = maxRow; i >= minRow; i--) {
                spiral[i][minCol] = value++;
            }
            minCol++;
        }

        // Print the spiral pattern with formatting for attraction
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", spiral[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int size = 7; // You can change the size for different spiral patterns
        System.out.println("Spiral Pattern of size " + size + ":");
        printSpiralPattern(size);
    }
}
