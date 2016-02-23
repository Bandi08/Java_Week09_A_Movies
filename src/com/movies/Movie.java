package com.movies;

import java.util.ArrayList;
import java.util.List;

public class Movie 
{
	String title;
	Genre genre;
	long duration;
	double rate;
	List<Person> cast;

    public Movie(String title, Genre genre, long duration, double rate) 
    {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.rate = rate;
        this.cast = new ArrayList<Person>();
    }
    public String getTitle() 
    {
		return title;
	}
	public void setTitle(String title) 
	{
		this.title = title;
	}
	public Genre getGenre() 
	{
		return genre;
	}
	public void setGenre(Genre genre) 
	{
		this.genre = genre;
	}
	public long getDuration() 
	{
		return duration;
	}
	public void setDuration(long duration) 
	{
		this.duration = duration;
	}
	public double getRate() 
	{
		return rate;
	}
	public void setRate(double rate) 
	{
		this.rate = rate;
	}
	public List<Person> getCast() 
	{
		return cast;
	}
	public void setCast(List<Person> cast) {
		this.cast = cast;
	}
    public String toXMLString()
    {
        String result =  "<Movie>"
                        + "<Title>" + this.title +"</Title>"
                        + "<Genre>" + this.genre + "</Genre>"
                        + "<Duration>" + this.duration + "</Duration>"
                        + "<Rate>" + this.rate + "</Rate>"
                        + "<Cast>";
        for(Person person:cast)
        {
            result += person.toXMLString();
        }
        result += "</Cast>"+"</Movie>";
        return result;
    }
}