package ch11.exam2;

public class AccountTest {
    public static void main(String[] args) {
        Account a1 = new Account();
        AccountClient c1 = new AccountClient(0, "Dogukan", a1);
        a1.customer = c1;

        //c1.getInfo();

        Account a2 = new Account();
        AccountClient c2 = new AccountClient(1, "Mehmet", a2);
        a2.customer = c2;

        //c2.getInfo();

        c1.paraYatirma(10000);
        c2.paraYatirma(20000.0);
        c2.paraCekme(3000.0);
        c1.paraCekme(2000.0);
        //c1.account.getBalance();

        c1.havale(c1, c2, 500);
        //c1.account.getBalance();
        //c2.account.getBalance();
    }
}
