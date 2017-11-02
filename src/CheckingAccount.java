public class CheckingAccount extends Account{

    public CheckingAccount(int number){
        super.setAmount(number);
    }

    public void withdraw(int number){
        super.deposit(number);
    }
}
