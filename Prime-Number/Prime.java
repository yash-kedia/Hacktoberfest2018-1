class Prime
{
	public static void main(String[] ar)
	{
		System.out.println(prime(10));
		System.out.println(prime(101));
		System.out.println(prime(1011));
	}
	public static boolean prime(int num)
	{
		for(int i=2;i<=(int)Math.sqrt(num);i++)
			if(num%i==0)
				return false;
		return true;
	}
}