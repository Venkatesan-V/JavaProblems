package z10javaProb;

public class Z19OccurrenceOfACharacter {

	public void usingIteration() {
		String input="Administration";
		char toFind='a';
		int occurrence=0;
//		Convert input to lowercase
		input=input.toLowerCase();
		
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==toFind) {
				occurrence=occurrence+1;
			}
		}
		System.out.println(toFind+" is Present" +" and number of times is " +occurrence);
	}
	
	public void withoutIteration() {
		String inputGiven="Environment";
		char toFind='n';
		inputGiven=inputGiven.toUpperCase();
		String charToFind=Character.toString(toFind).toUpperCase();
		int actualLength = inputGiven.length();
		System.out.println(actualLength);
		inputGiven=inputGiven.replace(charToFind, "");
		int lengthAfterReplacing = inputGiven.length();
		System.out.println(lengthAfterReplacing);
		System.out.println(actualLength-lengthAfterReplacing);
		
	}
	
	public static void main(String[] args) {
		
		Z19OccurrenceOfACharacter occur=new Z19OccurrenceOfACharacter();
		occur.usingIteration();
		occur.withoutIteration();
		
	}
}
