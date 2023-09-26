public class Account {

    protected double balance;
    protected String name;


    public Account(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }
}












//public class Account {
//
//    private double balance;
//    private String name;
//
//    private static int count = 0;   // gemensam variabel för alla objekt, kallas klass variabel
//
//    public Account() {
//        this.balance = 0.0;
//        this.count++;
//
//    }
//
//    public Account(double balance) {
//        this.balance = balance;
//        this.count++;
//    }
//
//    public Account(double balance, String name) {
//        this.balance = balance;
//        this.name = name;
//        this.count++;
//    }
//
//
//    public String getName() {
//        return name;
//    }
//
//    public int getCount() {
//        return count;
//    }
//
//    public void setName(String name) { // ska inte returnera något så väljer void
//        this.name = name;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void deposit(double amount) {
//        this.balance += amount;  // balance = balance + amount;
//
//    }
//
//    public double withdraw(double amount) {
//        if (this.balance >= amount && amount > 0) { // går bra utan this, finns bara en den kan peka på just nu
//            this.balance -= amount;
//            return amount;
//        }
//        return 0;
//    }
//
//    /* public double bankWithdrawal(double amount) {
//        if (amount < 0) {
//            this.balance -= amount;
//            return amount;
//        }
//    } */
//
//    public String toString() {
//        return "name: " + name + "saldo: " + balance;
//    }
//
//}
