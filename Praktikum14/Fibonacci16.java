package Praktikum14;
import java.util.Scanner;
public class Fibonacci16 {
    public static int fibonacciRekursif(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacciRekursif( n - 1 ) + fibonacciRekursif(n - 2);
        }
    }
    public static void pfibonacciRekursif(int n) {
        for (int i = 1; i < n; i++) {
            System.out.print(fibonacciRekursif(i) + ", ");
        }
    }
     public static void pfibonacciIteratif(int n) {
        int a = 1, b = 1;
        for (int i = 2; i <= n; i++) {
            System.out.print(a + ", ");
            int next = a + b;
            a = b;
            b = next;
        }
     }
     public static void main(String[] args) {
        int n = 13;
        System.out.println("Pola Fibonaci (Rekursif): ");
        pfibonacciRekursif(n);
        System.out.println("\nPola Fibonacci (Interartif)");
        pfibonacciIteratif(n);
     }
}
