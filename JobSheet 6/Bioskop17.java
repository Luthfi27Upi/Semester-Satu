import java.util.Scanner;

public class Bioskop17 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int jmlKursi;
    char namaFilm;
    
    System.out.print("Jumlah Kursi Yang Di Inginkan : ");
    jmlKursi = input.nextInt();
    System.out.print("Film Yang Di Inginkan : (Barbie / Spiderman : ) ");
    namaFilm = input.next().charAt(0);

    if(jmlKursi <5) {
        System.out.println("Tersedia");
    }else {
        System.out.println("Tidak Tersedia");

    if(namaFilm == 'B') {
        System.out.println("Tersedia");
    }else {
        System.out.println("Tidak Tersedia");
    }


    }
}
}