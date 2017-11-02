public class Account {
    int name;
    int deposit;
    private int amount;


    public void deposit(int number){
    this.amount+=number;
    }
    public int getName(){
        return name;
    }
    public void setAmount(int amount){
        this.amount=amount;
    }
    public int getAmount(){
        return  amount;

    }

    public static void main(String[] args){
        SavingsAccount sa = new SavingsAccount(10000);
        System.out.println("account name: " + sa.getName());
        System.out.println("initial amount: " + sa.getAmount());
        sa.deposit(5000);
        System.out.println("new amount after deposit: " + sa.getAmount());

        CheckingAccount ca = new CheckingAccount(20000);
        System.out.println("account name: " + ca.getName());
        System.out.println("initial amount: " + ca.getAmount());
        ca.deposit(6000);
        System.out.println("new amount after deposit: " + ca.getAmount());
        ca.withdraw(3000);
        System.out.println("new amount after withdrawal: " + ca.getAmount());

    }
}
