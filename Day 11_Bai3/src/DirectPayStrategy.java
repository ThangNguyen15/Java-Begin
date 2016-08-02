/**
 * Created by ThangNguyen on 8/1/2016.
 */
public class DirectPayStrategy implements PaymentStrategy {
    private String userId;
    private int secretPIN;

    public DirectPayStrategy(String userId, int secretPIN) {
        this.userId = userId;
        this.secretPIN = secretPIN;
    }

    @Override
    public boolean isValidInfo(Account acc) {
        if (userId.equals(acc.getUserId()) && acc.isRightPIN(secretPIN)) {
            return true;
        }
        return false;
    }
}
