package com.movies;

public class Person 
{
	String firstName;
	String lastName;
	Gender gender;
	boolean hasOscar;
	boolean hasGoldenGlobe;

    public Person(String firstName, String lastName, Gender gender, boolean hasOscar, boolean hasGoldenGlobe) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.hasOscar = hasOscar;
        this.hasGoldenGlobe = hasGoldenGlobe;
    }

    public String getFirstName() 
    {
		return firstName;
	}
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	public String getLastName() 
	{
		return lastName;
	}
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	public Gender getGender() 
	{
		return gender;
	}
	public void setGender(Gender gender) 
	{
		this.gender = gender;
	}
	public boolean isHasOscar() 
	{
		return hasOscar;
	}
	public void setHasOscar(boolean hasOscar) 
	{
		this.hasOscar = hasOscar;
	}
	public boolean isHasGoldenGlobe() 
	{
		return hasGoldenGlobe;
	}
	public void setHasGoldenGlobe(boolean hasGoldenGlobe) 
	{
		this.hasGoldenGlobe = hasGoldenGlobe;
	}
	
	public String toXMLString()
	{
		return "<Person>"
				+ "<FirstName>" + this.firstName +"</FirstName>"
				+ "<LastName>" + this.lastName + "</LastName>"
                + "<Gender>" + this.gender + "</Gender>"
                + "<HasOscar>" + this.hasOscar + "</HasOscar>"
                + "<HasGoldenGlobe>" + this.hasGoldenGlobe + "</HasGoldenGlobe>"
				+ "</Person>";
	}	
}