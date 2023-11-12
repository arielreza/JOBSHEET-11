import java.util.Arrays;
import java.util.Scanner;

public class no4 {
    public static void main(String[]args){

        Scanner reza4 = new Scanner(System.in);
        String atlet[][] = new String[4][6];
        String cabor, nama;

        for(int i = 0; i < atlet.length; i++){ 
            System.out.println("Cabang olahraga ke-"+(i+1)+": ");
            cabor = reza4.nextLine(); 

            atlet[i][0] = cabor; 
            for(int j = 1; j< atlet[i].length; j++){ 

                System.out.println("Nama atlet ke-"+j+": ");
                nama = reza4.nextLine(); 
                atlet[i][j] = nama; 
            }
        }
        for (int i = 0; i < atlet.length; i++) {
            Arrays.sort(atlet[i], 1, atlet[i].length); 
        }

        
        System.out.println("Data Atlet:"); 
        for (int i = 0; i < atlet.length; i++) { 

            System.out.println("Cabang Olahraga ke-" + (i + 1)+" "+atlet[i][0]);
            for (int j = 1; j < atlet[i].length; j++) {

                System.out.println("Atlet ke-" + j + ": " + atlet[i][j]);
            }
            System.out.println();
        }
    }
}