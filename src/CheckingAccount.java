public class CheckingAccount extends Account {
    private double fee;

    public CheckingAccount(double balance, double fee) {
        super(balance);
        this.fee = fee;
    }

    public void withdraw(double amount) {
        super.withdraw(amount);
        super.withdraw(fee);
    }

    public double getBalance() {
        return super.getBalance();
    }

}

