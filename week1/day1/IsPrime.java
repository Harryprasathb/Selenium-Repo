package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		
		int number = 99;
		int isPrime = 1;
		
		for(int i =2 ; i<number-1; i++) {
			
			if(number%i==0) {
				
				isPrime = 0;
				
				break;
			}		
		}
		if (isPrime == 1) {
			
			System.out.println("The number " + number+ " is a prime number");
		
		} else {
		
			System.out.println("The number " + number + " is not a prime number");
		
		}

	}
	
}

