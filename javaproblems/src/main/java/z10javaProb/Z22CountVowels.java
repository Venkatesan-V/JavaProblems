package z10javaProb;

public class Z22CountVowels {

	public static void main(String[] args) {
		
		String name = "administration";
		int vowelsCount=0;
		name=name.toLowerCase();
		int length = name.length();
		
		for(int i=0; i<length;i++) {
			if (name.charAt(i)=='a' ||
				name.charAt(i)=='e' ||
				name.charAt(i)=='i' ||
				name.charAt(i)=='o' ||
				name.charAt(i)=='u'
					) {
				vowelsCount++;
			}
		}
		System.out.println("Number of vowels is " +vowelsCount);
		
	}
}
