import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Step 2: Take array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Take element to search
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        // Step 4: Search for key
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                found = true;
                break; // stop once found
            }
        }

        // Step 5: If not found
        if (!found) {
            System.out.println("Element not found in array.");
            
        }
    sc.close();
    }
}

 
