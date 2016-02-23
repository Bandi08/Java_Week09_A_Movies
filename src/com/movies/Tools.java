package com.movies;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Tools 
{
	public static String toXMLTag(String tagName, String value) 
	{
		return String.format("<%s>%s</%s>",tagName,value,tagName);
	}
	public static List<String> getMovieTitles(List<Movie> movies) 
	{
        List<String> resultList = new ArrayList<String>();
		for(Movie mov : movies)
		{
            resultList.add(mov.getTitle());
        }
		return resultList;
	}
	
	public static HashMap<Person, Integer> countMoviesPerPerson(List<Movie> movies)
	{
		HashMap<Person, Integer> moviesPerPerson = new HashMap<>();
		
		for(Movie movie : movies)
		{
			for(Person person : movie.cast)
			{
				if(moviesPerPerson.containsKey(person))
				{
					int value = moviesPerPerson.get(person);
					int newValue = value + 1;
					moviesPerPerson.replace(person, (Integer)newValue);
				}
				else 
				{
                    moviesPerPerson.put(person, 1);
                }
			}
		}
		
		return moviesPerPerson;
	}
}