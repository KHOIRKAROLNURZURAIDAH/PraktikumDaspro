package Praktikum14;
import java.util.Scanner;
public class Tabungan16 {
    public static double tabunganRekursif(double modal, double tingkatKeuntungan, int tahun ) {
    if (tahun == 0) {
        return modal;
    } else {
        double hasilEmas1TahunSebelumnya = tabunganRekursif(modal, tingkatKeuntungan, tahun - 1);
        return hasilEmas1TahunSebelumnya * (1 + tingkatKeuntungan / 100);
    }
} 
public static double Iteratif(double modal, double tingkatKeuntungan, int tahun) {
    double hasil = modal;
    for (int i = 0; i < tahun; i++) {
        hasil*= (1 + tingkatKeuntungan / 100);
    }
    return hasil;
}
public static void main(String[] args) {
    double modalAwal = 10000;
    double tingkatKeuntungan = 11.7;
    int tahun = 10;

    double hasilRekursif = tabunganRekursif(modalAwal, tingkatKeuntungan, tahun);
    System.out.println("Hasil investasi Emas setelah " + tahun + " tahun (rekursif) " + hasilRekursif);

    double hasilIteraktif = tabunganRekursif(modalAwal, tingkatKeuntungan, tahun);
    System.out.println("Hasil investasi Emas setelah " + tahun + " tahun (iteraktif) " + hasilIteraktif);
    }
}
