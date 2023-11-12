import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {

        Scanner reza3 = new Scanner (System.in);
        System.out.print("Masukkan nilai N = "); 
        int N = reza3.nextInt();

        for (int r = 1; r <= N; r++) { 
        for (int a = 1; a <= N; a++) { 
            if (r > 1 && r < N && a > 1 && a < N) {
                System.out.print("  ");
            
            } else {
                System.out.print(N + " ");       
                }
            }
            System.out.println();  

        
    }
}
}
 