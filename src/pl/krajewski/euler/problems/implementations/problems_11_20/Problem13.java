package pl.krajewski.euler.problems.implementations.problems_11_20;

import java.util.ArrayList;
import java.util.List;

import pl.krajewski.euler.problems.Parameters;
import pl.krajewski.euler.problems.Problem;
import pl.krajewski.euler.problems.utils.FileReader;

public class Problem13 extends Problem<String> {

    @Override
    public String resolveProblem() {
        
        String fileName = getParameterForNumber(0);
        int count = getParameterForNumber(1);
        int digits = getParameterForNumber(2);
        
        String[] lines = FileReader.readProblemFileLines(fileName);
        
        List<Integer> nums = new ArrayList<Integer>();
        int c = 0;
        for(int i=digits-1; i>=0; i--) {
            int sum = c;
            for(String s : lines) {
                int num = Integer.parseInt(Character.toString(s.charAt(i)));
                sum += num;
            }
            int result = sum%10;
            c = (sum/10);
            nums.add(result);
            if(i == 0) {
                nums.add(c);
            }
        }
        
        StringBuilder sb = new StringBuilder(); 
        for(int i=nums.size()-1, j=0; j<count && i>=0; j++, i--) {
            sb.append(nums.get(i));
        }
        
        return sb.toString().substring(0, 10);
    }
    
    

}
