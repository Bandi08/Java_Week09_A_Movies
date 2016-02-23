## First Java XML practice 

The tasks were the followings:
* Movies have title, genre, duration (in minutes), rate and a list (java.util.List) of actresses/actors (called cast) who are persons. Persons have firstname, lastname, gender and two flags (boolean type property) if the current person has already won the Oscar and if the current person has already won the Golden Globe
* Gender of a Person and Genre of a Movie are both enums (<-hint; Gender: MALE or FEMALE, Genre: ROMANTIC, DRAMA, SCI_FI, THRILLER, HORROR, etc.)
* Both Movie and Person classes have to have a public method toXMLString(), which creates an xml like String from the properties set in the current object and returns with it, e.g. attachment: movies.xml
* Tools class contains only static methods. Tools class should contain a method (countMoviesPerPerson) which gets a List of Movies and returns with a java.util.HashMap where the keys are the Persons in the Movies and the values mean the quantity how many movies they are starred in.
* Tools class should contain a method, called getMovieTitles(), what gets a List of Movies as a parameter and returns with an array of Strings which contains the title of each movies.
* Tools class should contain a method, called toXMLTag(), which gets a tagName (String) and a value (String) parameters and creates an XML-tag-like String and returns with it. (e.g. toXMLTag("myTag", "myValue") => <myTag>myValue</myTag>)
* Create a MovieManager class which contains the main method ! In the main method instantiate some Persons, Movies with demo data and write the movies to a file in XML format. The path and the name of the file should be stored in a "constant" variable (static final)

This is the UML model of the project:

![Movies_UML](movies_uml.jpg)