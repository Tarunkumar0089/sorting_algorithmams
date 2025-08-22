class Solution {
    public static void main(String[] args) {
    int arr[]={1,1,2,3,3,4,5};
    int temp[]=new int[arr.length];
    int j=0;
    for(int i=0;i<arr.length-1;i++){
        if(arr[i]!=arr[i+1]){
            temp[j++]=arr[i];
        }
    }
    temp[j++]=arr[arr.length-1];
    for(int k=0;k<j;k++){
        arr[k]=temp[k];
        System.out.println(arr[k]);
    }
}
}

