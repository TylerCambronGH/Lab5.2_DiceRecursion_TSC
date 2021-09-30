import java.util.Random;

public class RecDiceRoller {
	private Random random;
	private int totalRolls;
	
	public RecDiceRoller() {
		totalRolls = 0;
		random = new Random();
	}
	
	public void roll() {
		totalRolls++;
		int rollSide = random.nextInt(6)+1;
		if (rollSide == 2) {
			System.out.println("You rolled a 2, you win!");
			return;
		} else {
			System.out.println("You rolled a " + rollSide);
			roll();
		}
	}
	
	public int getTotalRolls() {
		return totalRolls;
	}
}
