import java.util.*;

public class arraylist {
    public static void main(String[] args) {
         
        ArrayList<Integer> list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(2,3);
        list.add(3,4);
        // System.out.println(list);
        // System.out.println(list.size());
        // System.out.println(list.get(2)); 
        // list.remove(1);
        // System.out.println(list);
        // System.out.println(list.size());
        
      int i=0;
      int j=list.size()-1;
      while (i<j) {
        int temp=list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
        i++;
        j--;
        
      }
      System.out.println(list);
    }

}
