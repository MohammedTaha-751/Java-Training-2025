public class MoveZerosToEnd {
    public static void main(String[] args) {
        int arr[] = { 0, 2, 3, 0, 4, 1 };
        int pos = 0, temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != 0) {
                temp = arr[pos];
                arr[pos] = arr[i];
                arr[i] = temp;
                pos++;
            }

        }
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i]);
        }
    }
}
