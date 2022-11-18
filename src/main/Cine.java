package main;

public class Cine {

	private int savedMoney;
	private String film;
	
	public Cine() {
		savedMoney=0;
		film="";
	}

	public void openCine(int money) {
		savedMoney=money;
	}
	
	public void selectFilm(String film) {
		this.film=film;
	}

	public void sellTicket(int cost) {
		savedMoney += cost;
	}
	
	public boolean buyFilm(int cost) {
		
		if(cost<savedMoney) {
			savedMoney -= cost;
			return true;
		}else{
			return false;
		}
		
	}
	
	public int closeCine() {
		int aux=savedMoney;
		savedMoney=0;
		film="";
		
		return aux;
	}
	
}
