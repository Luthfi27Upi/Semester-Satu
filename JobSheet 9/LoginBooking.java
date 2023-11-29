import java.util.Scanner;

public class LoginBooking {
    public static void main(String[] args) {
        // Buat array untuk menyimpan informasi pengguna (contoh: username dan password)
        String[] usernames = {"Luthfi", "Nabhan", "Vincent"};
        String[] passwords = {"17", "21", "29"};

        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di Bioskop VNL 1B");

        // Loop tak terbatas untuk meminta masukan pengguna
        while (true) {
            System.out.print("Masukkan username: ");
            String username = input.nextLine();
            System.out.print("Masukkan password: ");
            String password = input.nextLine();

            // Periksa apakah username dan password ada dalam array
            boolean isAuthenticated = false;
            for (int i = 0; i < usernames.length; i++) {
                if (username.equals(usernames[i]) && password.equals(passwords[i])) {
                    isAuthenticated = true;
                    break;
                }
            }

            if (isAuthenticated) {
                System.out.println("Login berhasil. Selamat datang, " + username + "!");
                break; // Keluar dari loop
            } else {
                System.out.println("Login gagal. Silakan coba lagi.");
            }
        }

        // Tutup scanner
        input.close();
    }
}
