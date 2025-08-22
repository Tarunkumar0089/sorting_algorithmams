public class practice {
    public static void main(String[] args) {
        int n=256;
        int decimal=0;
        int base=1;
        while(n>0){
            int rem=n%2;
            n=n/2;
            decimal=decimal+rem*base;
            base=base*10;
        }
        System.out.println(decimal);
    }
}
