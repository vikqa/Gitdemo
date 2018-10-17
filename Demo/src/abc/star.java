package abc;
 
public class star {
 
    public static void main(String[] args) {
        int n = 7;
        int count = n - 1;
        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= count; i++)
                System.out.print(" ");
            count--;
            for (int i = 1; i <= 2 * j - 1; i++)
                System.out.print("*");
            System.out.println();
 
        }
    }
}