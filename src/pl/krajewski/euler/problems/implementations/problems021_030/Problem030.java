package pl.krajewski.euler.problems.implementations.problems021_030;

import java.util.HashMap;
import java.util.Map;

import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.string.StringPower;

public class Problem030 extends Problem<Double> {

    private Integer powerIndex = 0;

    @Override
    public Double resolveProblem() {
        
        int power = getParameterForNumber(powerIndex);
        
        Map<Integer, String> mapWithPowers = new HashMap<Integer, String>();
        
        for(int number = 0; number < 10; number++) {
            String numberToPower = StringPower.getPowerForNumberBelow10(number, power);
            mapWithPowers.put(number, numberToPower);
            System.out.println("NUMBER "+number+" - POWER "+power+" -- "+numberToPower);
        }
        
        double sumOfNumbers = 0.0;
        
        return sumOfNumbers;
    }

}
