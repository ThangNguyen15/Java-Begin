/**
 * Created by ThangNguyen on 7/31/2016.
 */
public class Account {
    private String userId;
    private String name;
    private String phoneNumber;
    private String cardNumber = CreditCardNumberGenerator.generateMasterCardNumber();
    private double balance;
    private int secretPIN;

    public Account(String userId, String name, int secretPIN) {
        this.userId = userId;
        this.name = name;
        this.secretPIN = secretPIN;
    }

    public Account(String userId, String name, double balance, int secretPIN) {
        this.userId = userId;
        this.name = name;
        this.balance = balance;
        this.secretPIN = secretPIN;
    }

    public double deposit(double value) {
        this.balance = balance + value;
        return balance;
    }

    public double withdraw(PaymentStrategy payStrg, double value) {
        if (payStrg.isValidInfo(this) && this.balance >= value) {
            this.balance = balance - value;
        }
        return balance;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isRightPIN(int pin) {
        if (pin == secretPIN) {
            return true;
        }
        return false;
    }
}
