import java.util.Scanner;

public class Kubus17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi kubus : ");
        int sisi = sc.nextInt();
        System.out.println("Volume : " + volume(sisi));
        System.out.println("Luas Permukaan : " + luasper(sisi));
    }

    public static int volume(int sisi) {
        int vol = sisi * sisi;
        return vol;
    }

    public static int luasper(int sisi) {
        int luas = 6 * sisi * sisi;
        return luas;
    }

}