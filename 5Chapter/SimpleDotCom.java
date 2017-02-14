class SimpleDotCom
{
	int[] locationCells;
	int numOfHits = 0;
	public String checkYourself( String stringGuess )
	{
		int guess = Integer.parseInt( stringGuess );
		String result = "miss";
		
		for ( int cell : locationCells )
		{
			if ( guess == cell )
			{
				result = "hit";
				numOfHits += 1;
				break;
			}
		}
		
		if ( numOfHits == locationCells.length )
		{
			result = "kill";
		}
		
		System.out.println( result );
		return result;
	}
	
	void setLocationCells( int[] locs )
	{
		locationCells = locs;
	}
}