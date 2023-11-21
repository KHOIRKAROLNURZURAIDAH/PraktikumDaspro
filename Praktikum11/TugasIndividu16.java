import java.util.Scanner;
public class TugasIndividu16 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.print("Masukan nilai n : ");
         int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

         System.out.println();
        }
    }
}

