import java.util.Scanner;
public class Percobaan2After {
    static int hitungPangkat(int x, int y){
        if (y==0){
            return (1);
        } else {
            return (x *hitungPangkat(x, y - 1));
        }        
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int bilangan, pangkat;   

    System.out.println("Bilangan yang dihitung: ");
    bilangan = sc.nextInt();
    System.out.println("Pangkat : ");
    pangkat =sc.nextInt();
    System.out.println("Hasil Perhitungan : ");
    for (int i=0; i<= pangkat; i++){
        if (i==pangkat){
            System.out.print(bilangan);
        } else {
            System.out.print(bilangan + "x");
        }
    }

    System.out.println(" = " + hitungPangkat(bilangan, pangkat));
    }
}