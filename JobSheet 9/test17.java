import java.util.Scanner;

public class test17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] kursi = new String[5][10];
        int jumlahTiket = 0;
        int hargaTiket = 50000;
        int totalHarga = 0;

        System.out.println("Selamat datang di Bioskop XYZ!");
        System.out.println("Silakan pilih film yang ingin Anda tonton:");
        System.out.println("1. Film A");
        System.out.println("2. Film B"); 
        System.out.println("3. Film C");

        System.out.print("Masukkan pilihan Anda: ");
        int pilihanFilm = input.nextInt();

        switch (pilihanFilm) {
            case 1:
                System.out.println("Anda memilih Film A.");
                break;
            case 2:
                System.out.println("Anda memilih Film B.");
                break;
            case 3:
                System.out.println("Anda memilih Film C.");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        System.out.print("Berapa banyak tiket yang ingin Anda pesan? ");
        jumlahTiket = input.nextInt();

        for (int i = 0; i < jumlahTiket; i++) {
            System.out.print("Masukkan nomor kursi yang diinginkan (baris kolom): ");
            String nomorKursi = input.next();
            int baris = Integer.parseInt(nomorKursi.substring(0, 1));
            int kolom = Integer.parseInt(nomorKursi.substring(1, 2));

            if (kursi[baris][kolom] == null) {
                kursi[baris][kolom] = "X";
                totalHarga += hargaTiket;
            } else {
                System.out.println("Maaf, kursi tersebut sudah dipesan.");
                i--;
            }
        }

        System.out.println("\nTerima kasih telah memesan tiket di Bioskop XYZ!");
        System.out.println("Berikut adalah rincian pesanan Anda:");
        for (int i = 0; i < kursi.length; i++) {
            for (int j = 0; j < kursi[i].length; j++) {
                if (kursi[i][j] != null) {
                    System.out.printf("Kursi %d%d: Rp %d\n", i, j, hargaTiket);
                }
            }
        }
        System.out.printf("\nTotal harga: Rp %d\n", totalHarga);
    }
}
