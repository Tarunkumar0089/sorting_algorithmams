import java.util.*;
public class bin_decimal {
    public static void main(String[] args) {
        int num=1;
        int dec=0;
        int base=0;
        while(num!=0){
            int rem=num%10;
            base=base+rem*(int)Math.pow(2,dec);
            dec++;
             num=num/10;

        }
        System.out.println(base);

    }
}
