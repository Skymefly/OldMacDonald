class Cow implements Animal 
{     
     //your code here
	private String myType;
	private Strubg mySound;
	public Cow(String Type, String Sound)
	{
		myType= "unknown";
		mySound= "unknown";
	}
	public String getSound() 
	{
		return mySound;
	}
	public String getType() 
	{
		return myType;
	}
}