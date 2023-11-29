import java.util.Scanner;

public class BookingFilm {
    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Tiket Film Yang Ingin Dipesan : ");
        int n = input17.nextInt();

        // Funsgi ini adalah Membaca elemen-elemen array dari user
        int[] arrayInt = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Tiket Film ke-" + i + ": ");
            arrayInt[i] = input17.nextInt();
        }
        System.out.print("Masukkan Tiket Film yang ingin anda dicari: ");
        int key = input17.nextInt();

        int hasil = -1; // Inisialisasi hasil dengan -1, yang menandakan jika key tidak ditemukan.

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }

        if (hasil != -1) {
            System.out.println("Tiket ini adalah pesanan punya Luthfi, Vincent, dan Julian-" + hasil);
        } else {
            System.out.println("Tiket tidak ditemukan dalam pemesanan.");
        }

        input17.close();
    }
}