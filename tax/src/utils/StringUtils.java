package utils;

public class StringUtils 
{
	private StringUtils() {
		
	}
	
	public static String[] split(String expression, char splitChar) {
		int size = 1;
		
		for (int i = 0; i < expression.length(); i++) {
			String character = expression.substring(i, i + 1);
			if (character != null && character.equals("" + splitChar)) {
				size++;
			}
		}
		
		String[] result = new String[size];
		String runningString = "";
		int index = 0;
		for (int i = 0; i < expression.length(); i++) {
			String character = expression.substring(i, i + 1);
			if (character != null && character.equals("" + splitChar)) {
				result[index] = runningString;
				runningString = "";
				index++;
			} else {
				runningString += character;
			}
		}
		
		return result;
	}
	
	public static String removeCharacter(char removeThis, String fromThis) {
		String result = "";
		for (int i = 0; i < fromThis.length(); i++) {
			String character = fromThis.substring(i, i + 1);
			if (character != null && !character.equals("" + removeThis)) {
				result += character;
			}
		}
		
		return result;
	}
}
