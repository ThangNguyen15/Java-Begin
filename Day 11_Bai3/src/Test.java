
/**
 * Created by ThangNguyen on 8/1/2016.
 */
public class Test {
    public static void main(String[] args) {
        Account account = new Account("13124214", "Thang", 1234, 1111);
        PaymentStrategy paymentStrategy = new CreditCardStrategy("thang", "13124214",1111);
        System.out.println(account.withdraw(paymentStrategy, 500));
    }
}
