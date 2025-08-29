package sorting;
public class counting {
    public static void countingSort(int [] arr){
        int n=arr.length;
        //find max element
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        // build a freq array
        int[] freq=new int[max+1];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        // Modify freq array (prefix sum) 
        for(int i=1;i<=max;i++){
            freq[i]+=freq[i-1];

        }

        // Build output array (stable sorting)
        int[] output = new int[n];
        for(int i=n-1;i>=0;i--){
            output[freq[arr[i]]-1]=arr[i];
            freq[arr[i]]--;
        }

        //  Copy sorted elements back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
    public static void main(String[] args) {
        int [] arr={4, 2, 2, 8, 3, 3, 1};
        countingSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
