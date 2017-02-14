class Exercise1b
{

	public static void main ( String [] args )
	{
		// part A
		System.out.println( "This is part A:" );
		
		int x = 1;
		
		while( x < 10 )
		{
			x = x + 1;
			if( x > 3 )
			{
				System.out.println( "big x " + x );
			}
		}
		
		// part B
		System.out.println( "This is part B:" );
		
		int y = 5;
		while( y > 1 )
		{
			y = y - 1;
			if( y < 3 )
			{
				System.out.println( "small y " + y  );
			}
		}
		
		// part C
		System.out.println( "This is part C:" );
		
		int z = 5;
		while( z > 1 )
		{
			z = z - 1;
			if( z < 3 )
			{
				System.out.println( "small z " + z );
			}
		}
	}
}