package pl.krajewski.euler;

public class ProjectEuler {

	public static Integer problemCallNumber = 52;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProblemGetter.getInstance().resolveProblem(problemCallNumber);
	}

	@SuppressWarnings("unused")
	private static void print(Object a) {
		System.out.println("OBJECT " + a);
	}

}
