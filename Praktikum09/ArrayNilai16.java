package Praktikum09;
import java.util.Scanner;
public class ArrayNilai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] nilaiAkhir = new int[10];
        int max = 0, min = 100, lulus = 0, tidaklulus = 0;


        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukan nilai akhir mahasiswa ke-" + (i+1) + ": ");
            nilaiAkhir[i] = sc.nextInt();
       
            if (max < nilaiAkhir[i]) {
                max = nilaiAkhir [i];
            }
            if (min > nilaiAkhir [i]) {
                min = nilaiAkhir [i];
            }
        }
        for (int i = 0; i < 10; i++) {
            if (nilaiAkhir[i] > 70){
            System.out.println("Nilai Akhir Mahasiswa ke-" + (i+1) + " Lulus ");
            lulus++;
            }

            if (nilaiAkhir[i] <= 70){
                System.out.println("Nilai Akhir Mahasiswa ke-" + (i+1) + " Tidak Llulus ");
                tidaklulus++;
            }
        }
        int Ratarata = 0;
        for ( int num: nilaiAkhir) {
            Ratarata += num;
        }

        double average = Ratarata / nilaiAkhir.length;
        System.out.println("Rata-rata: " + average);
        
        
        System.out.println("Nilai terbesar:" + max );
        System.out.println("Nilai terkecil:" + min);
        System.out.println("Jumlah mahasiswa yang lulus: " + lulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus:" + tidaklulus);
        
    }
    
}
