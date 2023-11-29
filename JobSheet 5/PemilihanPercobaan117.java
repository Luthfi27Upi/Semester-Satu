import java.util.Scanner;

public class PemilihanPercobaan117 {
    public static void main(String [] args){
        Scanner input17 = new Scanner(System.in);
        System.out.print("Masukan Angka : ");
        int angka = input17.nextInt();

        String jenisBilangan = (angka % 2 ==0) ? "Genap" : "Ganjil";
        System.out.println("Angka : " + angka + " Adalah Bilangan " + jenisBilangan);
        
    }
}
