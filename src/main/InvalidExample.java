package main;

public class InvalidExample {

	public static void main(String[] args) {
		Cine c1 = new Cine();
		Cine c2 = new Cine();
		Cine c3 = new Cine();
		
		c1.openCine(1700);
		c1.selectFilm("Batman: The Dark Knight");
		c1.sellTicket(300);
		c1.openCine(3000);
		
		c2.openCine(2000);
		c2.sellTicket(300);
		
		c3.openCine(200);
		c3.selectFilm("Nemo: Live Action");
		c3.sellTicket(300);
		c3.selectFilm("Nemo2: A new Live Action");
		c3.closeCine();
		c3.openCine(300);
	}
}
