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
        
        int rowSize = map.k1Values().size();
        for(int i=0; i<rowSize; i++) {
            System.out.print("I: "+i+" - ");
            for(int j=0; j<map.k2ValuesForK1(i).size(); j++) {
                System.out.print(map.get(i, j)+", ");
            }
            System.out.println();
        }
        
        
        
        for(int i=rowSize-1; i>=0; i--) {
            
        }
        
        return 0.0;
    }

}
