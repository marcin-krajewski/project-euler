package pl.krajewski;

import static org.junit.Assert.*;
import java.util.Date;

import org.junit.Test;

import pl.krajewski.euler.ProblemAnswers;
import pl.krajewski.euler.ProblemGetter;
import pl.krajewski.euler.ProjectEuler;
import pl.krajewski.euler.problems.ProblemResolver;

public class CheckCurrentProblemResultTest {

    @Test
    public void checkIfCurrentProblemNotNullNotEmptyAndCorrect() {
    	
        Integer problemNumber = ProjectEuler.problemCallNumber;
        System.out.println("TESTING SINGLE PROBLEM NUMBER: "+problemNumber);
        
        assertNotNull(problemNumber);
        String expectedProblemResult = getAndTestExpectedProblemResult(problemNumber);
        String problemResult = resolveProblemAndGetFormattedValue(problemNumber);
        
		assertEquals(expectedProblemResult, problemResult);
        
        System.out.println("\tTEST SUCCESSFUL");
    }
    
    private String resolveProblemAndGetFormattedValue(Integer problemNumber) {
    	Long startMillis = new Date().getTime();
    	Object problemResolution = ProblemGetter.getProblemForNumber(problemNumber).resolveProblem();
    	Long resolveMillis = new Date().getTime() - startMillis;
    	System.out.println("TEST RESOLVED WITH TIME "+resolveMillis+" ms");
    	return ProblemGetter.getFormattedResult(problemResolution).trim();
    }

	private String getAndTestExpectedProblemResult(Integer problemNumber) {
		String expectedProblemResult = ProblemAnswers.getProblemResultForProblemNumber(problemNumber);
        assertNotNull(expectedProblemResult);
        expectedProblemResult = expectedProblemResult.trim();
        assertNotSame("", expectedProblemResult);
		return expectedProblemResult;
	}
}
