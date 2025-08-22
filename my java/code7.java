import java.util.*;
public class code7 {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int arr[]=new int[n];
          for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
          }
          int q=sc.nextInt();
          Arrays.sort(arr);
          while(q-->0){
            int paise=sc.nextInt();
            int item=sc.nextInt();
            int ip=0;
            for(int i=0;i<arr.length;i++){
                if(paise<arr[i]){
                   break;
                }
                else{
                    if(paise%arr[i]==0){
                        ip+=1;
                    }
                }
            }
            if(ip>=item){
                System.out.println("yes");
            }
            else{
                System.out.println("no. ");
            }
          }
    }
}
