package br.com.fiap.ticketpurchase;

public class BusTicket {
	private int id;
	private double price;
	
	public BusTicket(int id, double price) {
		this.id = id;
		this.price = price;
	}
	
	public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}


