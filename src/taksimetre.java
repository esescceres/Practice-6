import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args ) {
        int km;
        double perkm = 2.20, total , startPrice = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi kilometre cinsinden giriniz : ");
        km = input.nextInt();

        total = (km * perkm);
        total += startPrice;
        System.out.println(total);


    }

}
