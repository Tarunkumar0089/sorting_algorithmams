import java.util.*;
public class validAnagram{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        System.out.println(isAnagram(s1,s2));
    }
    public static boolean isAnagram(String s,String t){
        if(s.length()!=t.length()) return false;
        int[] count=new int[26];
        for(int i=0;i<t.length()-1;i++){
           count[s.charAt(i)-'a']++;
           count[t.charAt(i)-'a']--;
        }
        for(int c:count){
            if(c!=0) return false;
        }
        return true;
    }
}