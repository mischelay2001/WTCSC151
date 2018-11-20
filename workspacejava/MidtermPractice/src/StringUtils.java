
public class StringUtils {

	/**
	 * pad on the left with spaces--left out of instructions (maybe too much)
	 * 
	 * @param current
	 * @param numOfChars
	 * @return
	 */
	public static String padLeft(String current, int numOfChars) {
		return padLeft(current, numOfChars, ' ');
	}

	/**
	 * pad on the left with a given character
	 * 
	 * @param current
	 * @param numOfChars
	 * @param paddingChar
	 * @return
	 */
	public static String padLeft(String current, int numOfChars, char paddingChar) {
		String buffer = "";
		for (int i = 0; i < numOfChars; i++) {
			buffer += paddingChar;
		}
		return buffer + current;
	}

	public static String padRight(String current, int numOfChars, char paddingChar) {
		String buffer = "";
		for (int i = 0; i < numOfChars; i++) {
			buffer += paddingChar;
		}
		return current + buffer;
	}
	
	/**
	 * pad on the right with spaces--left out of instructions (maybe too much)
	 * 
	 * @param current
	 * @param numOfChars
	 * @return
	 */
	public static String padRight(String current, int numOfChars) {
		return padRight(current, numOfChars, ' ');
	}

	public static String zapRight(String current, int numOfChars) {
		return current.substring(0, current.length() - numOfChars);
	}
	
	public static String zapLeft(String current, int numOfChars) {
		return current.substring(numOfChars);
	}

}
