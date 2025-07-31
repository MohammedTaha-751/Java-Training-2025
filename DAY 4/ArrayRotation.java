import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of rotations: ");
        int rotations = scanner.nextInt();

        // Normalize rotations if greater than array length
        rotations = rotations % n;

        // Rotate the array to the right by 'rotations' times
        reverse(arr, 0, n - 1);
        reverse(arr, 0, rotations - 1);
        reverse(arr, rotations, n - 1);

        System.out.println("Array after rotation:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        scanner.close();
    }

    private static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
