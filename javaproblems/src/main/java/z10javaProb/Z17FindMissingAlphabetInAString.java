package z10javaProb;

import java.util.Arrays;
import java.util.HashSet;

public class Z17FindMissingAlphabetInAString {

	public static void main(String[] args) {
		
		String given="abcd";
		given = given.toLowerCase();
		given.replaceAll(" ", "");
		String[] userArray = given.split("");
		System.out.println(given);
		
		String[] alphabets = "abcdefghijklmnopqrstuvwxyz".split("");
		
		HashSet<String> set1=new HashSet<String>(Arrays.asList(userArray));
		HashSet<String> set2=new HashSet<String>(Arrays.asList(alphabets));
		
		set2.removeAll(set1);
		System.out.println(set2);
		
	}
}
