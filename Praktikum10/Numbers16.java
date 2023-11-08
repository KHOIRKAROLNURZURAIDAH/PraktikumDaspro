package Praktikum10;
import java.util.Arrays;
public class Numbers16 {
    public static void main(String[] args) {
        
        int[][] myNumbres = new int[3][];
        myNumbres[0] = new int[5];
        myNumbres[1] = new int[3];
        myNumbres[2] = new int[1];

        for (int i = 0; i <  myNumbres.length; i++){
            System.out.println(Arrays.toString(myNumbres[i]));
            System.out.println("Panjang baris ke-" + (i+1) + ": " + myNumbres[i].length);
        }
    }
    
}
