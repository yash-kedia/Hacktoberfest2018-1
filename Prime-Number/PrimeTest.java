import java.util.Scanner;

class PrimeTest
{
   	public static void main(String args[]){		
		int temp;
		boolean isPrime = true;
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Enter a number:");
		//capture the input in an integer
		int num = scanner.nextInt();
	    scanner.close();
		
		for(int i = 2; i <= (int)Math.sqrt(num); i++)
		{
	        temp = num%i;
		    if(temp == 0)
		    {
		      	isPrime = false;
		      	break;
		    }
		}
		
		//If isPrime is true then the number is prime else not
		if(isPrime){
		    System.out.println(num + " is a Prime Number");
		}else{
		    System.out.println(num + " is not a Prime Number");
	    }
	}
}