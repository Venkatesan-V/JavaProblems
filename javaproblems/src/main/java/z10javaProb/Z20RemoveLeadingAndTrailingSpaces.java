package z10javaProb;
/*
Using trim
Using Strip (Java 11)
	.strip();
	.stripLeading();
	.stripTrailing();
Using regex
	^[ \t]+ leading
	[ \t]+$ Trailing
	^[ \t]+|[ \t]+$ leading and Trailing

*/
public class Z20RemoveLeadingAndTrailingSpaces {

	public void usingTrim () {
		String name=" venkat ";
		System.out.println(name.trim());
	}

	public void usingRegEx() {
		String name= " Sanvika ";
		System.out.println(name.replaceAll("^[ \t]+", ""));
		System.out.println(name.replaceAll("[ \\t]+$", ""));
		System.out.println(name.replaceAll("^[ \\t]+|[ \\t]+$", ""));
	}
	
	public void usingStrip() {
		String name= " Monisha ";
		System.out.println(name.strip());
		System.out.println(name.stripLeading());
		System.out.println(name.stripTrailing());
	}
	public static void main(String[] args) {
		
		Z20RemoveLeadingAndTrailingSpaces leadTrail=new Z20RemoveLeadingAndTrailingSpaces();
		leadTrail.usingTrim();
		leadTrail.usingRegEx();
		leadTrail.usingStrip();
				
	}
}
