import java.util.*;
public class code5 {
    public static void main(String[] args) {
      //2864
      int a=3;
      int b=5;
      int sum=0;
      int sum1=0;
      for(int i=1;i<=a;i=1){
        sum=sum+i;

      }
      for(int i=2;i<=b;i=2){
       sum1=sum1+i;
      }
      if(sum1%2==0||sum%2==0){
        System.out.print("yes");
      }
      else{
        System.out.print("no");
      }

    }
}
