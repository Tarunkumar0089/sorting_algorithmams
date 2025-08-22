
import java.util.*;

public class array1 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int sum=1;
        String res="";
        for(int i=0;i<arr.length;i++){
            res+=String.valueOf(arr[i]);
            
        }
        int num=Integer.parseInt(res);   
        num=num+sum;
        String top=String.valueOf(num);
        char[] arr1=top.toCharArray();
        for(int i=0;i<arr1.length;i++){
             
            System.out.println(arr1[i]);
        }

    }
}
