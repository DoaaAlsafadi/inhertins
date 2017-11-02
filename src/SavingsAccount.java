import java.util.Random;

public class SavingsAccount extends Account {
public SavingsAccount(int number){
    super.setAmount(number);
    Random rand = new Random();

    super.name = rand.nextInt(50000) + 1;

    }
}
