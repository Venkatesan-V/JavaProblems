package z10javaProb;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSmallestNumberInAnArray {

	Integer givenArr[]= {21, 10, 15, 35, 9, 80};

	public void findSmallest() {
		int smallest=Integer.MAX_VALUE;

		for(int i=0; i<givenArr.length;i++) {
			if(givenArr[i]<smallest) {
				smallest=givenArr[i];
			}
		}
		System.out.println("Smallest number is "+smallest);
	}
	
	public void usingArrays() {
		Arrays.sort(givenArr);
		System.out.println(givenArr[0]);
	}

	public void usingCollections() {
		List<Integer> asList = Arrays.asList(givenArr);
		Collections.sort(asList);
		int smallest=asList.get(0);
		System.out.println(smallest);
	}
	public static void main(String[] args) {

		FindSmallestNumberInAnArray small=new FindSmallestNumberInAnArray();
//		small.findSmallest();
//		small.usingArrays();
		small.usingCollections();

	}
}
