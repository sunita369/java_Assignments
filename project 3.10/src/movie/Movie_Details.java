package movie;

import java.util.Comparator;
public class Movie_Details implements Comparable<Movie_Details> {
	
	String mov_Name;
	String lead_actor;
	String lead_actress;
	String genre;
	
	public String getMov_Name() {
		return mov_Name;
	}
	public void setMov_Name(String mov_Name) {
		this.mov_Name = mov_Name;
	}
	public String getLead_actor() {
		return lead_actor;
	}
	public void setLead_actor(String lead_actor) {
		this.lead_actor =lead_actor;
	}
	public String getLead_actress() {
		return lead_actress;
	}
	public void setLead_actress(String lead_actress) {
		this.lead_actress =lead_actress;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre =genre;
	}
	public Movie_Details(String mov_Name,String lead_actor, String lead_actress , String genre) {
		super();
		this.mov_Name = mov_Name;
		this.lead_actor = lead_actor;
		this.lead_actress = lead_actress;
		this.genre = genre;
	}
	@Override
	public int compareTo(Movie_Details o) {
		return 0;
	}
}
class MovieNameComparator implements Comparator<Movie_Details>{
	@Override
	public int compare(Movie_Details m1, Movie_Details m2) {
		return m1.getMov_Name().compareTo(m2.getMov_Name());
	}
}
class ActorComparator implements Comparator<Movie_Details>{
	@Override
	public int compare(Movie_Details m1, Movie_Details m2) {
		return m1.getLead_actor().compareTo(m2.getLead_actor());
	}
}
class ActressComparator implements Comparator<Movie_Details>{
	@Override
	public int compare(Movie_Details m1, Movie_Details m2) {
		return m1.getLead_actress().compareTo(m2.getLead_actress());
	}
}	
class GenreComparator implements Comparator<Movie_Details>{
	@Override
	public int compare(Movie_Details m1, Movie_Details m2) {
		return m1.getGenre().compareTo(m2.getGenre());
	}
}	
	
	
	
	


