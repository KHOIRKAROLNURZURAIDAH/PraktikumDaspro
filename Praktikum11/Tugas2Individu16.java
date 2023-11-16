package Praktikum11;
import java.util.Scanner;
public class Tugas2Individu16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan nilai n : ");
         int n = sc.nextInt();

         if( n % 2 == 0 || n <= 2) {
            System.out.println("Nilai n harus ganjil dan lebih besar dari 2!");
            return;
         }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print(n);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
