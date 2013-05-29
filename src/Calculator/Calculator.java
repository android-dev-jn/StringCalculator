package Calculator;

public class Calculator {

	public static Object add() {
		return 0;
	}

	public static Object add(String str) {
		if (str == null) {
			return null;
		} else if (str.equals("")) {
			return 0;
		} else {
			String[] tokens = str.split(",");
			int result = Integer.parseInt(tokens[0]) + Integer.parseInt(tokens[1]); 
			return result;
		}
	}

}
