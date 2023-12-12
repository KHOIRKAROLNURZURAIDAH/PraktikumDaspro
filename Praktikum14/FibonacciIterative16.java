package Praktikum14;
import java.util.Scanner;
public class FibonacciIterative16 {
    public static void main(String[] args) {
        int n= 15, bil1 = 1, bil2 =1;
        System.out.println("Fibonacci dari bilangan " + n + " :");
        for (int i =0; i<n; i++) {
            System.out.print(bil1 + ",");

            int hasil = bil1 + bil2;
            bil1 = bil2;
            bil2= bil1;
        }
    }
}
