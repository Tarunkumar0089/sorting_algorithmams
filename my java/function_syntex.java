import java.util.*;
public class function_syntex {
    public static void myname(int n,int n2){
        System.out.println("The sum is:->");
        System.out.println(n+n2);
        
        return;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter first number:->");
    int n=sc.nextInt();
    System.out.println("enter second number:->");
    int n2=sc.nextInt();
    myname(n,n2);
        
    }
}
