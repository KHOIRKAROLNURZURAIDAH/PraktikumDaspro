import java.util.Scanner;
public class pengembalian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String judulBuku;
        int kodeBuku;
        int lamaMeminjam, lamaPengembalian;

        String[] judulBukuStrings = {"Sistem Informasi Jaringan", "Visual Code", "Information Technology", "Java Program", "Dasar Pemrograman Web"};
        int[] kodeBukuint = {12000, 12001, 12003, 12005, 12007};
        int[] stockBuku = {3, 4, 3, 3, 3};

        System.out.println("Masukan kode buku ");
        kodeBuku = sc.nextInt(); 

        int index = -1;
        for (int i = 0; i < kodeBukuint.length; i++) {
            if (kodeBuku == kodeBukuint[i]) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Masukan lama meminjam ");
            lamaMeminjam = sc.nextInt();
            System.out.println("Masukan lama pengembalian ");
            lamaPengembalian = sc.nextInt();

            if (lamaPengembalian > lamaMeminjam) {
                System.out.println("Anda terlambat mengembalikan!");
            } else {
                System.out.println("Terimakasih telah melakukan Peminjaman");
                stockBuku[index]++; 
            }
        } else {
            System.out.println("Buku dengan judul '" + judulBukuStrings + "' tidak ditemukan.");
        }
    }
}



