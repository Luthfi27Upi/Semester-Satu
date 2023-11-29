import java.util.Scanner;

public class TIndividu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();

        if (N >= 4) {
            for (int i = 1; i <= N; i++) {
                // Mencetak spasi untuk mengatur posisi angka
                for (int j = N - i; j >= 1; j--) {
                    System.out.print(" ");
                }
                // Mencetak angka dari 1 hingga i
                for (int k = 1; k <= i; k++) {
                    System.out.print(k);
                }
                System.out.println();
            }
        } else {
            System.out.println("N Minimal 4");
        }
    }
}