package ch11.exam2;

public class AccountClient {
    private int no;
    private String name;
    Account account;

    AccountClient(int no, String name, Account account) {
        this.no = no;
        this.name = name;
        this.account = account;
    }

    void paraYatirma(double money) {
        account.paraYatirma(money);
    }

    void paraCekme(double money) {
        account.paraCekme(money);
    }

    void havale(AccountClient c1, AccountClient c2, double price) {
        account.havaleGonderme(c1, c2, price);
    }

    void getInfo() {
        System.out.println("Hesabin sahibi : " + name);
    }

    String getName(){
        return name;
    }

}
