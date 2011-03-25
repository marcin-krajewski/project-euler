package pl.krajewski.euler.problems.utils.string;

import java.util.Comparator;

public class StringUtils {

	public static Comparator<String> getStringComparator() {
		return new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		};
	}
}
