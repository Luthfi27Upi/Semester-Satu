import java.util.Scanner;

public class LoginBioskop {
    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);

        String name = "user";
        String pass = "pass";

        int i = 1;
        do{
            System.out.print("nama : ");
            name = sc17.nextLine();
            System.out.print("Password: ");
            pass = sc17.nextLine();

            if (name.equals("user") && pass.equals("pass")){
                System.out.println("Masuk System Booking");
                break;
            }
            i++;
        } while (i<=3) ;
        if (i>3) {
            System.out.println("Perbarui akun anda");
        }
    }

}