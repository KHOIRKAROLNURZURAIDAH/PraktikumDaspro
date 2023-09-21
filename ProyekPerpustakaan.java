import java.util.Scanner;
public class ProyekPerpustakaan {
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       String judulbuku;
       int kodebuku, lamameminjam, lamapengembalian, denda;

       System.out.println("Masukkan judul buku: ");
       judulbuku = sc.nextLine();
       System.out.println("Masukkan kode buku: ");
       kodebuku = sc.nextInt();
       System.out.println("Masukkan lama meminjaman: ");
       lamameminjam = sc.nextInt();
       System.out.println("Masukkan lama pengembalian: ");
       lamapengembalian = sc.nextInt();

       denda = lamameminjam - lamapengembalian;
       lamapengembalian = lamameminjam + denda;

       System.out.println("Denda: " + denda);
       System.out.println("Lama ");
    }
}
 
    

