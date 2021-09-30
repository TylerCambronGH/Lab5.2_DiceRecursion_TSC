
public class RecDieRollerDriver {
	public static void main(String[] args) {
		RecDiceRoller dice = new RecDiceRoller();
		for (int i=0; i<1000; i++) {
			dice.roll();
		}
		System.out.println("There was " + dice.getTotalRolls() + " total rolls for 1000 2's.");
		System.out.println("There was a mean of " + (dice.getTotalRolls()/1000.0) + " to get a 2.");
	}
}
