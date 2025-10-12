import java.util.Scanner;

public abstract class LeftRotateByOne {
    public static void Rotate(int[] arr) {
        if (arr.length == 0) return;
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Original array -> ");
        printArray(arr);
        Rotate(arr);
        System.out.println();
        System.out.print("Rotated one time to left -> ");
        printArray(arr);
        sc.close();
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
    
}
