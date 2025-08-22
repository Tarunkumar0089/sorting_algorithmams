import java.util.*;
public class code8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String time=sc.nextLine();
        int idx0=time.charAt(0)-'0';
        int idx1=time.charAt(1)-'0';
        int hh=idx0*10+idx1;
        if(time.charAt(9)=='A'){
            if(hh==12){
            hh=0;
            }
        }
        else{
           if(hh!=12){
            hh+=12;
           }
        }
        String time24="";
        time24+=hh/10;
        time24+=hh%10;
        time24+=time.substring(2, 8);
        System.out.print(time24);
    }
}
