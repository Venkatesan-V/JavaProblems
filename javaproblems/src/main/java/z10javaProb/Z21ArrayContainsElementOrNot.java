package z10javaProb;

import java.util.stream.IntStream;

public class Z21ArrayContainsElementOrNot {

	int[] array = {1,5,3,7,9};
	int numberToFind=6;
	boolean found=false;

	public void presentOrNot () {
		for(int number:array) {
			if(number==numberToFind) {
				found=true;
				break;
			}
		}
		if(found) {
			System.out.println("Number present in the array");
		} else {
			System.out.println("Number not present");
		}
	}
//	Using Java-8
	public void usingIntStream() {
		boolean found= IntStream.of(array).anyMatch(element->element==numberToFind);
		if(found) {
			System.out.println("Number present in the array");
		} else {
			System.out.println("Number not present");
		}
	}
	
	
	
	public static void main(String[] args) {

		Z21ArrayContainsElementOrNot num=new Z21ArrayContainsElementOrNot();
//		num.presentOrNot();
		num.usingIntStream();


	}
}
