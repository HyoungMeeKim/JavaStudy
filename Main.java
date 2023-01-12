import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("가격: ");
        int price = sc.nextInt();
        System.out.print("지불한 금액: ");
        int payment = sc.nextInt();
        int leftMoney = payment - price;
        System.out.println("거스름 돈: " + leftMoney);
        int unit = 50000;
        int num = 0;
        while (leftMoney > 0 && unit >= 100) {
            num++;
            if (leftMoney >= unit) {
                System.out.println(unit + " 원권: " + (leftMoney / unit) + "장");
                leftMoney %= unit;
            }
            if (num % 2 == 1) {
                unit /= 5;
            } else {
                unit /= 2;
            }
        }
        System.out.println("남은 돈: " + leftMoney);
    }
}