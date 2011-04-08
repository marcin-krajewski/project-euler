package pl.krajewski.euler.problems.implementations.problems031_040;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.math.GreatestCommonDivisor;

public class Problem033 extends Problem<Integer> {

    @Override
    protected Parameters getParametersForProblem() {
        // TODO Auto-generated method stub
        return null;
    }
    
	@Override
	public Integer resolveProblem() {

		int imod10;
		int idiv10;
		int jmod10;
		int jdiv10;
		double nominatorProduct = 1;
		double denominatorProduct = 1;
		for (int i = 10; i < 100; i++) {
			for (int j = 10; j < 100; j++) {

				imod10 = i % 10;
				jdiv10 = j / 10;

				if (imod10 == jdiv10 % 10) {

					idiv10 = i / 10;
					jmod10 = j % 10;
					double ratio1 = (double) i / (double) j;
					double ratio2 = (double) idiv10 / (double) jmod10;
					if (ratio1 == ratio2 && ratio1 < 1) {
						nominatorProduct *= idiv10;
						denominatorProduct *= jmod10;
					}
				}
			}
		}

		return (int) (denominatorProduct / GreatestCommonDivisor
				.getGreatestCommonDivisor(nominatorProduct, denominatorProduct));
	}

    @Override
    public Integer getCorrectProblemAnswer() {
        return 100;
    }

}
