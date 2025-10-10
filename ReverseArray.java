import java.util.Scanner;
public class ReverseArray {
    public static int[] reverse(int[] arr){
        int n = arr.length;
        int s=0,e=n-1;
        while(s<e){
            int temp = arr[e];
            arr[e]=arr[s];
            arr[s]=temp;
            s++;
            e--;
        }
        return arr;
    }
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
         System.out.println("enter the size of array ");
         int n = sc.nextInt();
         
         System.out.println("enter the elements of array");
         int[] arr = new int[n];
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        reverse(arr);
        System.out.println("THe reversed array is:"); 
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
    
}
