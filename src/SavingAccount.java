public class SavingAccount extends Account{
    private double interestRate;


    // konstruktor
    public SavingAccount(double balance, String name, double interestRate) {
        super(balance, name);
        this.interestRate = interestRate;
    }


    // uppdaterar kontots pengar
    public double addInterest(){
        this.balance *= this.interestRate;
        //  return this.balance * this.interestRate;
        return this.balance;

    }


    // överför pengar från detta kontot till ett konto
    public void transfer(Account account, double amount){
        this.balance -= amount;
        account.balance += amount;


    }


}




