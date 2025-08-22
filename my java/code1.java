import java.util.*;
public class code1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[10];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        // Print the array as a whole with brackets
        System.out.print(Arrays.toString(Arrays.copyOf(array, n)));
    }
}
