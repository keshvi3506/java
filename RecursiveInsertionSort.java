import java.util.Scanner;

public class RecursiveInsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        insertionSort(nums, n);

        for (int x : nums)
            System.out.print(x + " ");

        sc.close();
    }

    static void insertionSort(int[] arr, int n) {
        if (n <= 1)
            return;

        insertionSort(arr, n - 1);

        int last = arr[n - 1];
        insert(arr, n - 2, last);
    }

    static void insert(int[] arr, int index, int value) {
        if (index < 0 || arr[index] <= value) {
            arr[index + 1] = value;
            return;
        }
        arr[index + 1] = arr[index];
        insert(arr, index - 1, value);
    }
}
        