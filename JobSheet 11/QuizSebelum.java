import java.util.Scanner;
import java.util.Random;
public class QuizSebelum {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner (System.in);

        char menu = 'y';
        do{
            int number = random.nextInt(10)+1;
            boolean success = false;
            do{
                System.out.print("Tebak Angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                success = (answer==number);
            }while(!success);
            System.out.print("Apakah Anda Ingin Mengulang Permainan (Y/y)?");
            menu = input.nextLine().charAt(0);
        }while(menu=='y' || menu=='Y');
    }
}
