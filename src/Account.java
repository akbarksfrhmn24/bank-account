class Account {
    private double balance;
    public Account(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to your account.");
    }
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrew " + amount + " from your account.");
    }
}
