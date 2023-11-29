import java.util.Scanner;
public class UcapanTerimakasih_17 {
    public static String PenerimaUcapan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }
    public static void UcapanTerimakasih(){
        String nama = PenerimaUcapan();
        System.out.println("Thankyou "+nama+" for being te best teacher in the world.\n"+
        "You inspired in me a love for learning and made m feel like i could ask you anything");
    }
    public static void main(String[] args) {
        UcapanTerimakasih();
    }
}