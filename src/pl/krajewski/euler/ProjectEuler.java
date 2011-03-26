package pl.krajewski.euler;



public class ProjectEuler {

	public static Integer problemCallNumber = 25;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProblemGetter.resolveProblem(problemCallNumber);
		

		// for(double i = 1.0; i<20; i++) {
		// RecurringCycle.getReccuringCycleLengthForNumber(i);
		// }
	}
	
	private static void print(Object a) {
		System.out.println("OBJECT "+a);
	}
	
	
}
