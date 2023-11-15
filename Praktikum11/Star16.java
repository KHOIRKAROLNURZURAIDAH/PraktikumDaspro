package Praktikum11;
import java.util.Scanner;
public class Star16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan juamlah *: = ");
        int n = sc.nextInt();

        for(int i = 0 ; i<n; i--) {
            System.out.print("*");
        }
    }
}
