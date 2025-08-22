public class gcd {
    public static void main(String[] args) {
        int x=12;
        int y=9;
        int gc=1;

       while(x!=y){
        if(x>y){
            x-=y;
        }
        else{
            y-=x;
        }
       }
       System.out.print(x);
    }
}
