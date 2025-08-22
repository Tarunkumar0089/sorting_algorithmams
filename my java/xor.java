import java.util.*;

public class xor {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       int xor=0;
       for (int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       } 
    for (int j=0;j<arr.length;j++){
        xor^=arr[j];

    }
    System.out.println(xor);
       
    }
}
