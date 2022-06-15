package bt.moneyexchange;
import java.util.Scanner;
public class MoneyExchange {
    public static void main(String[] args) {
        int vnd;
        int usd;
        int rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter money vnd: ");
        vnd = scanner.nextInt();
        usd = vnd/rate;
        System.out.println("Số tiền được chuyển đổi là: " + usd);

    }
}
