import java.util.Random;

public class RecDiceRoller {
	Random random;
	public RecDiceRoller() {
		random = new Random();
	}
	
	public void roll() {
		
		int rollSide = random.nextInt(6)+1;
		if (rollSide == 2) {
			System.out.println("You rolled a 2, you win!");
			return;
		} else {
			System.out.println("You rolled a " + rollSide);
			roll();
		}
	}
}
