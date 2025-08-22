import java.util.*;
public class code2{
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int raw=sc.nextInt();
        int col=sc.nextInt();
        int arr[][]=new int[raw][col];
        for(int i=0;i<raw;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<raw;i++){
        for(int j=0;j<col;j++){
           System.out.print(arr[raw][col]+" ");
        }
        System.out.println();
    }
        
    }

 }

 