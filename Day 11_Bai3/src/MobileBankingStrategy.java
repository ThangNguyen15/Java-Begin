/**
 * Created by chabinu on 8/1/2016.
 */
public class MobileBankingStrategy implements PaymentStrategy {
    private String phoneNumber;
    private int secretPIN;

    public MobileBankingStrategy(String phoneNumber, int secretPIN) {
        this.phoneNumber = phoneNumber;
        this.secretPIN = secretPIN;
    }

    @Override
    public boolean isValidInfo(Account acc) {
        if (phoneNumber.equals(acc.getPhoneNumber()) && acc.isRightPIN(secretPIN)) {
            return true;
        }
        return false;
    }
}
