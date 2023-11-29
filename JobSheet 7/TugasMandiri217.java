import java.util.Scanner;
public class TugasMandiri217 {
    public static void main(String[] args) {
        Scanner input17 = new Scanner(System.in);

        int angka=25, faktorial=0;
        
        for (int i = 1; i <=25; i++) {
            faktorial+=i;
        }
        System.out.println("jumlah deret bilangan " + angka +  " adalah " + faktorial);
    }   
}