import java.util.Scanner;
public class ArrayKelompok17 {
    public static void main(String[] args){
        Scanner sc17 = new Scanner(System.in);
        int fitur, pilihFilm, pilihKursi, list;
        int jmlTiket = 0;
        int hrgTiket = 30000;
        String nama, yt;

        System.out.println("====================================");
        System.out.println("  Selamat Datang Di Bioskop VNL 1B  ");
        System.out.println("====================================");
        System.out.println("1. Masukkan Nama");
        System.out.println("2. Pilih Film");
        System.out.println("3. Pilih Posisi Kursi");
        System.out.println("4. Jenis Ticket");
        System.out.println("====================================");
        System.out.print("Masukkan Pilihan Anda : ");
        fitur = sc17.nextInt();

        System.out.print("Masukkan Nama Anda : ");
        nama = sc17.next();

        System.out.println("====================================");
        System.out.println("1. Masukkan Nama");
        System.out.println("2. Pilih Film");
        System.out.println("3. Pilih Posisi Kursi");
        System.out.println("4. Jenis Ticket");
        System.out.println("====================================");
        System.out.print("Masukkan Pilihan Anda : ");
        fitur = sc17.nextInt();

        System.out.println("====================================");

        System.out.println("Silakan pilih film yang ingin Anda tonton:");
        System.out.println("1. Spiderman : No Way Home");
        System.out.println("2. Spiderman : Far From Home");
        System.out.println("3. Spiderman : Homecomming");
        System.out.println("====================================");
        System.out.print("Masukkan Pilihan Anda : ");
        pilihFilm = sc17.nextInt();
        
        System.out.println("====================================");

        switch (pilihFilm) {
            case 1:
                System.out.println("Anda memilih Spiderman : No Way Home");
                break;
            case 2:
                System.out.println("Anda memilih Spiderman : Far From home");
                break;
            case 3:
                System.out.println("Anda memilih Spiderman : Homecomming");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }

        System.out.println("====================================");
        System.out.println("1. Masukkan Nama");
        System.out.println("2. Pilih Film");
        System.out.println("3. Pilih Posisi Kursi");
        System.out.println("4. Jenis Ticket");
        System.out.println("====================================");
        System.out.print("Masukkan Pilihan Anda : ");
        fitur = sc17.nextInt();

        System.out.println("====================================");

        System.out.println("Berikut Adalah List Kursi :");
        System.out.println("A1 A2 A3 A4 A5 A6");
        System.out.println("B1 B2 B3 B4 B5 B6");
        System.out.println("C1 C2 C3 C4 C5 C6");
        System.out.println("====================================");
        System.out.print("Masukkan nomor kursi yang dinginkan : ");
        pilihKursi = sc17.nextInt();


        for (int i = 0; i < pilihKursi; i++) {
            System.out.print("Anda Yakin? (y/n) ");
            yt = sc17.next();
            
            
    }
    }
} 
