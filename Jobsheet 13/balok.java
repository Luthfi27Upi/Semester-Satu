import java.util.Scanner;
public class balok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Panjang : ");
        int panjang  = sc.nextInt();
        System.out.print("Masukkan Lebar : ");
        int lebar = sc.nextInt();
        System.out.print("Masukkan Tinggi : ");
        int tinggi = sc.nextInt();
        System.out.print("Volume : " +volume(panjang, lebar, tinggi));
    }
    public static int volume(int panjang, int lebar, int tinggi){
        int vol = panjang * lebar * tinggi;
        return vol;
    }
}
