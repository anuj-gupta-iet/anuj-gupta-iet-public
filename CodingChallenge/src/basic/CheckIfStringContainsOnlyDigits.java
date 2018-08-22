package basic;


public class CheckIfStringContainsOnlyDigits {
	public static void main(String[] args) {
		String str = "01234343";
		str = str.replaceAll("\\d", "");
		if(str.length()>0){
			System.out.println("String doesnt contain all digits");
		} else {
			System.out.println("String contain all digits");
		}
	}
}
