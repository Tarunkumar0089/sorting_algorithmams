package sorting;

public class quick {
    public static int partition(int arr[],int lo,int hi){
        int pivot=arr[hi];
        int i=lo-1;
        for(int j=lo;j<hi;j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
        i++;
        // swap pivot element 
        int temp=arr[i];
        arr[i]=arr[hi];
        arr[hi]=temp;
        return i;
    }
    public static  void quickSort (int [] arr,int lo,int hi){
        if(hi<lo){
            return;
        }
        int pivot=partition(arr,lo,hi);
        quickSort(arr, lo, pivot-1);
        quickSort(arr, pivot+1, hi);
    }
    public static void main(String[] args) {
        int arr[]={1,6,2,8,3,4,2,9};
        quickSort(arr, 0, arr.length-1);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
}
