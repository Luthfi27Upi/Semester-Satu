import java.util.Scanner;

public class ArrayRataNilai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Jumlah Mahasiswa: ");
        int jmlMhs = sc.nextInt();
        int [] nilahMhs = new int[jmlMhs];
        double total = 0, rata2, ttlLulus = 0, ttlTdkLulus = 0, rataTdkLls;
        int jmlLulus = 0;

        for (int i = 0; i < nilahMhs.length; i++) {
            System.out.print("Masukan Nilai Mahasiswa ke "+(i+1)+" : ");
            nilahMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilahMhs.length; i++) {
            total += nilahMhs[i];
            if (nilahMhs[i] > 70) {
                ttlLulus += nilahMhs[i];
                jmlLulus++;
            } else {
                ttlTdkLulus += nilahMhs[i];
            }
        }
        System.out.println("Banyak Mahasiswa yang lulus = "+jmlLulus);
        rata2 = ttlLulus/jmlLulus;
        System.out.println("Rata - Rata Nilai Mahasiswa Yang Lulus = " + rata2);
        rataTdkLls = ttlTdkLulus / (nilahMhs.length - jmlLulus);
        System.out.println("Rata - Rata Nilai Mahasiswa Yang tidak Lulus = " + rataTdkLls);
    }
}