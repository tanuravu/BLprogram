import java.util.Scanner;

public class PrintDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Duplicate elements are:");
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            for (int k = i + 1; k < n; k++) {
                if (arr[i] == arr[k] && !isDuplicate) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
