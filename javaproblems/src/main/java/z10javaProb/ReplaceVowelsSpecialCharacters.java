package z10javaProb;

public class ReplaceVowelsSpecialCharacters {

	public void usingMethod1() {
		String given= "i am an Indian";
		char[] charArray = given.toCharArray();
		for(int i=0; i<charArray.length;i++) {
			if (charArray[i]=='A'||charArray[i]=='E'||charArray[i]=='I'||charArray[i]=='O'||charArray[i]=='U'||
				charArray[i]=='a'||charArray[i]=='e'||charArray[i]=='i'||charArray[i]=='o'||charArray[i]=='u'
					) {
				charArray[i]='*';
			}
		}
		for(int i=0;i<charArray.length;i++) {
			System.out.print(charArray[i]);
		}
	}
	
	public void usingReplace() {
		String given= "i am an Automation tester";
		String replacedText = given.replaceAll("[AEIOUaeiou]", "\\$");
		System.out.print(replacedText);
	}
	
	public static void main(String[] args) {
		ReplaceVowelsSpecialCharacters replaceVow= new ReplaceVowelsSpecialCharacters();
		replaceVow.usingMethod1();
		System.out.println("--------------");
		replaceVow.usingReplace();
		
		
		
	}
}
