import java.util.Scanner;
public class TugasIndividuFungsi1 {
    static String [] students = {"Sari", "Rina", "Yani", "Budi", "Ali"};
    static int weeks = 3;
    static int[][] nilai = new int[students.length][weeks];
    public static void main(String[] args) {
            inputNilai();
            displayNilai();
            nilaiTerbaik();
        }
        public static void inputNilai(){
            Scanner sc = new Scanner(System.in);
            
            for (int i = 0; i < students.length; i++) {
                System.out.println("Masukkan nilai " + students[i]);
                for (int j = 0; j < weeks; j++) {
                    System.out.print("Minggu " + (j+1) + ": ");
                    nilai[i][j] = sc.nextInt();
                }
            }
        }
       public static void displayNilai(){
            for (int i = 0; i < students.length; i++) {
                System.out.println("\nNilai " + (students[i]));
                for (int j = 0; j < weeks; j++) {
                    System.out.println("Minggu " + (j + 1) + ": " + nilai[i][j]);
                }
            }
    
        }
        public static void nilaiTerbaik(){
           for (int j = 0; j < weeks; j++) {
                int max = nilai [0][j];
                for (int i = 0; i < students.length; i++) {
                    if (nilai[i][j] > max) {
                        max = nilai[i][j];
                    }
                }
                System.out.println("Nilai tertbaik minggu " + (j + 1) + ": " + max);
           }
        }       
    }
    

   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
//     // static Scanner sc = new Scanner (System.in);
//    // static int[][]nilai;
//     //static String[]nama;

//     //public static void main(String[] args) {
//       //  System.out.println("Masukan jumlah mahasiswa: ");
//         //int jumalahMahasiswa = sc.nextInt();
//         System.out.println("Masukkan jumlah minggu: ");
//         int jumlahMinggu = sc.nextInt();

//         nilai = new int[jumalahMahasiswa][jumlahMinggu];
//         nama = new String[jumalahMahasiswa];

//         inputNamaMahasiswa();
//         System.out.printf("======================================%n");
//         inputNilai();
//         System.out.printf("======================================%n");
//         tampilNilai();
//         System.out.printf("======================================%n");
//         mingguTertinggi();
//         System.out.printf("======================================%n");
//         mahasiswaTertinggi();
//     }
//     public static void inputNamaMahasiswa() {
//         for (int i = 0; i < nama.length; i++ ) {
//             System.out.print("Masukan nama Mahasiswa ke- " + (i+1) + ": ");
//             nama[i] = sc.next();
//         }
//     }
//     public static void inputNilai() {
//         for (int i = 0; i < nilai.length; i++ ) {
//             System.out.print(" Masukan nilai Mahasiswa " + nama[i] + ": ");
//         for (int j = 0; j < nilai[i].length; j++) {
//             System.out.print("Minggu ke-" + (j+1) + ": ");
//             nilai[i][j] = sc.nextInt();
//            }
//         }
//     }
//     public static void tampilNilai() {
//       for (int i = 0; i < nama.length; i++ ) {
//         System.out.print(nama[i] + ": ");
//       for (int j = 0; j < nilai[i].length; j++) {
//         System.out.print(nilai[i][j]);
//       if (j < nilai[0].length - 1) {
//         System.out.print(", ");
//               }
//             }
//         System.out.println();
//         }  
//     }
//      public static void mingguTertinggi() {
//         int maxValue = nilaiTertinggi(nilai);
//         for (int i = 0; j < nilai [0].length; i++) {
//             for (int j = 0; j < nilai[0].length; j++) {
//             if (nilai[i][j] == maxValue) {
//                 System.out.println("Mahasiswa dengan nilai tertinggi adalah " + nama[i] + "dengan nilai " + maxValue);
//               }
//             }
//         }
//      }
//       public static void mahasiswaTertinggi() {
//         int maxValue = nilaiTertinggi(nilai);
//         for (int i = 0; i< nilai.length; i++) {
//             for (int j = 0; j < nilai[0].length; j++) {
//                 if (nilai[i][j] == maxValue) {
//                     System.out.println("Mahasiswa dengan nilai tertinggi " + nama[i] + "dengan nilai " + maxValue);
//                 }
//             }
//         }
//       }
//       public static void nilaiTertinggi() {
//         int maxValue = 0;
//         for (int i = 0; i < array.length; i++) {
//             for (int j = 0; j < array.length; j++) {
//                 if (array[i][j] > maxValue) {
//                     maxValue = array [i][j];
//                 }
//             }
//         }
//          return maxValue;
//       }
//     }
