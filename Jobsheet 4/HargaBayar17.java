import java.util.Scanner;
public class HargaBayar17 {
    public static void main(String [] args){
        Scanner input =new Scanner(System.in);
        int harga, jumlah;
        String merk, halaman;
        double dis, total, bayar, jmlDis;

        System.out.println("Masukkan merk buku");
        merk=input.nextLine();
        System.out.println("Masukkan jumlah halaman");
        halaman=input.nextLine();
        System.out.println("Masukkan harga barang yang dibeli");
        harga=input.nextInt();
        System.out.println("Masukkan Jumlah jumlah barang yang dibeli");
        jumlah=input.nextInt();
        System.out.println("Masukkan Jumlah diskon");
        dis=input.nextDouble();

        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;

        System.out.println("Diskon yang anda dapatkan adala " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " +bayar);
    }
}