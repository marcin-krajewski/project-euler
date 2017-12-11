package pl.com.simbit.euler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pl.com.simbit.euler.problems.ProblemResolver;

public class CheckCurrentProblemResultTest {
	
	private Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void checkIfCurrentProblemNotNullNotEmptyAndCorrect() {
    	
        Integer problemNumber = ProjectEuler.problemCallNumber;
        logger.info("TESTING SINGLE PROBLEM NUMBER: "+problemNumber);
        
        assertNotNull(problemNumber);
        
        Long startMillis = new Date().getTime();
        ProblemResolver problemForNumber = ProblemGetter.getInstance().getProblemForNumber(problemNumber);
        Object expectedProblemResult = problemForNumber.getCorrectProblemAnswer();
        Object problemResult = problemForNumber.resolveProblem();
        Long resolveMillis = new Date().getTime() - startMillis;

        assertNotNull(expectedProblemResult);
        assertNotNull(problemResult);
		assertEquals(expectedProblemResult, problemResult);
        
        logger.info("\tTEST SUCCESSFUL WITH TIME "+resolveMillis);
    }
}
