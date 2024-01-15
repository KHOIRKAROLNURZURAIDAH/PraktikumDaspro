import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProjekPerpustakaan {
    static Scanner input = new Scanner(System.in);

    static boolean isLogin = false;
    static boolean isAdmin = false;
    static boolean isKetemu = false;
    static String loginUser, loginPass, keyword = "";
    static String [] anggota = new String[10];
    static String [] password = new String[10];    
    static int sementaraBuku = 5, hasil = -1;    

    public static void main(String[] args) {        
        SimpleDateFormat tanggalFormat = new SimpleDateFormat("dd-MM-yyyy");

        String [] judulBuku = new String[10];        
        int [] kodeBuku = new int [10];
        int [] stockBuku = new int [10];    

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
        stockBuku[2] = 5;
        stockBuku[3] = 3;
        stockBuku[4] = 6;
        
        anggota[0] = "Admin";
        anggota[1] = "Deva";
        anggota[2] = "Dini";
        anggota[3] = "Fallujah";
        anggota[4] = "Khoir";

        password [0] = "admin";
        password [1] = "234170";
        password [2] = "234171";
        password [3] = "234172";
        password [4] = "234173";

        int sementaraAnggota = 5;
        int judulSementara = 5, stockSementara = 5, kodeSementara = 5, anggotaSementara = 5, nimSementara = 5;

        String [] laporan = new String[50];
        int histori = 0;
        
        int pilihMahasiswa, layananPustakawan, layananBuku, layananAnggota, kode;
        String tanggalPeminjaman, tanggalPengembalian, peminjam = "";
        Date tglPengembalian, tglPeminjaman;
        long selisihHari;
        double denda = 0;

            do {                
                System.out.println("===============================================================");
                System.out.println("||      Silahkan Login                                       ||");
                sistemLogin();
            
                if (isLogin && !isAdmin){
                    System.out.println("===============================================================");
                        System.out.println("||      Selamat Datang di Perpustakaan JTI                   ||");
                    do {
                        System.out.println("||      Pelayanan yang tersedia                              ||");
                        System.out.println("||      1. Peminjaman Buku                                   ||");
                        System.out.println("||      2. Pengembalian Buku                                 ||");                        
                        System.out.println("||      3. Log Out                                           ||");
                        System.out.println("||      4. Exit                                              ||");
                        System.out.print("||      Silahkan pilih layanan diatas : ");
                        pilihMahasiswa = input.nextInt();
                        
                        switch (pilihMahasiswa) {
                            case 1:
                            input.nextLine();
                                System.out.println("===============================================================");
                                System.out.print("||      Ingin mencari buku apa? ");
                                keyword = input.nextLine().toLowerCase();
                        
                                System.out.println("==================     Buku Yang Tersedia    ==================");
                                System.out.println(" ");
                                System.out.println("---------------------------------------------------------------");
                                System.out.printf("|%-30s|%-15s|%-15s|%n", "Judul Buku", "Kode Buku", "Stock Buku");
                                System.out.println();
                                System.out.println("---------------------------------------------------------------");
                                                                                    
                                int jumlahBuku = printBuku(judulBuku, kodeBuku, stockBuku, keyword);
                                if (jumlahBuku == 0) {
                                    break;
                                }

                                hasil = -1;
                                System.out.print("||      Masukan kode buku yang ingin di pinjam : ");
                                kode = input.nextInt();
                                    for (int i = 0; i < kodeBuku.length; i++) {
                                        if (kodeBuku[i] == kode){
                                            hasil = i;
                                            System.out.print("||      Minjam berapa buku : ");
                                            int meminjam = input.nextInt();
                                            stockBuku[i] -= meminjam;
                                            System.out.print("||      Masukan tanggal peminjaman (dd-MM-yyyy) : ");
                                            tanggalPeminjaman = input.next();
                                            peminjam = "||      " + loginUser + " nim " + loginPass + " meminjam buku " + judulBuku[i] + " sejumlah " + meminjam;
                                            laporan[histori] = peminjam;
                                            histori++;
                                            System.out.printf("||      %s nim %s meminjam buku %s sejumlah %s \n", loginUser, loginPass , judulBuku[i], meminjam);
                                            System.out.println("");
                                            break;
                                        }
                                    }
                                    
                                    if (hasil == -1){
                                        System.out.println("||      Salah memasukan kode!");
                                        System.out.println("");
                                    }
                                    break;

                            case 2:
                            if (peminjam.isBlank()) {
                                System.out.println("===============================================================");
                                System.out.print("||      Anda belum meminjam buku\n");
                                System.out.println("");
                            }
                            else {                            
                                input.nextLine();
                                hasil = -1;                                
                                System.out.println("===============================================================");
                                System.out.print("||      Masukan kode buku yang dikembalikan : ");
                                kode = input.nextInt();
                                for (int i = 0; i < kodeBuku.length; i++) {
                                    if (kodeBuku[i] == kode){
                                        hasil = i;
                                        try {
                                            System.out.print("||      Masukan tanggal peminjaman (dd-MM-yyyy) : ");
                                            tanggalPeminjaman = input.next();
                                            tglPeminjaman = tanggalFormat.parse(tanggalPeminjaman);
                                            System.out.print("||      Masukan tanggal pengembalian (dd-MM-yyyy) : ");
                                            tanggalPengembalian = input.next();
                                            tglPengembalian = tanggalFormat.parse(tanggalPengembalian);
        
                                            selisihHari = (tglPengembalian.getTime() - tglPeminjaman.getTime()) / (24 * 60 * 60 * 1000);
        
                                            if (selisihHari > 7 ){
                                                int hariTelat = (int) (selisihHari - 7);
                                                denda = hariTelat * 500;
                                                System.out.printf("||      Mahasiswa %s terlambat %s hari mengembalikan buku %s \n", loginUser, hariTelat, judulBuku[i]);
                                                System.out.printf("||      Dikenakan denda sebesar %s rupiah \n", denda);
                                                System.out.println("");
                                                String pengembali = "||      " + loginUser + " nim " + loginPass + " mengembalikan buku " + judulBuku[i] + " terlambat " + hariTelat + " hari";
                                                laporan[histori] = pengembali;
                                                histori++;
                                            } 
                                            else {
                                                System.out.println("||      Terimakasih telah mengembalikan tepat waktu!");
                                                System.out.println("");
                                                String pengembali = "||      " + loginUser + " nim " + loginPass + " mengembalikan buku " + judulBuku[i] + " tepat waktu";
                                                laporan[histori] = pengembali;
                                                histori++;
                                            }
                                            
                                        } catch (ParseException e){
                                            System.out.println("||      Format tanggal tidak sesuai. Gunakan format dd-MM-yyyy !");
                                        }
                                    }
                                } 
                                if (hasil == -1){
                                    System.out.println("||      Buku tidak ditemukan!\n");                            
                                }
                            }
                                break;
                                
                                case 3:
                                isLogin = false;
                                input.nextLine();
                                break;
                            
                            case 4:
                                return;

                            default:
                                System.out.println("||      Anda salah memilih layanan!");
                                System.out.println("");
                                break;
                            }
                    } while (pilihMahasiswa != 3);
                }
                else if (isLogin && isAdmin){
                    do {
                        System.out.println("===============================================================");
                        System.out.println("||      Layanan untuk Pustakawan                             ||");
                        System.out.println("||      1. Mengolah Data Buku                                ||");
                        System.out.println("||      2. Mengolah Data Anggota                             ||");
                        System.out.println("||      3. Histori Laporan                                   ||");
                        System.out.println("||      4. Log Out                                           ||");
                        System.out.println("||      5. Exit                                              ||");
                        System.out.print("||      Silahkan pilih layanan diatas : ");
                        layananPustakawan = input.nextInt();
                        
                        switch (layananPustakawan) {
                            case 1:
                                do {
                                System.out.println("===============================================================");
                                System.out.println("||      Mengolah Data Buku                                   ||");
                                System.out.println("||      1. Daftar Buku                                       ||");
                                System.out.println("||      2. Menambah Data Buku                                ||");
                                System.out.println("||      3. Memperbarui Stock Buku                            ||");
                                System.out.println("||      4. Kembali ke Menu Utama                             ||");
                                System.out.print("||      Silahkan pilih layanan diatas : ");
                                layananBuku = input.nextInt();
                                
                                switch (layananBuku) {
                                    case 1:
                                        System.out.println("===============================================================");
                                        System.out.println("-------------------------- List Buku --------------------------");
                                        System.out.printf("|%-30s|%-15s|%-15s|%n", "Judul Buku", "Kode Buku", "Stock Buku");
                                        System.out.println("---------------------------------------------------------------");
                                        
                                        printBuku(judulBuku, kodeBuku, stockBuku, "");
                                        break;

                                    case 2:
                                    input.nextLine(); // membersihkan baris
                                        System.out.println("===============================================================");
                                        System.out.print("||      Masukan judul buku : ");
                                        String judulBaru = input.nextLine();
                                        judulBuku[judulSementara] = judulBaru;
                                        judulSementara++;
                                        System.out.print("||      Masukan kode buku : ");
                                        int kodeBaru = input.nextInt();
                                        kodeBuku[kodeSementara] = kodeBaru;
                                        kodeSementara++;
                                        System.out.print("||      Berapa banyak buku : ");
                                        int stockBaru = input.nextInt();
                                        stockBuku[stockSementara] = stockBaru;
                                        stockSementara++;
                                        System.out.printf("||      Anda menambahkan buku berjudul %s sebanyak %s buku \n", judulBaru, stockBaru);
                                        System.out.println("");
                                        sementaraBuku++;
                                        break;

                                    case 3:
                                        System.out.println("===============================================================");

                                        printBuku(judulBuku, kodeBuku, stockBuku, keyword);
                                        int key;
                                        // hasil = -1;
                                        System.out.print("||      Masukan kode buku : ");
                                        key = input.nextInt();

                                        for (int i = 0; i < kodeBuku.length; i++) {
                                            if (kodeBuku[i] == key){
                                                hasil = i;
                                                System.out.print("||      Masukan stock baru : ");
                                                stockBuku[i] = input.nextInt();
                                                System.out.printf("||      Anda memperbarui stock pada kode buku %s sebanyak %s \n", key, stockBuku[i]);
                                            }
                                        }

                                        if (hasil == -1){
                                            System.out.println("||      Kode tidak sesuai!");
                                        }

                                        System.out.println("");
                                        break;
                                    
                                    case 4:
                                        break;
                                              
                                    default:
                                        System.out.println("||      Anda salah memilih layanan!");
                                        System.out.println("");
                                        break;
                                }                                
                            } while (layananBuku != 4);
                                break;
                                
                            case 2:
                                do {
                                System.out.println("===============================================================");
                                System.out.println("||      Mengolah Data Anggota                                ||");
                                System.out.println("||      1. List Anggota                                      ||");
                                System.out.println("||      2. Menambah Data Anggota                             ||");
                                System.out.println("||      3. Kembali ke Menu Utama                             ||");
                                System.out.print("||      Silahkan pilih layanan diatas : ");
                                layananAnggota = input.nextInt();

                                switch (layananAnggota) {
                                    case 1:
                                    System.out.println("===============================================================");                                        
                                    System.out.printf("|%-30s| %-30s|%n", "Nama", "NIM");
                                    System.out.println("---------------------------------------------------------------");
                                    for (int i = 1; i < sementaraAnggota; i++) { //dari 1 karena admin tidak termasuk anggota
                                        System.out.printf("%-30s| %-30s|%n", anggota[i], password[i]);
                                    }
                                    
                                    System.out.println();
                                    break;
                                    
                                    case 2:
                                    input.nextLine(); // membersihkan line
                                        System.out.println("===============================================================");
                                        System.out.print("||      Masukan nama : ");                                
                                        String namaBaru = input.nextLine();
                                        anggota[anggotaSementara] = namaBaru;
                                        anggotaSementara++;
                                        System.out.print("||      Masukan NIM : ");                                
                                        String nimBaru = input.nextLine();
                                        password[nimSementara] = nimBaru;
                                        nimSementara++;
                                        System.out.printf("||      Anda menambahkan anggota bernama %s dengan NIM %s \n", namaBaru, nimBaru);
                                        System.out.println("");
                                        sementaraAnggota++;
                                        break;

                                    case 3:
                                        break;                                
                                
                                    default:
                                        System.out.println("||      Anda salah memilih layanan!");
                                        System.out.println("");                                    
                                        break;
                                }                                
                                } while (layananAnggota != 3);
                                break;

                            case 3:
                                System.out.println("===============================================================");
                                System.out.print("||    Histori Laporan : \n");
                                for (int i = 0; i < histori; i++){
                                    System.out.println(laporan[i]); 
                                }

                                System.out.println(""); 
                                break;

                            case 4:
                                isLogin = false;
                                isAdmin = false;
                                input.nextLine();
                                break;

                            case 5:
                                return;
                        
                            default:
                                System.out.println("||      Anda salah memilih layanan!");
                                System.out.println("");
                                break;
                        }
                    } while (layananPustakawan != 4);
                }
            } while (isLogin == false);        
        }
        
        public static void sistemLogin() {

        System.out.print("||      Username = ");
        loginUser = input.nextLine();                
        System.out.print("||      Password = ");
        loginPass = input.nextLine();
                
            for (int i = 0; i < anggota.length; i++) {
                if (loginUser.equalsIgnoreCase(anggota[i]) && loginPass.equals(password[i])){
                    isLogin = true;

                    if (i == 0) {
                        isAdmin = true;
                    }
                    break;
                }
            }

            if (isLogin == false){
                System.out.println("||      Username atau Password yang dimasukan salah, login kembali!");
            }
    }

        public static int printBuku (String [] judulBuku, int [] kodeBuku, int [] stockBuku, String keyword) {

            int jumlahBuku = 0;

            for (int j = 0; j < sementaraBuku; j++) {
                if (keyword.isEmpty() || judulBuku[j].toLowerCase().contains(keyword)){                    
                    System.out.printf("|%-30s|%-15s|%-15s|%n", judulBuku[j], kodeBuku[j], stockBuku[j]);
                    jumlahBuku++;
                }
            }

            if (jumlahBuku == 0){
                System.out.println("||      Buku tidak ditemukan!");            
            }

            System.out.println();
            return jumlahBuku;
    }
} 

