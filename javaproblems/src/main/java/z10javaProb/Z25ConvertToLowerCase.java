package z10javaProb;

public class Z25ConvertToLowerCase {

	public void convertLower() {
		String given="VEnkatESAN";
		char[] charArr = given.toCharArray();
		
		for(int i=0; i<charArr.length;i++) {
			if(charArr[i]>=65 && charArr[i]<=90) {
				charArr[i] = (char) (charArr[i]+32);
			}
		}
		for (int i=0; i<charArr.length;i++) {
			System.out.print(charArr[i]);
			
		}
	}
	
	public void convertUpper() {
		String given="ArchiTecTure";
		char[] charArr = given.toCharArray();
		
		for(int i=0; i<charArr.length;i++) {
			if(charArr[i]>=97 && charArr[i]<=122) {
				charArr[i] = (char) (charArr[i]-32);
			}
		}
		for (int i=0; i<charArr.length;i++) {
			System.out.print(charArr[i]);
			
		}
	}
	public static void main(String[] args) {
		Z25ConvertToLowerCase lowhigh = new Z25ConvertToLowerCase();
		lowhigh.convertLower();
		lowhigh.convertUpper();
	}
}
