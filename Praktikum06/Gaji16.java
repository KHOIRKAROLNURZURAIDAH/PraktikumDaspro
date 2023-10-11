import java.util.Scanner;
public class Gaji16 {
    public static void main(String[] args) {
        
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.println("Masukkan Kategori : ");
        kategori = input16.nextLine();
        System.out.println("Masukkan Besarnya Penghasilan : ");
        penghasilan = input16.nextLine();

        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000)
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                 pajak = 0.15;
            else
                 pajak = 0.2;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan Bersih : " + gajiBersih);
        } else if (kategori.equalsIgnoreCase("pebisnis")) {
            if (penghasilan <= 2500000)
                pajak = 0.15;
            else if (penghasilan <= 3500000)
                pajak = 0.2;
            else
                pajak = 0.2;
            else
                pajak = 0.25;
            gajiBersih = (int) (penghasilan - ( pajak * penghasilan));
            System.out.pritn("Penghasilan : " + gajiBersih);
        } else
            System.out.pritn("Masukan Kategori Salah");
    }
    
}
