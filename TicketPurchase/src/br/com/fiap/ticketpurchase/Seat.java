package br.com.fiap.ticketpurchase;

public class Seat {
	private int id;
	private String location;
	
	public Seat(int id, String location) {
		this.id = id;
		this.location = location;

	}
	
	public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }
	
    public void setLocation(String location) {
        this.location = location;
    }
    
}
