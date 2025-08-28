public class heap {
  public static void sort(int arr[]){
    int n=arr.length;
    for(int i=n/2-1;i>=0;i--){
        hepify(arr, n, i);
    }
    for(int i=n-1;i>=0;i--){
        int temp=arr[0];
        arr[0]=arr[i];
        arr[i]=temp;
        hepify(arr, i, 0);
    }

  }
  public static void hepify(int [] arr ,int n,int i){
    int largest=i; // Initialize largest as root
    int li=2*i+1; //left child
    int ri=2*i+2; //right child
    if(li<n && arr[largest]<arr[li]){
        largest=li;
    }
    if(ri<n && arr[largest]<arr[ri]){
        largest=ri;
    }
    if(largest!=i){
        int temp=arr[i];
        arr[i]=arr[largest];
        arr[largest]=temp;
        hepify(arr, n,largest);
    }
  }

    public static void main(String[] args) {
        int []arr={22,15,16,27,23,23,10,8};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
}
