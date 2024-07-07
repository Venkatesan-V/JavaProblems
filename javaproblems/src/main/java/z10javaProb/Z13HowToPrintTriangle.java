package z10javaProb;

import java.util.Scanner;

public class Z13HowToPrintTriangle {

	public void usingStar() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number of lines :");
		int numberOfLines=scanner.nextInt();
		int row,column;
		
		for(row=0;row<numberOfLines;row++) {
			for(column=0;column<=row;column++) {
				System.out.print("* ");
			}
			System.out.println("* ");
		}
	}
	
	public void usingNumber() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int startNumber=1;
		int limit;
		limit=scanner.nextInt();
		int row, column;
		
		for(row=0; row<limit;row++) {
			for (column=0; column<=row;column++) {
				System.out.print(startNumber+" ");
				startNumber=startNumber+1;
			}
			System.out.println();
		}
	}
			
	public static void main(String[] args) {
		Z13HowToPrintTriangle triangle= new Z13HowToPrintTriangle();
		triangle.usingNumber();
		
	}
}
