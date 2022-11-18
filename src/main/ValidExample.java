package main;

public class ValidExample {
	
	public static void main(String[] args) {
		Cine c = new Cine();
		
		c.openCine(1700);
		c.selectFilm("Batman: The Dark Knight");
		c.sellTicket(300);
		c.buyFilm(2000);
		c.selectFilm("Nemo: Live Action");
		c.sellTicket(200);
		c.sellTicket(200);
		c.sellTicket(200);
		c.closeCine();
	}
	
	
	

}
