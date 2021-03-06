package pl.com.simbit.euler.problems;

import java.util.HashMap;
import java.util.Map;

public class Parameters {

	protected Map<Integer, Object> parameters;

	public Parameters() {
		this.parameters = new HashMap<Integer, Object>();
	}

	public Parameters(Object... parameters) {
		this();
		int length = parameters.length;
		if ((parameters == null) || (length == 0)) {
			return;
		}
		for (int i = 0; i < length; i++) {
			this.parameters.put(i, parameters[i]);
		}
	}

	public Object getParameterForNumber(Integer number) {
		if (number == null) {
			return null;
		}
		return this.parameters.get(number);
	}

	@Override
	public String toString() {
		String string = "PARAMETERS: [";
		int i = 0;
		int lenMinus1 = this.parameters.size() - 1;
		for (int key : this.parameters.keySet()) {
			string += this.parameters.get(key);
			if (i < lenMinus1) {
				string += ", ";
			}
			i++;

		}
		return string + "]";
	}
}
