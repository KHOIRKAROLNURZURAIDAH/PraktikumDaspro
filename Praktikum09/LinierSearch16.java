package Praktikum09;
import java.util.Scanner;
public class LinierSearch16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayInt = {34, 18, 26, 48, 72, 20, 56, 63} ;
        int key, jumlahEleman;
        int hasil = -1;

        System.out.print("Masukan jumlah Elemen array: " );
        jumlahEleman = sc.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukan Elemen array ke-" + i + ": ");
            arrayInt[i] = sc.nextInt();
        }
         System.out.print("Masukan key yaang ingin dicari: ");
         key = sc.nextInt();   

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                System.out.print("Key ada di posisi indeks ke- " + hasil);
                break;
            }
        }
        if (hasil == -1){
             System.out.print("Key tidak ditemukan");
        }
           
        }
        
    }
    

