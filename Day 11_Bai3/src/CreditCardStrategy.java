/**
 * Created by ThangNguyen on 8/1/2016.
 */
public class CreditCardStrategy implements PaymentStrategy {
    private String name;
    private String cardNumber;
    private int secretPIN;

    public CreditCardStrategy(String name, String cardNumber, int secretPIN) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.secretPIN = secretPIN;
    }

    @Override
    public boolean isValidInfo(Account acc) {
        if (name.equals(acc.getName()) && cardNumber.equals(acc.getCardNumber()) && acc.isRightPIN(secretPIN)) {
            return true;
        }
        return false;
    }
}
