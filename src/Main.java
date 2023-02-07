import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        int n = scanner.nextInt();

        for(int k = (n - 1 ) ; k >= 0  ; k--) {

            for (int m = 1; m <= (n - k); m++) {
                System.out.print(" ");

            }
            for (int x = 1;  x <= (2 * k + 1); x ++){
                System.out.print("*");

            }
            System.out.println(" ");
        }
    }
}