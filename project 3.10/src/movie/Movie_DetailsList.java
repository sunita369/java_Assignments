package movie;
import java.util.*;

public class Movie_DetailsList {
	static Set<Movie_Details>mv =new TreeSet<Movie_Details>(new MovieNameComparator());
	static Movie_Details m1=new Movie_Details("Kal Ho Na Ho","Shahrukh Khan","Prity Zinta","Tragedy");
	static Movie_Details m2=new Movie_Details("Table No 21","Rajeev Khandelwal", "Tina Desai","Thriller");
	static Movie_Details m3=new Movie_Details("Ek Villain","Siddharth Malhotra","Shraddha Kapoor","Romantic Thriller");
	static Movie_Details m4=new Movie_Details("Saathiya","Vivek Oberoi","Rani Mukherjee","Romantic");
	
	
	public static void add_movie() {
		mv.add(m1);
		mv.add(m2);
		mv.add(m3);
		mv.add(m4);
		System.out.println("Movies Added:");
		for(Movie_Details m:mv) {
			System.out.println("Movie name: "+m.getMov_Name()+"Lead Actor Name:"+m.lead_actor+"Lead Actress Name:"+m.lead_actress+"Genre"+m.genre);
		}
	}
	public static void remove_movie() {
		mv.remove(m2);
		System.out.println(m2.mov_Name+"Movie details removed");
		}
	public static void remove_moviesAll() {
		mv.removeAll(mv);
		System.out.println("All Movie Details are Removed");
	}
	public static void remove_movie_by_mov_name(String n) {
		for(Movie_Details m:mv) {
			if(n.equalsIgnoreCase(m.mov_Name)) {
				System.out.println("Movie Name: "+m.mov_Name+"Lead Actor Name: "+m.lead_actor+"Lead Actress Name: "+m.lead_actress+"Genre"+m.genre+":");
			}
		}
		
	}
	public static void find_movie_by_movie_genre(String g) {
		for(Movie_Details m:mv) {
			if(g.equalsIgnoreCase(m.genre)) {
				System.out.println("Movie Name: "+m.mov_Name+"Lead Actor Name: "+m.lead_actor+"Lead Actress Name: "+m.lead_actress+"Genre"+m.genre+":");
			}
		}
	}
	public static void sortmov(String sort) {
		if(sort.equalsIgnoreCase("Movie Name: ")) {
			Set<Movie_Details>mvname = new TreeSet<Movie_Details>(new MovieNameComparator());
			Movie_Details mn1 = new Movie_Details("Kal Ho Na Ho","Shahrukh Khan","Prity Zinta","Tragedy");
			Movie_Details mn2 = new Movie_Details("Table No 21","Rajeev Khandelwal", "Tina Desai","Thriller");
			Movie_Details mn3 = new Movie_Details("Ek Villain","Siddharth Malhotra","Shraddha Kapoor","Romantic Thriller");
			Movie_Details mn4 = new Movie_Details("Saathiya","Vivek Oberoi","Rani Mukherjee","Romantic");
			mvname.add(mn1);
			mvname.add(mn2);
			mvname.add(mn3);
			mvname.add(mn4);
			System.out.println("Movies Added:");
			for(Movie_Details mn:mvname) {
				System.out.println("Movie Name: "+mn.mov_Name+"Lead Actor Name: "+mn.lead_actor+"Lead Actress Name: "+mn.lead_actress+"Genre"+mn.genre+":");
		}

		}
		else if(sort.equalsIgnoreCase("Actor Name: ")) {
			Set<Movie_Details>mvactor = new TreeSet<Movie_Details>(new ActorComparator());
			Movie_Details ma1 = new Movie_Details("Kal Ho Na Ho","Shahrukh Khan","Prity Zinta","Tragedy");
			Movie_Details ma2 = new Movie_Details("Table No 21","Rajeev Khandelwal", "Tina Desai","Thriller");
			Movie_Details ma3 = new Movie_Details("Ek Villain","Siddharth Malhotra","Shraddha Kapoor","Romantic Thriller");
			Movie_Details ma4 = new Movie_Details("Saathiya","Vivek Oberoi","Rani Mukherjee","Romantic");
			mvactor.add(ma1);
			mvactor.add(ma2);
			mvactor.add(ma3);
			mvactor.add(ma4);
			System.out.println("Movies Added:");
			for(Movie_Details ma:mvactor) {
				System.out.println("Movie Name: "+ma.mov_Name+"Lead Actor Name: "+ma.lead_actor+"Lead Actress Name: "+ma.lead_actress+"Genre"+ma.genre+":");
		}

		}
		else if(sort.equalsIgnoreCase("Actress Name: ")) {
			Set<Movie_Details>mvactress = new TreeSet<Movie_Details>(new ActressComparator());
			Movie_Details maa1 = new Movie_Details("Kal Ho Na Ho","Shahrukh Khan","Prity Zinta","Tragedy");
			Movie_Details maa2 = new Movie_Details("Table No 21","Rajeev Khandelwal", "Tina Desai","Thriller");
			Movie_Details maa3 = new Movie_Details("Ek Villain","Siddharth Malhotra","Shraddha Kapoor","Romantic Thriller");
			Movie_Details maa4 = new Movie_Details("Saathiya","Vivek Oberoi","Rani Mukherjee","Romantic");
			mvactress.add(maa1);
			mvactress.add(maa2);
			mvactress.add(maa3);
			mvactress.add(maa4);
			System.out.println("Movies Added:");
			for(Movie_Details maa:mvactress) {
				System.out.println("Movie Name: "+maa.mov_Name+"Lead Actor Name: "+maa.lead_actor+"Lead Actress Name: "+maa.lead_actress+"Genre"+maa.genre+":");
		}

		}
		else if(sort.equalsIgnoreCase("Genre: ")) {
			Set<Movie_Details>mvg = new TreeSet<Movie_Details>(new GenreComparator());
			Movie_Details g1 = new Movie_Details("Kal Ho Na Ho","Shahrukh Khan","Prity Zinta","Tragedy");
			Movie_Details g2 = new Movie_Details("Table No 21","Rajeev Khandelwal", "Tina Desai","Thriller");
			Movie_Details g3 = new Movie_Details("Ek Villain","Siddharth Malhotra","Shraddha Kapoor","Romantic Thriller");
			Movie_Details g4 = new Movie_Details("Saathiya","Vivek Oberoi","Rani Mukherjee","Romantic");
			mvg.add(g1);
			mvg.add(g2);
			mvg.add(g3);
			mvg.add(g4);
			System.out.println("Movies Added:");
			for(Movie_Details g:mvg) {
				System.out.println("Movie Name: "+g.mov_Name+"Lead Actor Name: "+g.lead_actor+"Lead Actress Name: "+g.lead_actress+"Genre"+g.genre+":");
		}

		}
	}
		public static void main(String [] args) {
			add_movie();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the movie name you want to find: ");
			String name= sc.nextLine();
			remove_movie_by_mov_name(name);
			System.out.println("Enter the movie genre you want to find: ");
			String genre=sc.nextLine();
			find_movie_by_movie_genre(genre);
			System.out.println("Enter on the basis you want to sort: ");
			String s=sc.nextLine();
			sortmov(s);
			remove_movie();
			remove_moviesAll();
	}
}

























