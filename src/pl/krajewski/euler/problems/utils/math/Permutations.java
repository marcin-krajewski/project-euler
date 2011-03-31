package pl.krajewski.euler.problems.utils.math;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Permutations {

    public static Map<Integer, String> createAllPermutations(Map<Integer, String> map) {
        return getForStart(map, 0);
    }
	public static Map<Integer, String> createPermutations(Map<Integer, String> map, Integer maxInd) {
		return getForStart(map, maxInd);
	}
	
	private static Map<Integer, String> getForStart(Map<Integer, String> map, Integer maxInd) {
		
		Map<Integer, String> l = new HashMap<Integer, String>();
		Set<String> s = new HashSet<String>();
		int ind=1;
		for(int i=1; i<=map.size(); i++) {
			s.clear();
			String string = map.get(i);
			s.add(string);
			for(String ss : getLowestNotUsed(map, s)) {
				l.put(ind++, string+ss);
				if(ind > maxInd && maxInd > 0 ) {
					return l;
				}
			}
		}
		System.out.println("LEN "+l.size());
		return l;
	}
	
	private static List<String> getLowestNotUsed(Map<Integer, String> map, Set<String> used) {
		List<String> l = new ArrayList<String>();
		
		for(int i=1; i<=map.size(); i++) {

			String mapValue = map.get(i);
			if(used.add(mapValue)) {
				List<String> lowestNotUsed = getLowestNotUsed(map, used);
				if(lowestNotUsed.isEmpty()) {
					l.add(mapValue);
				}
				else {
					for(String ss : lowestNotUsed) {
						l.add(mapValue+ss);
					}
				}
				used.remove(mapValue);
			}
		}
		return l;
	}
}
