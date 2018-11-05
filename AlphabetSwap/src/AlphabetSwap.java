public class AlphabetSwap {
	public static void main(String[] args) {
		AlphabetSwap alphabetObj = new AlphabetSwap();
		System.out.println(alphabetObj.replaceLetterWithPosition("This NETbuilder assessment is way too easy."));
		
		
	}
	public String replaceLetterWithPosition(String inputted){
		String uppercase = inputted.toUpperCase();
		String output = "";
		int currentChar;
		for (int i = 0; i != uppercase.length(); i++) {
			currentChar = Character.codePointAt(uppercase, i);
		    if (currentChar >=65 && currentChar <=90) {
		    	output += (currentChar-64) + " ";
		    }
		}
		return output;
	}
}