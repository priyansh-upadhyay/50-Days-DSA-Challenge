import java.util.Scanner;

public class SecondLargest {
    public static int find(int[] arr){
        int largest =Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                second = largest;
                largest = arr[i];
            }
            else if(arr[i]>second && arr[i]!=largest) second =arr[i];
        }
        return second;
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in Array: ");
        int n = sc.nextInt();
        System.out.println("Enter the Elements of Array: ");
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Second Largest element is: " + find(arr));
        sc.close();
    }
    }
    

