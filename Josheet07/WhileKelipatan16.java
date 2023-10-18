import java.util.Scanner;
public class WhileKelipatan16 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int jumlahKaryawan, jumlahjamLembur;
        double gajiLembur, totalGajiLembur;
        String jabatan;

        gajiLembur = 0;
        totalGajiLembur = 0;

        System.out.print("Masukkan jumlah karyawan: ");
        jumlahKaryawan = sc.nextInt();

        int i = 0;

        while (i < jumlahKaryawan) {
            System.out.print("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke-" + (i+1) + ": ");
            jabatan = sc.next();
            System.out.print("Masukkan jumlah jam lembur: ");
            jumlahjamLembur = sc.nextInt();
            i++;

            System.out.println("Total gaji lembur: " + totalGajiLembur);
    }
    
}
    }