import java.util.Scanner;
public class CheckSortedArray {
    public static int[] Sorted(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }

        }

}
        return arr;



    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of array:");
    int n = sc.nextInt();

    System.out.println("enter elements of array:");
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    
    System.out.println("the sorted array is:");
    Sorted(arr);
    
    for(int i=0;i<n;i++){
        System.out.print(arr[i] + " ");
    }
  sc.close();
}

}



    

