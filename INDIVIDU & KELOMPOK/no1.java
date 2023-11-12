import java.util.Scanner;

public class no1 {
    public static void main(String[] args) {

        Scanner reza = new Scanner(System.in);
        System.out.print("Masukkan Nilai ke-N: ");
        int N = reza.nextInt();

        for (int r = 1; r <= N; r++) {
            
            for (int j = 1; j <= N - r; j++) {
                System.out.print(" ");
            }

            for (int a = 1; a <= r; a++) {
                System.out.print(a);
            }

                System.out.println();
        }
    }
}
