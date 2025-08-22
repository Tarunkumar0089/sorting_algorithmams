public class decimal_bin {
    public static void main(String[] args) {
        int num=10;
        int dec=1;
        int base=0;
        while(num!=0){
            int rem=num%2;
            base=base+rem*dec;
             dec=dec*10;
             num=num/2;

        }
        System.out.println(dec);

    }
}
