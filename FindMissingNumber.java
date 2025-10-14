import java.util.Scanner;
public class FindMissingNumber {
    public static int findMissingNumber(int [] arr , int n){
        long expectedsum = (long) (n*(n+1))/2;
        long actualsum =0;
        for(int num: arr){
            actualsum += num;
        }
        long MissingNumber = expectedsum - actualsum;
        return(int) MissingNumber;
    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array:");
    int n = sc.nextInt();

    int[] arr = new int[n-1];

    System.out.println("Enter the  " + (n-1)+" elemen of array:");
    for(int i=0;i<n-1;i++){
      arr[i] = sc.nextInt();
    }
   int missing = findMissingNumber(arr ,n);
    System.out.print("The missing number is : " + missing );

    sc.close();
}
    
}
