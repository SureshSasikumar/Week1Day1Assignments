package week1.day1;

public class NegativeToPositive {
	public static void main(String[] args) {
		int number =-40;
		int positive;
		
		if (number<0) {
			
			positive =number*(-1);
			System.out.println("The number -40 is converted to:"+ positive );
		
		}
		else {
			System.out.println("the given number is already in positive");

		}
			
	}

}
