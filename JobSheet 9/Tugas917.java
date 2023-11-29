import java.util.Scanner;
public class Tugas917 {
    public static void main(String[] args){
        Scanner input17 = new Scanner(System.in);
        
        System.out.print("Masukkan Banyaknya Elemen : ");
        int elemen = input17.nextInt();
        int[] nilaiElemen = new int[elemen];

        for (int i=0; i<elemen; i++){
            System.out.print("Masukkan Nilai Elemen Ke-"+(i+1)+" : ");
            nilaiElemen[i] = input17.nextInt();
        }
        int nilaiTertinggi = nilaiElemen[0];
        int nilaiTerendah = nilaiElemen[0];
        int totalNilai = 0;

        for (int i=0; i<elemen; i++){
            if (nilaiElemen[i] > nilaiTertinggi){
                nilaiTertinggi = nilaiElemen[i];
            }
            if (nilaiElemen[i] < nilaiTerendah){
                nilaiTerendah = nilaiElemen[i];
            }
            totalNilai += nilaiElemen[i];
        }
        double nilaiRataRata = (double) totalNilai/elemen;

        System.out.println("Nilai Tertinggi : "+ nilaiTertinggi);
        System.out.println("Nilai Terendah : "+ nilaiTerendah);
        System.out.println("Nilai Rata-Rata : "+ nilaiRataRata);
    }
}