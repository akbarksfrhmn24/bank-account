public class SavingAccount extends Account {
    private double InterestRate;

    public SavingAccount(double balance, double InterestRate) {
        super(balance);
        this.InterestRate = InterestRate;
    }

    public void calculateInterest() {
        double interest = (super.getBalance() * InterestRate) / 100;
        super.deposit(interest);
        System.out.println("Interest earned: " + interest);
    }

    public double getBalance() {
        return super.getBalance();
    }
}