import java.util.*;
public class UnionOfSortedArray {
    public static ArrayList<Integer>FindUnion(int arr1[] ,int  arr2[]){
        int i =0;
        int j=0;
        int n1 = arr1.length ;
        int n2 = arr2.length;
        ArrayList<Integer> Union = new ArrayList<>();
        while(i<n1 && j<n2){
            if(i>0 && arr1[i]== arr1[i-1]){
              i++;
              continue;

            }

            if(j>0 && arr2[j]==arr2[j-1]){
                j++;
                continue;
            }
            if(arr1[i]<arr2[j]){
                Union.add (arr1[i]);
                i++;
            }
            else if(arr1[i]>arr2[j]){
                Union.add(arr2[j]);
                j++;
            }
            else{
                Union.add(arr1[i]);
                i++;
                j++;
            }
           

        }
        while(i<n1){
            if( i== 0 || arr1[i] != arr1[i-1])
            Union.add(arr1[i]);
            i++;

        }
        while(j <n2){
            if(j==0 || arr2[j] != arr2[j-1])
            Union.add(arr2[j]);
            j++;
        }

        return Union;


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter " + n1 + " elements of first (sorted) array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter " + n2 + " elements of second (sorted) array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        
        ArrayList<Integer> result = FindUnion(arr1, arr2);

        
        System.out.println("Union of two arrays: " + result);

        sc.close();
    }
    
}
