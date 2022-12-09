public class Main {
    public static void main(String[] args) {
        // ini adalah rekening utama
        Account akbar = new Account(1000000);

        // ini adalah rekening tabungan
        SavingAccount akbarSaving = new SavingAccount(1000000, 10);

        // ini adalah rekening giro
        CheckingAccount akbarChecking = new CheckingAccount(1000000, 1000);

        // akbar melakukan deposit sebesar 500000 di rekening utama
        System.out.println("==========Rekening Utama==========");
        akbar.deposit(500000);
        akbar.withdraw(200000);
        System.out.println("Saldo saat ini adalah : " + akbar.getBalance());
        System.out.println("\n==========Rekening Tabungan==========");
        akbarSaving.calculateInterest();
        System.out.println("Saldo saat ini adalah : " + akbarSaving.getBalance());
        System.out.println("\n==========Rekening Giro==========");
        akbarChecking.withdraw(500000);
        System.out.println("Saldo saat ini adalah : " + akbarChecking.getBalance());
    }
}