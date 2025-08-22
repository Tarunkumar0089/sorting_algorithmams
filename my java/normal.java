 import java.util.*;
// public class normal {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String n=sc.next();
//         int num=Integer.parseInt(n);
//         System.out.println(num);

//     }
// }
// public class normal{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String str=sc.next();
//         char letters[]=str.toCharArray();
//         for (char letter:letters){
//             System.out.println(letter);
//         }

//     }
// }
public class normal{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:-->");
        int num=sc.nextInt();
       int arr[]=new int[num];
       System.out.print("Enter the element:-->");
       int max=arr[0];
       for(int i=0;i<num;i++){

        arr[i]=sc.nextInt();
       }
       for(int j=0;j<arr.length;j++){
          if(arr[j]<max){
             max=arr[j];
          }

       }
       System.out.print("Final answer is:-->");
       System.out.print(max);
    }
}