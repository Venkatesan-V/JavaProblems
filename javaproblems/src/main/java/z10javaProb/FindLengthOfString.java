package z10javaProb;

public class FindLengthOfString {

	public static void main(String[] args) {
		
//	Find length of the String without using length property
		
		String givenString= "Economics";
		char[] charArray = givenString.toCharArray();
		
		int length=0;
		
		for(char ch: charArray) {
			length++;
		}
		System.out.println(length);
	}
}
