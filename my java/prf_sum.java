
    import java.util.*;

public class prf_sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] prf = new int[n];
        
           for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
    
        prf[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prf[i] =prf[i-1]+arr[i];
        }
        
        
        for (int k = 0; k < prf.length; k++) {
            System.out.print(prf[k] + " ");
        }
    }
}

