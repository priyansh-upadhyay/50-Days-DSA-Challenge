public class FindLeaderInArray {
    public static void main(String[] args) {
        int[] arr = {1 ,12 ,8 , 2 ,5};
        int n = arr.length;
        int maxright = arr[n-1];
        System.out.print(maxright + " ");
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=maxright){
                maxright = arr[i];
                System.out.print( + maxright + " ");
            }
            
        }

    }

    
}
