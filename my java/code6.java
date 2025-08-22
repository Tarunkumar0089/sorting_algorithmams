public class code6 {
  public static void main(String[] args) {
    String s="aba";
    int i=0;
    int j=s.length()-1;
while(i<j){
    if(s.charAt(i)==s.charAt(j)){
        System.out.print("yes");

    }
    
    else{
        System.out.print("no");
        break; 
    }
    i++;
    j--;
}
  }

}
