package ForLoops;
class ReverseNumber 
{
	public static void main(String[] args) 
	{
		int n = 4587; 
		int temp = n;
		
		int reverse = 0;
		
		for ( ; temp > 0; )
		{
			int lastDigit = temp % 10;
			reverse = reverse * 10 + lastDigit;
			temp /= 10;
			
		}
		System.out.println("Reverse number is : " + reverse);
	}

}
