public class fibanacci {
    public static void main(String[] args) {
        int n1=0,n2=1,n3=0,count=10;
        
       while (n3<=count) {
        
       
             n3=n1+n2;
             System.out.print(n3);
             n1=n2;
             n2=n3;
        
    }
}
}
