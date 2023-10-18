import java.util.Scanner;
public class ForKelipatan16 {
    public static void main(String[] args) {
        
        Scanner input16 = new Scanner (System.in);
        int bilangan, kelipatan, total,  counter , mean = 0;
        total = 0;
        counter = 0;
        
        System.out.print("Masukkan bilangan (1-9): ");
        bilangan = input16.nextInt();

        for (int i = 0; i < 50; i++) {
            if (i % bilangan == 0) {
                total += i;
                ++counter;
                mean = total / counter;
            
            }
        }
        System.out.println("--- Rentangx:g bilangan 1 sampai 50 ---");
        System.out.printf("Banyak bilangan kelipatan %d : %d \n", bilangan, counter );
        System.out.printf("Total bilagan kelipatan %d : %d \n", bilangan, total);
        System.out.printf("Rata-rata jumlah kelipatan %d : %d", bilangan, mean);
        
    }
    
}
