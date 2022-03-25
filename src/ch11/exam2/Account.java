package ch11.exam2;

public class Account {
    private double balance;
    AccountClient customer;
    private double havaleUcreti = 3.0;

    Account(){
        this.balance = 0.0;
    }

    void setBalance(double balance){
        this.balance = balance;
    }

    void getBalance(){
        System.out.println("Hesap Bakiyeniz : " + balance);
    }

    void paraYatirma(double money){
        double newBalance = balance + money;
        setBalance(newBalance);
    }

    void paraCekme(double money){
        double newBalance = balance - money;
        this.setBalance(newBalance);
    }

    void havaleGonderme(AccountClient customer1, AccountClient customer2, double money){
        double newMoneyGonderen = customer1.account.balance - (money + havaleUcreti);
        double newMoneyAlan = customer2.account.balance + money;
        System.out.println("Degerli musterimiz " + customer1.getName() + " bey hesap onceki bakiyeniz ; " + balance + " \nIslem sonrasi guncel bakiyeniz ; " + newMoneyGonderen);
        customer1.account.setBalance(newMoneyGonderen);
        customer2.account.setBalance(newMoneyAlan);
    }

}
