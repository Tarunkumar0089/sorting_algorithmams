import java.util.*;
public class code3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0){
            int c1=sc.nextInt();
            int c2=sc.nextInt();
            int c3=sc.nextInt();
            int c4=sc.nextInt();
            int n=sc.nextInt();
            int m=sc.nextInt();
            int rick[]=new int[n];
            int cab[]=new int[m];
            for (int i=0;i<n;i++){
                rick[i]=sc.nextInt();      
                  }
                for(int i=0;i<m;i++){
                    cab[i]=sc.nextInt();
                }
                int sum=0;
                int ri=0;
                int ca=0;
                for(int i=0;i<rick.length;i++){
                    int val=rick[i]*c1;
                    ri+=Math.min(val,c2);
                }
                sum+=Math.min(ri,c3);
                for(int i=0;i<m;i++){
                    int val=cab[i]*c1;
                    ca+=Math.min(val,c2);

                }
                sum+=Math.min(ca,c3);
                System.out.println(Math.min(sum,c4));
        }
    }
}
