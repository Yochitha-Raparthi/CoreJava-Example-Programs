package com.studinfo;

public class Movie {
    
	static String theatreName;
	static String theatreLoc;
	String movieName;
	int movieBudget;
	String releaseDate;
	public static void main(String[] args) {
		theatreName="Surya Mahal";
		theatreLoc="Srikakulam";
		System.out.println("1st movie details...");
		Movie m1=new Movie();
		m1.movieName="Irumudi";
		m1.movieBudget=200000000;
		m1.releaseDate="21-8-2026";
		System.out.println("Theatre Name : "+theatreName);
		System.out.println("Theatre Location : "+theatreLoc);
		System.out.println("Movie Name : "+m1.movieName);
		System.out.println("Movie Budget : "+m1.movieBudget);
		System.out.println("Movie Release Date : "+m1.releaseDate);
		
		System.out.println("\n2nd movie details...");
		Movie m2=new Movie();
		m2.movieName="Toxic";
		m2.movieBudget=2000000000;
		m2.releaseDate="25-8-2026";
		System.out.println("Theatre Name : "+theatreName);
		System.out.println("Theatre Location : "+theatreLoc);
		System.out.println("Movie Name : "+m2.movieName);
		System.out.println("Movie Budget : "+m2.movieBudget);
		System.out.println("Movie Release Date : "+m2.releaseDate);
		
		System.out.println("\n3rd movie details...");
		Movie m3=new Movie();
		m3.movieName="Vishwanath & sons";
		m3.movieBudget=300000000;
		m3.releaseDate="18-8-2026";
		System.out.println("Theatre Name : "+theatreName);
		System.out.println("Theatre Location : "+theatreLoc);
		System.out.println("Movie Name : "+m3.movieName);
		System.out.println("Movie Budget : "+m3.movieBudget);
		System.out.println("Movie Release Date : "+m3.releaseDate);
		
		System.out.println("\n4rth movie details...");
		Movie m4=new Movie();
		m4.movieName="Chennai Love Story";
		m4.movieBudget=100000000;
		m4.releaseDate="1-8-2026";
		System.out.println("Theatre Name : "+theatreName);
		System.out.println("Theatre Location : "+theatreLoc);
		System.out.println("Movie Name : "+m4.movieName);
		System.out.println("Movie Budget : "+m4.movieBudget);
		System.out.println("Movie Release Date : "+m4.releaseDate);
		
		
		System.out.println("\n 5th movie details...");
		Movie m5=new Movie();
		m5.movieName="Korean Kanaka Raju";
		m5.movieBudget=1000000000;
		m5.releaseDate="21-7-2026";
		System.out.println("Theatre Name : "+theatreName);
		System.out.println("Theatre Location : "+theatreLoc);
		System.out.println("Movie Name : "+m5.movieName);
		System.out.println("Movie Budget : "+m5.movieBudget);
		System.out.println("Movie Release Date : "+m5.releaseDate);
	   
	}

}
