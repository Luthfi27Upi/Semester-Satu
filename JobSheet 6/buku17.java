import java.util.Scanner;

public class buku17 {
    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);

        System.out.print("Masukkan jenis buku (kamus/novel/lainnya) : ");
        String jenisBuku = input17.nextLine().toLowerCase();

        System.out.print("Masukkan jumlah buku yang dibeli : ");
        int jumlahBuku = input17.nextInt();

        System.out.print("Harga Per Buku : ");
        int Harga = input17.nextInt();

        double diskon = 0.0; 

        if (jenisBuku.equals("kamus")) {
            diskon = 0.10; 
            if (jumlahBuku > 2) {
                diskon += 0.02; 
            }
        } else if (jenisBuku.equals("novel")) {
            diskon = 0.08; 
            if (jumlahBuku > 3) {
                diskon += 0.09; 
            } else {
                diskon += 0.01; 
            }
        } else { 
            if (jumlahBuku > 3) {
                diskon = 0.05; 
            }
        }

        double totalDiskon = Harga * diskon * jumlahBuku;
        double hargaSetelahDiskon = Harga *jumlahBuku - totalDiskon;
        System.out.println("Jumlah Diskon : " + (diskon * 100) + "%");
        System.out.println("Harga Setelah Diskon : " + hargaSetelahDiskon);

        input17.close();
    }
}
