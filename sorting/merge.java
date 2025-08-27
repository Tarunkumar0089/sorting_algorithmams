
package sorting;
public class merge{
    public static void merge(int arr[], int si,int mid,int ei){
      int merged []=new int[ei-si+1];
      int idx1=si;
      int idx2=mid+1;
      int k=0;

      while(idx1<=mid && idx2<=ei){
        if(arr[idx1]<=arr[idx2]){
            merged[k++]=arr[idx1++];
        }else{
            merged[k++]=arr[idx2++];
        }
      }
      while(idx1<=mid){
        merged[k++]=arr[idx1++];
      }
      while(idx2<=ei){
         merged[k++]=arr[idx2++];
      }
      for(int i=0,j=si;i<merged.length;i++,j++){
         arr[j]=merged[i];
      }

    }
    public static void divide(int arr[],int si,int ei){
        if(ei<=si){
           return;
        }
        int mid=si+(ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        merge(arr,si,mid,ei);

    }
   public static void main(String[] args) {
    int arr[]={2,3,7,2,9,4,5};
    divide(arr,0,arr.length-1);
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
    System.out.println();
   }
}