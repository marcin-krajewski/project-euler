package pl.krajewski;

import static org.junit.Assert.*;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import pl.krajewski.euler.ProblemGetter;
import pl.krajewski.euler.ProjectEuler;
import pl.krajewski.euler.problems.ProblemResolver;

public class CheckAllProblemsResultTest {

    private Integer problemNumber;
    
    private Map<Integer, Long> callTimes = new HashMap<Integer, Long>(); 
    
    @Before
    public void init() {
        this.problemNumber = ProjectEuler.problemCallNumber;
    }
    
    @Test
    public void checkIfAllTestsReturnsNotNullAndCorrectResult() {
        
        ProblemResolver problemResolver;
        String problemResult;
        Date start, end;
        for(int problemNumberToCheck = 1; problemNumberToCheck <= this.problemNumber; problemNumberToCheck++) {
            System.out.println("CHECKING PROBLEM NUMBER "+problemNumberToCheck);
            problemResolver = ProblemGetter.getProblemForNumber(problemNumberToCheck);
            start = new Date();
            problemResult = ProblemGetter.getFormattedResult(problemResolver.resolveProblem());
            end = new Date();
            callTimes.put(problemNumberToCheck, end.getTime()-start.getTime());
            assertNotNull(problemResult);
            assertEquals(problemResult, ProblemGetter.getProblemResultForProblemNumber(problemNumberToCheck));
            System.out.println("\t TEST SUCCESS");
        }
        printTimes();
    }
    
    private void printTimes() {
    	for(Integer number=1; number<=this.problemNumber; number++) {
    		System.out.println("NUMBER: "+number+" -- TIME: "+(new DecimalFormat("0.000")).format((double)callTimes.get(number)/1000.0)+"s");
    	}
    }
}
