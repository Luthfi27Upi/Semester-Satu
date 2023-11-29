public class PenjumlahanRekursif {
    public static int jumlahRekursif(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + jumlahRekursif(n - 1);
        }
    }
    public static void main(String[] args) {
        int n = 8;
        int hasil = jumlahRekursif(n);
        System.out.println("Hasil penjumlahan = " + hasil);
    }
}