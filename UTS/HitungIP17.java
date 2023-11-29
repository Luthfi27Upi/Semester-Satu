import java.util.Scanner;

public class HitungIP17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama mahasiswa: ");
        String namaMahasiswa = input.nextLine();

        double totalIP = 0.0;
        int totalSKS = 0;
        int mataKuliahPerbaikan = 0;

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = input.nextInt();

        for (int i = 1; i <= jumlahMataKuliah; i++) {
            input.nextLine(); 
            System.out.println("\nMata Kuliah ke-" + i + ":");
            System.out.print("Nama Mata Kuliah: ");
            String namaMataKuliah = input.nextLine();
            System.out.print("Indeks Nilai (A/B+/B/C+/C/D/E): ");
            String indeksNilai = input.next();
            System.out.print("SKS (Satuan Kredit Semester): ");
            int sks = input.nextInt();

            double nilaiIndeks = konversiIndeksNilai(indeksNilai);

            totalIP += (nilaiIndeks * sks);
            totalSKS += sks;

            if (indeksNilai.equals("D") || indeksNilai.equals("E")) {
                mataKuliahPerbaikan++;
            }
        }

        double IP = totalIP / totalSKS;

        System.out.println("\n-----Hasil Perhitungan IP-----");
        System.out.println("Nama Mahasiswa          : " + namaMahasiswa);
        System.out.println("Indeks Prestasi (IP)    : " + IP);
        System.out.println("Jumlah Mata Kuliah      : " + jumlahMataKuliah);
        System.out.println("Jumlah SKS              : " + totalSKS);
        System.out.println("Jumlah Mata Kuliah yang Perlu Perbaikan/Remidi: " + mataKuliahPerbaikan);
    }

    public static double konversiIndeksNilai(String indeksNilai) {
        switch (indeksNilai) {
            case "A":
                return 4.0;
            case "B+":
                return 3.5;
            case "B":
                return 3.0;
            case "C+":
                return 2.5;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            case "E":
                return 0.0;
            default:
                return 0.0; 
        }
    }
}
