package z10javaProb;

import java.util.Scanner;

public class Z18FindPositionOfAlphabet {

//	To find the position of the given english alphabet
	Scanner scanner=new Scanner(System.in);
	
	public void lowerCase() {
//		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your character :");
		char givenChar = scanner.next().charAt(0);
		givenChar=Character.toLowerCase(givenChar);
		int asciiValue=(int)givenChar;
		System.out.println("My ASCII value is " +asciiValue);
		int position=asciiValue-96;
		System.out.println(position);
	}
	public void upperCase() {
//		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your character :");
		char givenChar = scanner.next().charAt(0);
		givenChar=Character.toUpperCase(givenChar);
		int asciiValues=(int)givenChar;
		System.out.println("My ASCII value is " +asciiValues);
		int positions=asciiValues-64;
		System.out.println(positions);
	}
	public static void main(String[] args) {
		
		Z18FindPositionOfAlphabet pos=new Z18FindPositionOfAlphabet();
		pos.lowerCase();
		pos.upperCase();
		
	}
}
