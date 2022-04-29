package br.com.fiap.ticketpurchase;

public class Bus {
	private int id;
	private String route;
	private String model;
	
	public Bus(int id, String route, String model) {
		this.id = id;
		this.route = route;
		this.model = model;
	}
	
	public int getId() {
        return id;
    }


    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
	
}

