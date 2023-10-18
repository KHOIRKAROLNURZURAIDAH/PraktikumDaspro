import java.util.Scanner;
public class ForKelipatan16 {
    public static void main(String[] args) {
        
        Scanner input16 = new Scanner (System.in);
        int bilangan, total = 0, counter = 0;
        
        System.out.print("Masukkan bilangan (1-9): ");
        bilangan = input16.nextInt();

        for (int i = 0; i < 50; i++) {
            if (i % bilangan == 0) {
                total += i;
                ++counter;
            
            }
                 
        }
        System.out.printf("Pada rentang 1-50 terdapat %d dengan total %d", counter, bilangan, total );

        
    }
    
}
