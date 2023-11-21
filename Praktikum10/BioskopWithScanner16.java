package Praktikum10;
import java.util.Scanner;
public class BioskopWithScanner16 {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int baris, kolom, choice;
      String nama, next;
      String[][] penonton = new String[4][2];

  while (true) {
      System.out.println("============================");
      System.out.println("Selamat Datang Di Bioskop 1D");
      System.out.println("============================");
      System.out.println("- Menu 1 : Input Data Penonton");
      System.out.println("- Menu 2 : Tampilan Daftar Penonton");
      System.out.println("- Menu 3 : Exit");
      System.out.println("============================");
      System.out.println("Masukkan Pilihan Anda : ");
      choice = sc.nextInt();
      sc.nextLine(); // Consume the newLine character


      switch (choice) {
          case 1:
              System.out.println("Masukkan nama: ");
              nama = sc.nextLine();
              System.out.println("Masukkan baris: ");
              baris = sc.nextInt();
              System.out.println("Masukkan kolom: ");
              kolom = sc.nextInt();
              sc.nextLine();

               penonton[baris-1][kolom-1] = nama;
              break;

          case 2:
          System.out.println("Daftar Penonton: ");
          for (int i = 0; i < 4; i++) {
              for (int j = 0; j < 2; j++) {
                  if (penonton[i][j] != null) {
                      System.out.println("Baris " + (i + 1) + ", kolom " + (j + 1) + ": " + penonton[i][j]);
                      if (penonton[i][j] != null) {
                        System.out.println("Baris " + (i + 1) + ", kolom " + (j + 1) + ": " + penonton[i][j]);
                    }
                }
            } 
            break;

            case 3:
                System.out.println("Terima Kasih!");
            return; // Exit the program
            
            default:
                System.out.println("Menu tidak valid. silahkan pilih menu yang benar. ");
        }

        System.out.print("kembali ke menu? (y/n) : ");
        next = sc.nextLine();

        if (next.equalsIgnoreCase("n")) {
            break;
        }
      }
    } 
  }
}


     //  Scanner sc = new  Scanner(System.in);
       // String  nama, next;
       // int baris, kolom;

     //   String[][] penonton = new String [4][2];
      //      while (true) {
        //        System.out.print("Masukan nama: ");
          //      nama = sc.nextLine();
            //    System.out.print("Masukan baris: ");
              //  baris = sc.nextInt();
                // System.out.print("Masukan kolom: ");
             //  kolom = sc.nextInt();
               // sc.nextLine();

              //  penonton[baris-1][kolom-1] = nama;

              //  System.out.print("Input penonton lainnya? (y/n): ");
              //  next = sc.nextLine();

              //  if (next.equalsIgnoreCase("n")) {
                //    break;
                // }
          //  }
        
    

