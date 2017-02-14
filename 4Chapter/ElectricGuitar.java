class ElectricGuitar
{
	String brand;
	int numOfPickups;
	boolean rockStarUsesIt;
	
	// brand
	String getBrand()
	{
		return brand;
	}
	
	void setBrand( String aBrand )
	{
		brand = aBrand;
	}
	
	// numOfPickups
	int getNumOfPickups()
	{
		return numOfPickups;
	}
	
	void setNumOfPickups( int num )
	{
		numOfPickups = num;
	}
	
	// rockStarUsesIt
	boolean getRockStarUsesIt()
	{
		return rockStarUsesIt;
	}
	
	void setRockStarUsesIt( boolean yesOrNo )
	{
		rockStarUsesIt = yesOrNo;
	}
}