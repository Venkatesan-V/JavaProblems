package z10javaProb;

public class Z11SwapTwonumbers {

	public void usingThirdVar() {
		int mySal=20;
		int supSal=50;
		System.out.println("Before swap "+ "Mine :"+mySal +" Supervisor :"+supSal);
		int temp=mySal;
		mySal=supSal;
		supSal=temp;
		System.out.println("After swap "+ "Mine :"+mySal +" Supervisor :"+supSal);
	}
	
	public void usingMath() {
		int first=40;
		int second=90;
		System.out.println("Before swap "+ "Mine :"+first +" Supervisor :"+second);
		first=first-second;
		second=first+second;
		first=second-first;
		System.out.println("After swap "+ "Mine :"+first +" Supervisor :"+second);
	}
	
	public void usingMultiplication() {
		int first=15; //No value should be zero
		int second=45;
		System.out.println("Before swap "+ "Mine :"+first +" Supervisor :"+second);
		first=first*second;
		second=first/second;
		first=first/second;
		System.out.println("After swap "+ "Mine :"+first +" Supervisor :"+second);
	}
	public static void main(String[] args) {
		
		Z11SwapTwonumbers calling=new Z11SwapTwonumbers();
		calling.usingThirdVar();
		calling.usingMath();
		calling.usingMultiplication();
		
	}
}
