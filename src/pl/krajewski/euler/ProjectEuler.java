package pl.krajewski.euler;




public class ProjectEuler {

	
	private static Integer problemCallNumber = 6;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProblemGetter.resolveProblem(problemCallNumber);
	}
	
	private static void print(Object a) {
		System.out.println("OBJECT "+a);
	}
	
	
}
