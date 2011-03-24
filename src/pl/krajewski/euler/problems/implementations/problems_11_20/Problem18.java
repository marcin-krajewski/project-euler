package pl.krajewski.euler.problems.implementations.problems_11_20;

import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.FileReader;
import pl.krajewski.euler.problems.utils.MapDoubleKey;

public class Problem18 extends Problem<Double> {

    @Override
    public Double resolveProblem() {
        String fileName = getParameterForNumber(0);
        
        MapDoubleKey<Integer, Integer, Integer> map = 
            FileReader.getLinesWithNumbersSeparatedWithSpaceForFileName(fileName);
        
        return updateRoads(map);
    }
    
    public Double updateRoads(
        MapDoubleKey<Integer, Integer, Integer> map) {
        
        MapDoubleKey<Integer, Integer, Double> was = 
            new MapDoubleKey<Integer, Integer, Double>();

        double max = 0.0;
        int row = map.k1Values().size()-1;
        for(int col : map.k2ValuesForK1(row)) {
            double best = best(row, col, map, was);
            if(best > max) {
                max = best;
            }
        }
        return max;
    }

    private Double best(int row, int col, MapDoubleKey<Integer, Integer, Integer> map,
        MapDoubleKey<Integer, Integer, Double> was) {
        
        Integer integer = map.get(row, col);
        if(integer == null) {
            return null;
        }
        
        Double returnValue = was.get(row, col); 
        
        Double bestL = null;
        Double bestR = null;
        
        if(returnValue == null) {
            if(row > 0 && returnValue == null) {
                bestL = best(row-1, col-1, map, was);
                bestR = best(row-1, col, map, was);
                
                if(bestL == null) {
                    returnValue = bestR+integer;
                }
                else if(bestR == null) {
                    returnValue = bestL+integer;
                }
                else {
                    returnValue = Math.max(bestL, bestR)+integer;
                }
            }
            else {
                returnValue = Double.valueOf(integer+""); 
            }
            was.put(row, col, returnValue);
        }
        return returnValue;
    }

}
