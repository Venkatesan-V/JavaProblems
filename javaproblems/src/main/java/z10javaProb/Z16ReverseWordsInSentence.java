package z10javaProb;

public class Z16ReverseWordsInSentence {

	public static void main(String[] args) {
		
//	Input= Senior Software Tester
//	Output= Tester Software Senior
		
		String given= "Senior Software Tester";
		String reversed="";
		String[] temp= given.split(" ");
		System.out.println(temp.length);
		
		for(int i=temp.length-1;i>=0;i--) {
			reversed=reversed+temp[i]+ " ";
		}
		System.out.println(reversed);
	}
}
