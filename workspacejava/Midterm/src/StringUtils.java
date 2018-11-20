
public class StringUtils {
	
	/**
	 * copy
			Write a method String copy(String currentString, int startPosition, int onePastLastPosition).  
			This method returns a substring of currentString, including startPosition, but ending before onePastLastPosition.  
			For example, copy(“abcd”, 1, 3) returns the String “bc” 
	* @param currentString
	* @param startPosition
	* @param onePastLastPosition
	* @return
	*/
			
	public static String copy(String currentString, int startPosition, int onePastLastPosition) {
		String subCurrentString = currentString.substring(startPosition, onePastLastPosition);
		
		return subCurrentString;	
	}	
	
	/**cut
			Write a method String cut(String currentString, int  startPosition, int onePastLastPosition).  
			This method returns a String constructed by starting with currentString, 
			and removes the letters starting with startPosition and stopping before onePastLastPosition.  
			For example, cut(“abcd”, 1, 3) returns the String “ad”
	* @param currentString
	* @param startPosition
	* @param onePastLastPosition
	* @return
	*/
	
	public static String cut(String currentString, int startPosition, int onePastLastPosition) {

		String currentStringRemoved = currentString.substring(startPosition, onePastLastPosition - 1);
		String truncateCurrentString = currentString.replace(currentStringRemoved, "");
		
		return truncateCurrentString;
	}	
	
	/**paste
			Write a method String paste(String currentString, int insertBefore, String stringToInsert).  
			This method returns the String constructed by inserting stringToInsert into currentString before position insertBefore.  
			For example, paste(“ad”, 1, “bc”) returns the String “abcd” 
			
	* @param currentString
	* @param insertBefore
	* @param stringToInsert
	* @return
	*/
	
	public static String paste(String currentString, int insertBefore, String stringToInsert) {
		StringBuilder insertToCurrentString = new StringBuilder(currentString);
		String currentStringInserted = insertToCurrentString.insert(insertBefore, stringToInsert).toString();
		
		return currentStringInserted;		
	}

}
