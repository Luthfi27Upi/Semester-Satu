import java.util.Scanner;
public class ifkondisi17 {
    public static void main(String [] args){
        Scanner sc17 = new Scanner(System.in);

        System.out.print("Masukkan Suhu : ");
        int suhu = sc17.nextInt();

        if(suhu<17){
            System.out.println("Silahkan menggunakan jaket");
        }
        if(suhu<21){
            System.out.println("Silahkan pakai baju tebal");
        }
        else{
            System.out.println("Silahkan pakai topi");
        }

    }
}