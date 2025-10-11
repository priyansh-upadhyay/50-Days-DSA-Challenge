import java.util.Scanner;
public class RemoveDuplicates {
    public static int Duplicate(int[] arr){
        int i=0;
        int n= arr.length;
        for(int j=1;j<n;j++){
           if( arr[i] != arr[j]){
            i++;
             arr[i]= arr[j];
           }

        }
        return i+1;
       
        


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n = sc.nextInt();
        System.out.println("enter the elements of array:");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         int m = Duplicate(arr);
        System.out.print("New array is:") ;
        for(int i=0;i<m;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    
    }
}
