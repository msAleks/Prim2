public class Main {

    public static void main(String[] args) {

        int balance = 100;
        int amountMobileAccount = 1100;
        int bonus = amountMobileAccount / 100;

        if (amountMobileAccount > 1000) {
            bonus = amountMobileAccount / 100;
        } else if (amountMobileAccount < 1000) {
            bonus = 0;
        }
        System.out.println("Сумма бонуса: " + bonus);
    }
}