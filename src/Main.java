import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account acc = new Account(1000.0, "Kajsa");

        SavingAccount savings = new SavingAccount(1000.0, "Alfred", 1.02);
        System.out.println(savings.getBalance());

        System.out.println(savings.addInterest());

        savings.transfer(acc, 200);
        System.out.println(acc.getBalance());
        System.out.println(savings.getBalance());

        SavingAccount savings2 = new SavingAccount(1000.0, "Martin", 1.5);
        savings.transfer(savings2, 300);
        System.out.println(savings2.getBalance());

//        Account davidsAccount = new Account(1000.0, "David");
//        System.out.println(davidsAccount.getCount());
//        Account savingAccount = new Account(0, "lois");  // 0 i den
//        System.out.println(davidsAccount.getCount());  // blir nu 2 eftersom static påverkar alla gemensamt
//
//        Account saving2 = new Account(1500.0, "Alfred");
//        Account saving3 = new Account(2000.0, "Martin");
//        Account saving4 = new Account(3000.0, "Michael");
//
//        ArrayList<Account> accounts = new ArrayList<>();
//
//        accounts.add(davidsAccount);
//        accounts.add(savingAccount);
//        accounts.add(saving2);
//        accounts.add(saving3);
//        accounts.add(saving4);
//
//        System.out.println(accounts.size());
//        // String test = saving2.toString();
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Skapa konton");
//        String input = "";
//
//        while (!input.equals("done")) {
//            System.out.println("Skriv namn på konto");
//            input = sc.nextLine();
//            Account newAccount = new Account(0.0, input);
//            accounts.add(newAccount);
//        }
//
//
//        double money = saving2.withdraw(400.0);
//        saving4.deposit(money);
//
//        for (Account account : accounts) {
//            account.deposit(100.0);
//        }
//
//        for (Account account : accounts) {
//            account.withdraw(19.0);
//        }
//
//        for (Account account : accounts) {
//            // System.out.println("name: " + account.getName() + "saldo: " + account.getBalance()); // gjorde om denna i account klass
//            System.out.println(account);
//        }
//        // skriva ut varje konto hur mycket
//        for (Account acc : accounts) {
//            System.out.println(acc.getBalance());
//        }
//
//
//        // Account account3 = davidsAccount;   // samma konto
//
//        davidsAccount.setName("David");  // sätter namnet
//        String name = davidsAccount.getName();   // får ut namnet
//
//        davidsAccount.deposit(1000.0);
//        savingAccount.deposit(1500.0);
//
//
//        System.out.println("Davids; " + davidsAccount.getBalance());
//        System.out.println("Saving; " + savingAccount.getBalance());
//
//
//        //  double money = davidsAccount.withdraw(400.0);
//        savingAccount.deposit(money);
//        System.out.println("Du tog ut: " + money);
//
//        System.out.println("Davids; " + davidsAccount.getBalance());
//        System.out.println("Saving; " + savingAccount.getBalance());
//
//
    }
}