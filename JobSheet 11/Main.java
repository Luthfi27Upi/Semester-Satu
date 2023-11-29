import java.util.Scanner;

class Bioskop {
    private String namaFilm;
    private int jumlahKursi;
    private int kursiTersedia;

    public Bioskop(String namaFilm, int jumlahKursi) {
        this.namaFilm = namaFilm;
        this.jumlahKursi = jumlahKursi;
        this.kursiTersedia = jumlahKursi;
    }

    public String getNamaFilm() {
        return namaFilm;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public int getKursiTersedia() {
        return kursiTersedia;
    }

    public void pesanTiket(int jumlahTiket) {
        if (jumlahTiket <= kursiTersedia) {
            kursiTersedia -= jumlahTiket;
            System.out.println("Tiket berhasil dipesan untuk film " + namaFilm);
        } else {
            System.out.println("Maaf, kursi tidak cukup untuk film " + namaFilm);
        }
    }
}

class Admin {
    private String username;
    private String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login(String inputUsername, String inputPassword) {
        return username.equals(inputUsername) && password.equals(inputPassword);
    }
}

public class Main {
    public static void main(String[] args) {
        // Inisialisasi data bioskop
        Bioskop bioskop1 = new Bioskop("Avengers: Endgame", 50);
        Bioskop bioskop2 = new Bioskop("Spider-Man: No Way Home", 40);

        // Inisialisasi data admin
        Admin admin = new Admin("admin", "admin123");

        // Login sebagai admin
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username admin: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Password admin: ");
        String inputPassword = scanner.nextLine();

        if (admin.login(inputUsername, inputPassword)) {
            System.out.println("Login berhasil!");

            // Menu admin
            System.out.println("Pilihan Bioskop:");
            System.out.println("1. " + bioskop1.getNamaFilm());
            System.out.println("2. " + bioskop2.getNamaFilm());
            System.out.print("Pilih bioskop: ");
            int pilihanBioskop = scanner.nextInt();

            Bioskop bioskopPilihan = (pilihanBioskop == 1) ? bioskop1 : bioskop2;

            System.out.println("Jumlah kursi tersedia untuk film " + bioskopPilihan.getNamaFilm() + ": "
                    + bioskopPilihan.getKursiTersedia());

            System.out.print("Jumlah tiket yang ingin dipesan: ");
            int jumlahTiket = scanner.nextInt();

            bioskopPilihan.pesanTiket(jumlahTiket);
        } else {
            System.out.println("Login gagal. Program berakhir.");
        }
    }
}
