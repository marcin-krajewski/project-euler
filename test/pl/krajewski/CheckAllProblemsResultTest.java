package pl.krajewski;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import pl.krajewski.euler.ProblemGetter;
import pl.krajewski.euler.ProjectEuler;
import pl.krajewski.euler.problems.ProblemResolver;

public class CheckAllProblemsResultTest {

    private Integer problemNumber;
    
    @Before
    public void init() {
        this.problemNumber = ProjectEuler.problemCallNumber;
    }
    
    @Test
    public void checkIfAllTestsReturnsNotNullAndCorrectResult() {
        
        ProblemResolver problemResolver;
        String problemResult;
        for(int problemNumberToCheck=1; problemNumberToCheck<this.problemNumber; problemNumberToCheck++) {
            System.out.println("CHECKING PROBLEM NUMBER "+problemNumberToCheck);
            problemResolver = ProblemGetter.getProblemForNumber(problemNumberToCheck);
            problemResult = ProblemGetter.getFormattedResult(problemResolver.resolveProblem());
            assertNotNull(problemResult);
            assertEquals(problemResult, ProblemGetter.getProblemResultForProblemNumber(problemNumberToCheck));
            System.out.println("\t TEST SUCCESS");
        }
        
    }
}
