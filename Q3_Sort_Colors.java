package April_04_Assignment;

import java.util.Scanner;

public class Q3_Sort_Colors {
    public static int[] sortColors(int[] A) {
        int n = A.length;
        if (n <= 1)
            return A;

        int low = 0; // Index to track the next position for 0
        int high = n - 1; // Index to track the next position for 2
        int mid = 0; // Current index

        // Traverse the array
        while (mid <= high) {
            if (A[mid] == 0) {
                // Swap A[mid] with A[low] and increment both pointers
                int temp = A[low];
                A[low] = A[mid];
                A[mid] = temp;
                low++;
                mid++;
            } else if (A[mid] == 1) {
                // No action needed for 1, just move to the next element
                mid++;
            } else {
                // Swap A[mid] with A[high] and decrement high pointer
                int temp = A[mid];
                A[mid] = A[high];
                A[high] = temp;
                high--;
            }
        }

        return A;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();

        int[] A = new int[n];
        System.out.println("Enter the elements of the array (0, 1, or 2 only):");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        int[] sortedArray = sortColors(A);
        System.out.println("Output:");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
