import java.util.Scanner;
public class ArrayPengembalian {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      //  String judulBuku;
        int lamaPengembalian, lamaMeminjam, hasil=-1;
        
        
        String[] judulBuku = new String[10];
        int[] kodeBuku = new int [10];
        int[] stockBuku = new int [10];

        judulBuku[0] = "Sistem Informasi Jaringan";
        judulBuku[1] = "Visual Code";
        judulBuku[2] = "Information Technology";
        judulBuku[3] = "Java Program";
        judulBuku[4] = "Dasar Pemrograman Web";

        kodeBuku[0] = 12000;
        kodeBuku[1] = 12001;
        kodeBuku[2] = 12003;
        kodeBuku[3] = 12005;
        kodeBuku[4] = 12007;

        stockBuku[0] = 3;
        stockBuku[1] = 4;
        stockBuku[2] = 3;
        stockBuku[3] = 3;
        stockBuku[4] = 3;
        
            System.out.println("=== SELAMAT DATANG DI PERPUSTAKAAN JTI ===");
    
            System.out.println("Masukan kode buku yang ingin di pinjam ");
            int kode = sc.nextInt();
            for (int i = 0; i < kodeBuku.length; i++) {
                if (kodeBuku[i] == kode) {
                    hasil = i;
                    System.out.println("Masukan lamameminjam ");
                    lamaMeminjam = sc.nextInt();
                    System.out.println("Masukan lamapengembalian ");
                    lamaPengembalian = sc.nextInt();
        
                    if (lamaPengembalian>lamaMeminjam){
                        System.out.println("Anda terlambat mengembalikan!");
                    }
                    else {
                        System.out.println("Terimakasih telah melakukan Peminjaman");
                    }                   
                } if (hasil == -1){
                    System.out.print(" Kode Buku tidak ditemukan");
                    break;
               }
                }
                
            }
    
        }
    