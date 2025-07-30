public class PatPyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int space = 0; space <= n - 1 - i; space++) {
                System.out.print("   ");
            }
            for (int star = 0; star < 2 * i - 1; star++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}