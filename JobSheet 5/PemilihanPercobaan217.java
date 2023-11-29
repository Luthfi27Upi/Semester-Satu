import java.util.Scanner;

public class PemilihanPercobaan217 {
    public static void main(String[] args) {
    Scanner input17 = new Scanner(System.in);
    System.out.println("Nilai Uas: ");
    float Uas = input17.nextFloat();
    System.out.println("Nilai Uts: ");
    float Uts = input17.nextFloat();
    System.out.println("Nilai Kuis: ");
    float Kuis = input17.nextFloat();
    System.out.println("Nilai Tugas: ");
    float Tugas = input17.nextFloat();
    
    float total = (Uas * 0.40F) + (Uts * 0.30F) + (Kuis * 0.10F) + (Tugas * 0.20F);
    String message = total <65 ? "Remidi" : "Tidak Remidi", nilaiHuruf = " Null ", kualifikasi = " Null";
    System.out.println("Nilai Akhir = " + total + " Keterangan: " + message );
    double nilaiSetara;


    if (total >80 && total <= 100) {
        nilaiHuruf = "A";
        nilaiSetara = 4;
        kualifikasi = " Sangat Baik ";
        System.out.println(nilaiHuruf);System.out.println(nilaiSetara);System.out.println(kualifikasi);
        }

    else if (total >73 && total <= 80) {
        nilaiHuruf = "B+";
        nilaiSetara = 3.5;
        kualifikasi = " Lebih Dari Baik ";
        System.out.println(nilaiHuruf);System.out.println(nilaiSetara);System.out.println(kualifikasi);        
        }

    else if (total >65 && total <= 73) {
        nilaiHuruf = "B";
        nilaiSetara = 3;
        kualifikasi = " Baik ";
        System.out.println(nilaiHuruf);System.out.println(nilaiSetara);System.out.println(kualifikasi);
        }
    else if (total >60 && total <= 65) {
        nilaiHuruf = "C+";
        nilaiSetara = 2.5;
        kualifikasi = " Lebih dari Cukup ";
        System.out.println(nilaiHuruf);System.out.println(nilaiSetara);System.out.println(kualifikasi);
        }
    else if (total >50 && total <= 60) {
        nilaiHuruf = "C";
        nilaiSetara = 2;
        kualifikasi = " Cukup ";
        System.out.println(nilaiHuruf);System.out.println(nilaiSetara);System.out.println(kualifikasi);
        }
    else if (total >39 && total <= 50) {
        nilaiHuruf = "D";
        nilaiSetara = 1;
        kualifikasi = " Kurang ";
        System.out.println(nilaiHuruf);System.out.println(nilaiSetara);System.out.println(kualifikasi);
        }
    else if (total <= 39) {
        nilaiHuruf = "E";
        nilaiSetara = 0;
        kualifikasi = " Gagal ";
        System.out.println(nilaiHuruf);System.out.println(nilaiSetara);System.out.println(kualifikasi);
        }
    }
}