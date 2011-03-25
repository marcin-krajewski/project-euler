package pl.krajewski;

import static org.junit.Assert.*;

import org.junit.Test;

import pl.krajewski.euler.ProblemGetter;
import pl.krajewski.euler.ProjectEuler;
import pl.krajewski.euler.problems.ProblemResolver;

public class CheckCurrentProblemResultTest {

    @Test
    public void checkIfCurrentProblemNotNullNotEmptyAndCorrect() {
        Integer problemNumber = ProjectEuler.problemCallNumber;
        
        assertNotNull(problemNumber);
        
        String problemResult = ProblemGetter.getProblemResultForProblemNumber(problemNumber);
        assertNotNull(problemResult);
        
        problemResult = problemResult.trim();
        assertNotSame("", problemResult);
        
        ProblemResolver resolver = ProblemGetter.getProblemForNumber(problemNumber);
        assertEquals(problemResult, ProblemGetter.getFormattedResult(resolver.resolveProblem()).trim());
    }
}
