import java.util.Scanner;
public class TugasMandiri17 {
    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);

        String nama, jenisKelamin;
       // int jumlahMahasiswa =5;

        int i = 1;

        for (i = 1; i <= 4 ; i++) {
            System.out.print("Masukan Nama : ");
            nama = input17.nextLine();
            System.out.print("Masukan Jenis Kelamin (L/P :)");
            jenisKelamin = input17.nextLine();

            if (jenisKelamin.equalsIgnoreCase("P")){
                System.out.println("Nama " + nama);
            }

        }
    }
}