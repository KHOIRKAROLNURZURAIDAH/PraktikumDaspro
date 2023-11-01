package Praktikum09;
import java.util.Scanner;
public class ArrayNilai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] nilaiAkhir = new int[10];
        int jumlahMahasiswa = 10;
        int nilaiTinggi = 100;
        int nilaiRataRata = 0;
        int nilaiterendah = 45;
        int nilai;
        int lulus = 75;
        int tidaklulus = 70;


        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukan nilai akhir mahasiswa ke-" + (i+1) + ": ");
            nilaiAkhir[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (nilaiAkhir[i] > 70){
            System.out.println("Nilai Akhir Mahasiswa ke-" + (i+1) + " Lulus ");
            }else{ 
                 System.out.println("Nilai Akhir Mahasiswa ke-" + (i+1) + " Tidak Lulus ");
            }
        }

        if (nilai > nilaiTinggi ) {
            nilaiTinggi = nilai;
        }
        if (nilai < nilaiterendah ) {
            nilaiterendah = nilai;
        }

        for (int i = 0; i < jumlahMahasiswa; i++){
            if (nilai >= 70) {
                lulus++;
            }else{
                tidaklulus++;
            }
        }
        
        System.out.println("Nilai rata-rata:" + nilaiRataRata / jumlahMahasiswa);
        System.out.println("Nilai tertinggi:" + nilaiTinggi);
        System.out.println("Nilai terendah:" + nilaiterendah);
        System.out.println("Jumlah mahasiswa yang lulus: " + lulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus:" + tidaklulus);
        
    }
    
}
